package com.example.administrator.my_newapp.shoucang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.my_newapp.R;
import com.example.administrator.my_newapp.news_model.PrgressInfo_News;
import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * Created by Administrator on 2017/2/5.
 */
public class MyAdapter_ShouCang extends BaseAdapter {
//    CircleTransform circleTransform;

    private Context context;
    private List<PrgressInfo_News.ResultBean.DataBean> list;
    public MyAdapter_ShouCang(Context context, List<PrgressInfo_News.ResultBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    public void update(){
        notifyDataSetChanged();
    }


    public List<PrgressInfo_News.ResultBean.DataBean> getlist(){
        return list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    //子布局
    //layoutInflater协调者
    //inflate 加载
    class ViewHolder {
        TextView tv1;
        TextView tv2;
        TextView tv3;
        TextView tv4;
        ImageView imageView;
    }
    @Override
    public View getView(int position, View view, ViewGroup arg2) {
        ViewHolder holder = null;
        if (view == null) {
            holder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.shoucangmyview, null);
            holder.tv1 = (TextView) view.findViewById(R.id.text1);
            holder.tv2 = (TextView) view.findViewById(R.id.text2);
            holder.tv3 = (TextView) view.findViewById(R.id.text3);
            holder.imageView= (ImageView) view.findViewById(R.id.imgsss);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.tv1.setText(list.get(position).getTitle());
        holder.tv2.setText(list.get(position).getThumbnail_pic_s());
        holder.tv3.setText(list.get(position).getUrl());
        Picasso.with(context)
                .load(list.get(position).getAuthor_name())
                .placeholder(R.drawable.home_ic_me_pre)
                .error(R.mipmap.ic_launcher)
                .resize(400,400)
                .noFade()
                .into(holder.imageView);
        return view;
    }
}
