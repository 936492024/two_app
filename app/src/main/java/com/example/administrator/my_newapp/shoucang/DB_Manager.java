package com.example.administrator.my_newapp.shoucang;

/**
 * Created by Administrator on 2017/2/24.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by NUO on 2017/1/9.
 */

public class DB_Manager extends SQLiteOpenHelper {
    //1.继承了sqliteopenhelper类
    //2.这个类的构造一旦被执行，这个类就可以创建出数据库来

    public DB_Manager(Context context) {
        super(context, "user.db", null, 1);
    }


    //数据库没有的时候会调用这个方法，填充默认数据
    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建表？————》sql语句怎么写？？
        String  table_sql="create table info( _id  integer primary key autoincrement," + " url varchar(8) not null, title varchar(10)," +
                "tupian varchar(10),laiyuanname varchar(10) )";

        db.execSQL(table_sql);//执行创表sql语句

        Log.e("msg","数据库创建了111111111111111111111111");
//         db.insert();//android提供给不会sql语句的人使用的插入数据
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}