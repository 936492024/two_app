package com.example.administrator.my_newapp.shoucang;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.administrator.my_newapp.news_model.PrgressInfo_News;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/8.
 */
public class DB_C  {
    PrgressInfo_News.ResultBean.DataBean zz;
    private SQLiteDatabase db;
    public static ArrayList<PrgressInfo_News.ResultBean.DataBean> list1=new ArrayList<>();
    ArrayList<PrgressInfo_News.ResultBean.DataBean> list= new ArrayList<>();
    public DB_C(Context context) {
        db = new DB_Manager(context).getWritableDatabase();
    }
    //删除
    public void deleteAll(String title) {
        Log.e("msg",title);
                String sql = "delete from  info  where title='" + title+ "'";
                db.execSQL(sql);
    }
    //查看
    public ArrayList<PrgressInfo_News.ResultBean.DataBean> showAll() {
        String sql = "select * from info" ;
        Cursor cursor = db.rawQuery(sql, null);
        while (cursor.moveToNext()) {
            String url = cursor.getString(cursor.getColumnIndex("url"));
            String title = cursor.getString(cursor.getColumnIndex("title"));
            String tupian = cursor.getString(cursor.getColumnIndex("tupian"));
            String laiyuanname = cursor.getString(cursor.getColumnIndex("laiyuanname"));

            list.add(new PrgressInfo_News.ResultBean.DataBean(url, title, tupian, laiyuanname));
            Log.e("msg",list.toString());
        }
        cursor.close();
        return list;
    }

    public ArrayList<PrgressInfo_News.ResultBean.DataBean> getlist(){
        return list;
    }
}
