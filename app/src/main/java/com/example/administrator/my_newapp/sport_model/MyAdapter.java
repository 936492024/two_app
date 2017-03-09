package com.example.administrator.my_newapp.sport_model;





import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


/**
 * Created by Administrator on 2017/2/28.
 */
public class MyAdapter  extends FragmentPagerAdapter {
    ArrayList<Fragment> arrayList;
    private String[] names;
    public MyAdapter(FragmentManager fm, ArrayList<Fragment> arrayList,String[] names) {
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

