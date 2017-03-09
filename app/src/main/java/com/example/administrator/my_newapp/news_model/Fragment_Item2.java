package com.example.administrator.my_newapp.news_model;

/**
 * Created by Administrator on 2017/3/1.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.my_newapp.R;
import com.example.administrator.my_newapp.shoucang.ItemActivity;
import com.example.administrator.my_newapp.sport_model.RecyclerAdapter;

import java.util.ArrayList;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler2;
import in.srain.cube.views.ptr.PtrFrameLayout;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;






/**
 * Created by Administrator on 2017/2/28.
 */
public class Fragment_Item2 extends Fragment {
    private TextView textView;
    private ProgressBar progressBar;
    private RecyclerAdapter2 recyclerAdapter2;
    private RecyclerView recyclerView;
    private ArrayList<PrgressInfo_News> list;
    private  String type;
    private ArrayList<PrgressInfo_News> dataSource;
    private PtrClassicFrameLayout ptrLayout;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item2,null);
        textView= (TextView) view.findViewById(R.id.text);
        ptrLayout=(PtrClassicFrameLayout) view.findViewById(R.id.ptr_layout);
        progressBar= (ProgressBar) view.findViewById(R.id.progressBar);
        recyclerView= (RecyclerView) view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        String getMsg=getArguments().getString("name");
        Retrofit(getMsg);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        initData();
        initView();
        initEvent();
    }

    /**
     * 初始化数据
     */
    private void initData() {
        // 初始化ListView中展示的数据
        dataSource = new ArrayList<>();
//        for (int i = 1; i <= 50; i++) {
////            dataSource.add("Existed Old List Item " + i);
//        }
    }

    /**
     * 初始化布局控件
     */
    private void initView() {
        // 初始化ListView中的数据
//        adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, dataSource);
//        recyclerAdapter2=new RecyclerAdapter2(getContext(),dataSource);
//        recyclerView.setAdapter(recyclerAdapter2);


        // 为布局设置头部和底部布局
        ptrLayout.setHeaderView(new MyPtrRefresher(getContext()));
//         ptrLayout.setFooterView(new MyPtrRefresher(getContext()));
        ptrLayout.addPtrUIHandler(new MyPtrHandler(getContext(), ptrLayout));
    }

    /**
     * 初始化事件
     */
    private void initEvent() {
        // 为布局设置下拉刷新和上拉加载的回调事件
        ptrLayout.setPtrHandler(new PtrDefaultHandler2() {
            @Override
            public void onLoadMoreBegin(PtrFrameLayout frame) { // 上拉加载的回调方法
                frame.postDelayed(new Runnable() {
                    @Override
                    public void run() {
//                        dataSource.add("New Bottom List Item");
//                        adapter.notifyDataSetChanged();
                        ptrLayout.refreshComplete();
//                        recyclerView.smoothScrollToPosition(dataSource.size() - 1);
                    }
                }, 1000);
            }
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) { // 下拉刷新的回调方法
                frame.postDelayed(new Runnable() {
                    @Override
                    public void run() {
//                        dataSource.add(0, "New Top List Item");
                        ptrLayout.refreshComplete();
//                        recyclerView.smoothScrollToPosition(0);
                    }
                }, 1000);
            }
        });
    }


    public void Retrofit(String type){//初始化Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/toutiao/")
                .addConverterFactory(GsonConverterFactory.create())//解析工具
                .build();

        JieKou jiekou =retrofit.create(JieKou.class);
        Call<PrgressInfo_News> call = jiekou.getWanNianLi(type,"8b41621da64fb5a7db660117a62cfa36");


        call.enqueue(new retrofit2.Callback<PrgressInfo_News>() {
            @Override
            public void onResponse(Call<PrgressInfo_News> call,  final retrofit2.Response<PrgressInfo_News> response) {
                progressBar.setVisibility(View.VISIBLE);
                recyclerAdapter2 = new RecyclerAdapter2(getContext(),response.body().getResult().getData());
                recyclerView.setAdapter(recyclerAdapter2);
                progressBar.setVisibility(View.GONE);
                recyclerAdapter2.setOnClicListener(new RecyclerAdapter2.OnItemClicListener() {
                    @Override
                    public void onItemClic(View view, int position) {
                        Intent intent = new Intent(getContext(), ItemActivity.class);
                        intent.putExtra("a",response.body().getResult().getData().get(position).getUrl());
                        intent.putExtra("b",response.body().getResult().getData().get(position).getTitle());
                        intent.putExtra("c",response.body().getResult().getData().get(position).getThumbnail_pic_s());
                        intent.putExtra("d",response.body().getResult().getData().get(position).getAuthor_name());
                        Toast.makeText(getContext(),"传值了",Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }
                });

            }
            @Override
            public void onFailure(Call<PrgressInfo_News> call, Throwable t) {
            }
        });
    }

    public interface JieKou{
        @GET("index")
        Call<PrgressInfo_News> getWanNianLi(@Query("type") String type,@Query("key") String key);
    }
}

