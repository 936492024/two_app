package com.example.administrator.my_newapp.MainActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public abstract class BaseActivity extends AppCompatActivity {
    private SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sp=this.getSharedPreferences("test",Activity.MODE_WORLD_READABLE);
        addLayout();
        initView();
        get();

    }
    //加载布局的方法
    public abstract  void addLayout();
    //findviewbyid控件初始化方法
    public abstract void initView() ;



    public void gotoActivity(Class<?> activity) {//跳转
        Intent intent = new Intent(this,activity);
        startActivity(intent);
    }

    public String get(){
        String str = sp.getString("one","未安装");
        return str;
    }
    public void save(){
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("one","已安装");
        editor.commit();
    }
}