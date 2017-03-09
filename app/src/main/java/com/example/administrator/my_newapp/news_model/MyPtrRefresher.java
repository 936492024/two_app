package com.example.administrator.my_newapp.news_model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.example.administrator.my_newapp.R;

/**
 * Created by Administrator on 2017/3/5.
 */
public class MyPtrRefresher extends LinearLayout {
    public MyPtrRefresher(Context context) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.view_ptrpefresher, this);
    }

    public MyPtrRefresher(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        LayoutInflater.from(context).inflate(R.layout.view_ptrpefresher, this);
    }

    public MyPtrRefresher(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.view_ptrpefresher, this);
    }
}
