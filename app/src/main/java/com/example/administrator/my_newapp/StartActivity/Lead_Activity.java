package com.example.administrator.my_newapp.StartActivity;

/**
 * Created by Administrator on 2017/2/27.
 */
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.administrator.my_newapp.MainActivity.BaseActivity;
import com.example.administrator.my_newapp.MainActivity.LogoActivity;
import com.example.administrator.my_newapp.R;


/**
 * Created by Zhang on 2017/2/5.
 */
public class Lead_Activity extends BaseActivity {
    ViewPager viewPager;
    private ImageView imageView;
    int positions;
    //    Button[] btn=new Button[3];
    @Override
    public void addLayout() {
        setContentView(R.layout.lead_start);
    }

    @Override
    public void initView() {
        viewPager= (ViewPager) findViewById(R.id.viewpager);
        imageView=(ImageView) findViewById(R.id.lijitiyan);
//        btn[0]= (Button) findViewById(R.id.t1);
//        btn[1]= (Button) findViewById(R.id.t2);
//        btn[2]= (Button) findViewById(R.id.t3);


        //数据源图片
        ImageView[] views=new ImageView[3];
        for(int i=0;i<views.length;i++){
            views[i]=new ImageView(this);
        }
        views[0].setBackgroundResource(R.drawable.c_lead);
        views[1].setBackgroundResource(R.drawable.d_lead);
        views[2].setBackgroundResource(R.drawable.g_lead);


        viewPager.setAdapter(new Lead_Adapter(views));




        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                positions=position;
                if(positions==2){
                    imageView.setImageResource(R.drawable.launcher_bt_normal);
                }
//                for(int i=0;i<btn.length;i++){
//                    if(i==position) {
//                        btn[i].setBackgroundColor((0xff00ff));
//                    }else{
//
//                        btn[i].setBackgroundColor(0xff00ff);
//                    }
//                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager.setOnTouchListener(new View.OnTouchListener() {
            float startX;
            float endX;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        startX=event.getX();
                        break;
                    case MotionEvent.ACTION_UP:
                        endX=event.getX();
                        WindowManager windowManager= (WindowManager)
                        getApplicationContext().getSystemService(Context.WINDOW_SERVICE);

                        //首先要确定的是，是否到了最后一页，然后判断是否向左滑动，并且滑动距离是否符合，我这里的判断距离是屏幕宽度的4分之一（这里可以适当控制）
                        if(positions==2) {
                            imageView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    gotoActivity(LogoActivity.class);//进入主页
                                    finish();
                                }
                            });
                        }
                        break;
                }
                return false;
            }
        });
    }
}
