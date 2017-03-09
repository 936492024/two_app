package com.example.administrator.my_newapp.news_model;

/**
 * Created by Administrator on 2017/3/1.
 */



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2017/2/28.
 */
public class MyAdapter2  extends FragmentPagerAdapter {
   List<Fragment> arrayList;
    private String[] names;
    public MyAdapter2(FragmentManager fm, List<Fragment> arrayList,String[] names) {
        super(fm);
        this.arrayList=arrayList;
        this.names=names;
    }

    @Override
    public Fragment getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return names[position];
    }
}

