package com.example.administrator.my_newapp.MainActivity;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;


import com.example.administrator.my_newapp.R;
import com.example.administrator.my_newapp.shoucang.Fragment_five;
import com.example.administrator.my_newapp.fragment.Fragment_four;
import com.example.administrator.my_newapp.sport_model.Fragment_one;
import com.example.administrator.my_newapp.fragment.Fragment_three;
import com.example.administrator.my_newapp.news_model.Fragment_two;


public class MainActivity extends BaseActivity {
     private FragmentManager fragmentManager;
     private FragmentTransaction Transaction;
    private LinearLayout Linearlayout1,Linearlayout2,Linearlayout3,Linearlayout4,Linearlayout5;
    private  int nowcount;
    private Fragment[] fragments = new Fragment[5];
    private ImageView imageView1,imageView2,imageView3,imageView4,imageView5;
    @Override
    public void addLayout() {
         setContentView(R.layout.activity_main);
    }

    @Override
    public void initView() {
        find_id();
        fragmentManager=getSupportFragmentManager();
        Transaction=fragmentManager.beginTransaction();
        fragments[0]= new Fragment_one();
        Transaction.add(R.id.mainavtivity_layout,fragments[0]);
        Transaction.commit();
        nowcount=0;
        imageView1.setImageResource(R.drawable.tab_home_pre);


        Linearlayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choose(0);
                imageView1.setImageResource(R.drawable.tab_home_pre);
                imageView2.setImageResource(R.drawable.tab_live_nor);
                imageView3.setImageResource(R.drawable.tab_vip_nor);
                imageView4.setImageResource(R.drawable.tab_community_nor);
                imageView5.setImageResource(R.drawable.tab_discover_nor);
            }
        });
        Linearlayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choose(1);
                imageView2.setImageResource(R.drawable.tab_live_pre);
                imageView1.setImageResource(R.drawable.tab_home_nor);
                imageView3.setImageResource(R.drawable.tab_vip_nor);
                imageView4.setImageResource(R.drawable.tab_community_nor);
                imageView5.setImageResource(R.drawable.tab_discover_nor);
            }
        });
        Linearlayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choose(2);
                imageView1.setImageResource(R.drawable.tab_home_nor);
                imageView2.setImageResource(R.drawable.tab_live_nor);
                imageView3.setImageResource(R.drawable.tab_vip_pre);
                imageView4.setImageResource(R.drawable.tab_community_nor);
                imageView5.setImageResource(R.drawable.tab_discover_nor);

            }
        });
        Linearlayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choose(3);
                imageView1.setImageResource(R.drawable.tab_home_nor);
                imageView2.setImageResource(R.drawable.tab_live_nor);
                imageView3.setImageResource(R.drawable.tab_vip_nor);
                imageView4.setImageResource(R.drawable.tab_community_pre);
                imageView5.setImageResource(R.drawable.tab_discover_nor);
            }
        });
        Linearlayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choose(4);
                imageView1.setImageResource(R.drawable.tab_home_nor);
                imageView2.setImageResource(R.drawable.tab_live_nor);
                imageView3.setImageResource(R.drawable.tab_vip_nor);
                imageView4.setImageResource(R.drawable.tab_community_nor);
                imageView5.setImageResource(R.drawable.tab_discover_pre);

            }
        });




    }

    public void choose(int but_index){
        FragmentTransaction Transaction = fragmentManager.beginTransaction();
        if (nowcount != but_index) {
            if (fragments[but_index] == null) {
                fragments[but_index] = newfragment(but_index);
                Transaction.add(R.id.mainavtivity_layout, fragments[but_index]);

            } else {
                Transaction.show(fragments[but_index]);
            }
            Transaction.hide(fragments[nowcount]);
            Transaction.commit();
            nowcount=but_index;
        }
    }

    public Fragment newfragment(int but_index){
        switch (but_index) {
            case 0:
                return new Fragment_one();
            case 1:
                return new Fragment_two();
            case 2:
                return new Fragment_three();
            case 3:
                return new Fragment_four();
            case 4:
                return new Fragment_five();
        }
        return null;
    }

    public void find_id(){
        Linearlayout1= (LinearLayout) findViewById(R.id.home);
        Linearlayout2= (LinearLayout) findViewById(R.id.live);
        Linearlayout3= (LinearLayout) findViewById(R.id.vip);
        Linearlayout4= (LinearLayout) findViewById(R.id.community);
        Linearlayout5= (LinearLayout) findViewById(R.id.discover);
        imageView1= (ImageView) findViewById(R.id.white_home);
        imageView2= (ImageView) findViewById(R.id.white_live);
        imageView3= (ImageView) findViewById(R.id.white_vip);
        imageView4= (ImageView) findViewById(R.id.white_comunity);
        imageView5= (ImageView) findViewById(R.id.white_discover);


    }

}
