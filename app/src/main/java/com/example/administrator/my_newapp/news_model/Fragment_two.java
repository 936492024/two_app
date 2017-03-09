package com.example.administrator.my_newapp.news_model;

        import android.os.Bundle;
        import android.support.annotation.Nullable;

        import android.support.design.widget.TabLayout;
        import android.support.v4.app.Fragment;
        import android.support.v4.view.ViewPager;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import com.example.administrator.my_newapp.R;
        import com.example.administrator.my_newapp.sport_model.Fragment_Item;
        import java.util.ArrayList;


/**
 * Created by Administrator on 2017/2/27.
 */
public class Fragment_two extends Fragment {
    private ViewPager viewPager;
    private ArrayList<Fragment> arrayList ;
    private MyAdapter2 myAdapter2;
    private TabLayout tabLayout;
    private String[] types ={"热门","体育","社会"};
    private String type[]={"top","tiyu","shehui"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment2,null);
        viewPager= (ViewPager) view.findViewById(R.id.viewpager2);
        tabLayout= (TabLayout) view.findViewById(R.id.table2);
        myAdapter2=new MyAdapter2(getFragmentManager(),getDate(),types);
        viewPager.setAdapter(myAdapter2);
        viewPager.setOffscreenPageLimit(3);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }


    public ArrayList<Fragment> getDate(){
        arrayList=new ArrayList<>();
        Fragment fragment;
        Bundle bundle;
        for(int i=0;i<type.length;i++){
            fragment  = new Fragment_Item2();
            bundle=new Bundle();
            bundle.putString("name",type[i]);
            fragment.setArguments(bundle);
            arrayList.add(fragment);
        }
        return arrayList;
    }



}

