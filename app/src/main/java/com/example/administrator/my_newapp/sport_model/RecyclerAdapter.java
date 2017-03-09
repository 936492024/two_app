package com.example.administrator.my_newapp.sport_model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.my_newapp.R;
import com.example.administrator.my_newapp.sport_model.ProgressInfo;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 2017/3/1.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<ProgressInfo.ResultBean.ListBean> List ;
    private Context context;



    public RecyclerAdapter(Context context,List<ProgressInfo.ResultBean.ListBean> List){
        this.List=List;
        this.context= context;

    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view ;
        RecyclerView.ViewHolder holder=null;
        if(viewType==1){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.myview1,null);
            holder = new MyViewHolder(view);
        }else if(viewType==2){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.myview2,null);
            holder = new MyViewHolder(view);
        }else{
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.myview3,null);
            holder = new MyViewHolder2(view);
        }

        return holder;
    }
    @Override
    public int getItemViewType(int positon){
        if(positon%3==0) {
            return 1;
        }else if(positon%3==1){
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
            holder1.textView1.setText(List.get(position).getTr().get(position).getPlayer1());
            holder1.textView2.setText(List.get(position).getTr().get(position).getPlayer2());
            holder1.textView3.setText(List.get(position).getTr().get(position).getScore());
            holder1.textView4.setText(List.get(position).getTr().get(position).getScore());
            Picasso.with(context)
                    .load(List.get(position).getTr().get(position).getPlayer1logobig())
                    .placeholder(R.mipmap.meimv)
                    .error(R.mipmap.ic_launcher)
                    .resize(100, 100)
                    .noFade()
                    .into(holder1.imageView1);
            Picasso.with(context)
                    .load(List.get(position).getTr().get(position).getPlayer2logobig())
                    .placeholder(R.mipmap.meimv)
                    .error(R.mipmap.ic_launcher)
                    .resize(100, 100)
                    .noFade()
                    .into(holder1.imageView2);
        }else{
            MyViewHolder2 holder2 = (MyViewHolder2) holder;
            holder2.textView1.setText(List.get(position).getTr().get(position).getPlayer1());
            holder2.textView2.setText(List.get(position).getTr().get(position).getPlayer2());
            holder2.textView4.setText(List.get(position).getTr().get(position).getScore());
            Picasso.with(context)
                    .load(List.get(position).getTr().get(position).getPlayer1logobig())
                    .placeholder(R.mipmap.meimv)
                    .error(R.mipmap.ic_launcher)
                    .resize(100, 100)
                    .noFade()
                    .into(holder2.imageView1);
            Picasso.with(context)
                    .load(List.get(position).getTr().get(position).getPlayer2logobig())
                    .placeholder(R.mipmap.meimv)
                    .error(R.mipmap.ic_launcher)
                    .resize(100, 100)
                    .noFade()
                    .into(holder2.imageView2);
        }
    }
    @Override
    public int getItemCount() {
        return List.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView1,imageView2;
        TextView textView1,textView2,textView3,textView4;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView1= (TextView) itemView.findViewById(R.id.player1);
            textView2= (TextView) itemView.findViewById(R.id.player2);
            textView3= (TextView) itemView.findViewById(R.id.score);
            textView4= (TextView) itemView.findViewById(R.id.player2_score);
            imageView1=(ImageView) itemView.findViewById(R.id.player1_pic);
            imageView2=(ImageView) itemView.findViewById(R.id.player2_pic);
        }
    }
    class MyViewHolder2 extends RecyclerView.ViewHolder{
        ImageView imageView1,imageView2;
        TextView textView1,textView2,textView4;
        public MyViewHolder2(View itemView) {
            super(itemView);
            textView1= (TextView) itemView.findViewById(R.id.player1);
            textView2= (TextView) itemView.findViewById(R.id.player2);
            textView4= (TextView) itemView.findViewById(R.id.player2_score);
            imageView1=(ImageView) itemView.findViewById(R.id.player1_pic);
            imageView2=(ImageView) itemView.findViewById(R.id.player2_pic);
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
