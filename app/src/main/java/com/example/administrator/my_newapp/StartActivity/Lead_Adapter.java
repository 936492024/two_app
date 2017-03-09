package com.example.administrator.my_newapp.StartActivity;

/**
 * Created by Administrator on 2017/2/27.
 */
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by Administrator on 2017/2/5.
 */
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Zhang on 2017/2/5.
 */
public class Lead_Adapter extends PagerAdapter {
    private ImageView[] views;//数据源传进来
    public Lead_Adapter(ImageView [] views){
        this.views=views;
    }
    @Override
    public int getCount() {
        return views.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }


    //生成你要滑动的这一页
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(views[position]);
        return views[position] ;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(views[position]);
    }
}
