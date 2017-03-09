package com.example.administrator.my_newapp.news_model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.my_newapp.R;
import com.example.administrator.my_newapp.sport_model.ProgressInfo;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Administrator on 2017/3/2.
 */
public class RecyclerAdapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<PrgressInfo_News.ResultBean.DataBean> List ;
    private Context context;


    public RecyclerAdapter2(Context context,List<PrgressInfo_News.ResultBean.DataBean> List){
        this.List=List;
        this.context= context;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view ;
        RecyclerView.ViewHolder holder=null;
        if(viewType==1){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.myview_news1,null);
            holder = new MyViewHolder(view);
        }else if(viewType==2){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.myview_news2,null);
            holder = new MyViewHolder2(view);
        }else{
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.myview_news3,null);
            holder = new MyViewHolder3(view);
        }
        return holder;
    }
    @Override
    public int getItemViewType(int positon){
        if(List.get(positon).getThumbnail_pic_s02()==null&&List.get(positon).getThumbnail_pic_s03()==null) {
            return 1;
        }else if(List.get(positon).getThumbnail_pic_s03()==null){
            return 2;
        }else{
            return 3;
        }
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onItemClicListener!=null) {
                    onItemClicListener.onItemClic(view, position);
                }
            }
        });
        if(holder instanceof  MyViewHolder) {
            MyViewHolder holder1 = (MyViewHolder) holder;
            holder1.textView2title.setText(List.get(position).getTitle());
            holder1.textView3nrirong.setText(List.get(position).getAuthor_name());
            holder1.textView1time.setText(List.get(position).getDate());
            Picasso.with(context)
                    .load(List.get(position).getThumbnail_pic_s())
                    .placeholder(R.mipmap.meimv)
                    .error(R.mipmap.ic_launcher)
                    .noFade()
                    .into(holder1.imageView1);
        }else if(holder instanceof  MyViewHolder2){
            MyViewHolder2 holder2 = (MyViewHolder2) holder;
            holder2.textView1.setText(List.get(position).getDate());
            holder2.textView2.setText(List.get(position).getTitle());
            holder2.textView3.setText(List.get(position).getAuthor_name());
            Picasso.with(context)
                    .load(List.get(position).getThumbnail_pic_s())
                    .placeholder(R.mipmap.meimv)
                    .error(R.mipmap.ic_launcher)
                    .noFade()
                    .into(holder2.imageView1);
            Picasso.with(context)
                    .load(List.get(position).getThumbnail_pic_s02())
                    .placeholder(R.mipmap.meimv)
                    .error(R.mipmap.ic_launcher)
                    .noFade()
                    .into(holder2.imageView2);
        }else{
            MyViewHolder3 holder3 = (MyViewHolder3) holder;
            holder3.textView1.setText(List.get(position).getDate());
            holder3.textView2.setText(List.get(position).getTitle());
            holder3.textView3.setText(List.get(position).getAuthor_name());
            Picasso.with(context)
                    .load(List.get(position).getThumbnail_pic_s())
                    .placeholder(R.mipmap.meimv)
                    .error(R.mipmap.ic_launcher)
                    .noFade()
                    .into(holder3.imageView1);
            Picasso.with(context)
                    .load(List.get(position).getThumbnail_pic_s02())
                    .placeholder(R.mipmap.meimv)
                    .error(R.mipmap.ic_launcher)
                    .noFade()
                    .into(holder3.imageView2);
            Picasso.with(context)
                    .load(List.get(position).getThumbnail_pic_s03())
                    .placeholder(R.mipmap.meimv)
                    .error(R.mipmap.ic_launcher)
                    .noFade()
                    .into(holder3.imageView3);
        }
    }
    @Override
    public int getItemCount() {
        return List.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView1;
        TextView textView1time,textView2title,textView3nrirong,textView4;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView1time= (TextView) itemView.findViewById(R.id.new1_time);
            textView2title= (TextView) itemView.findViewById(R.id.new1_biaoti);
            textView3nrirong= (TextView) itemView.findViewById(R.id.new1_where);
            imageView1=(ImageView) itemView.findViewById(R.id.new1_img1);
        }
    }
    class MyViewHolder2 extends RecyclerView.ViewHolder{
        ImageView imageView1,imageView2;
        TextView textView1,textView2,textView3;
        public MyViewHolder2(View itemView) {
            super(itemView);
            textView1= (TextView) itemView.findViewById(R.id.new2_time);
            textView2= (TextView) itemView.findViewById(R.id.new2_biaoti);
            textView3= (TextView) itemView.findViewById(R.id.new2_where);
            imageView1=(ImageView) itemView.findViewById(R.id.new2_img1);
            imageView2=(ImageView) itemView.findViewById(R.id.new2_img2);
        }
    }
    class MyViewHolder3 extends RecyclerView.ViewHolder{
        ImageView imageView1,imageView2,imageView3;
        TextView textView1,textView2,textView3;
        public MyViewHolder3(View itemView) {
            super(itemView);
            textView1= (TextView) itemView.findViewById(R.id.new3_time);
            textView2= (TextView) itemView.findViewById(R.id.new3_biaoti);
            textView3= (TextView) itemView.findViewById(R.id.new3_where);
            imageView1=(ImageView) itemView.findViewById(R.id.new3_img1);
            imageView2=(ImageView) itemView.findViewById(R.id.new3_img2);
            imageView3=(ImageView) itemView.findViewById(R.id.new3_img3);
        }
    }

    private OnItemClicListener onItemClicListener;
    public void setOnClicListener(OnItemClicListener onItemClicListener){
        this.onItemClicListener = onItemClicListener;
    }
    public  interface OnItemClicListener{
        void onItemClic(View view,int position);
    }
}
