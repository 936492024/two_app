package com.example.administrator.my_newapp.sport_model;


import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import com.example.administrator.my_newapp.R;
import com.example.administrator.my_newapp.sport_model.Fragment_Item;
import com.example.administrator.my_newapp.sport_model.MyAdapter;

import java.util.ArrayList;


/**
 * Created by Administrator on 2017/2/27.
 */
public class Fragment_one extends Fragment {
    private ViewPager viewPager;
    private ArrayList<Fragment> arrayList ;
    private MyAdapter myAdapter;
    private TabLayout tabLayout;
    private String[] type ={"热门","NBA","足球","关注","小片儿"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment1,null);
        viewPager= (ViewPager) view.findViewById(R.id.viewpager);
        tabLayout= (TabLayout) view.findViewById(R.id.table);
        myAdapter=new MyAdapter(getFragmentManager(),getDate(),type);
        viewPager.setAdapter(myAdapter);
        viewPager.setOffscreenPageLimit(5);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }



    public ArrayList<Fragment> getDate(){
        arrayList=new ArrayList<>();
        Fragment fragment;
        Bundle bundle;
        for(int i=0;i<5;i++){
            fragment  = new Fragment_Item();
              arrayList.add(fragment);

//            bundle=new Bundle();
//            bundle.putString("name",type[i]);
//            fragment.setArguments(bundle);
//            arrayList.add(fragment);
        }
        return arrayList;
    }



}
