package com.example.administrator.my_newapp.shoucang;


import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.my_newapp.R;
import com.example.administrator.my_newapp.news_model.PrgressInfo_News;
import com.example.administrator.my_newapp.sport_model.MyAdapter;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Fragment_five extends Fragment {
    ListView listView;
    List<PrgressInfo_News.ResultBean.DataBean> list;
    MyAdapter_ShouCang myAdapter;
    DB_C dbc;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shoucang_item, null);
        dbc=new DB_C(getContext());
        list = new LinkedList<>();
        myAdapter = new MyAdapter_ShouCang(getContext(),dbc.showAll());
        myAdapter.update();
        myAdapter.notifyDataSetChanged();
        listView = (ListView) view.findViewById(R.id.listviewss);
        listView.setAdapter(myAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                dbc.deleteAll(dbc.getlist().get(i).getTitle());
                Log.e("msg",dbc.getlist().get(i).getTitle());
                Toast.makeText(getContext(),"删除成功",Toast.LENGTH_SHORT).show();
            }
        });

//        listView.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {
//                switch (index) {
//                    case 0:
//                        // open
//                        Intent intent=new Intent(Web_sc.this,WebActivity.class);
//                        intent.putExtra("url",dbc.getlist().get(position).getUrl());
//                        startActivity(intent);
//                        break;
//                    case 1:
//                        // delete
//
//                        dbc.deleteSq(dbc.getlist().get(position).getBiaoti());
//                        dbc.getlist().remove(position);
//                        wsa.updateAdapter(dbc.getlist());
//
//                        Toast.makeText(Web_sc.this,"删除成功",Toast.LENGTH_SHORT).show();
//                        break;
//                }
//                // false : close the menu; true : not close the menu
//                return false;
//            }
//        });




        return view;
    }


    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Toast.makeText(getContext(),"sss",Toast.LENGTH_SHORT).show();
    }
}
