package com.example.administrator.my_newapp.MainActivity;

import android.os.Handler;
import android.widget.Toast;

import com.example.administrator.my_newapp.R;
import com.example.administrator.my_newapp.StartActivity.Lead_Activity;

/**
 * Created by Administrator on 2017/2/27.
 */
public class LogoActivity extends BaseActivity{

    @Override
    public void addLayout() {
        if(get().equals("未安装")) {
            gotoActivity(Lead_Activity.class);
            save();
        }else{
            setContentView(R.layout.logoactivity);
        }
    }

    @Override
    public void initView() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gotoActivity(MainActivity.class);
    }
}
