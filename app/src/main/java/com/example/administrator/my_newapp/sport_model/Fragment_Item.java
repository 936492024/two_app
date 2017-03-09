package com.example.administrator.my_newapp.sport_model;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.my_newapp.R;

import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Fragment_Item extends Fragment {
    private TextView textView;
    private ProgressBar progressBar;
    private RecyclerAdapter recyclerAdapter;
    private RecyclerView recyclerView;
    private PtrClassicFrameLayout ptrLayout;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item,null);
        ptrLayout = (PtrClassicFrameLayout)view.findViewById(R.id.ptr_layout);
//        progressBar= (ProgressBar) view.findViewById(R.id.progressBar2);
        recyclerView= (RecyclerView) view.findViewById(R.id.recycler);


        Retrofit();
        return view;





    }

    public void Retrofit(){//初始化Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://op.juhe.cn/onebox/basketball/")
                .addConverterFactory(GsonConverterFactory.create())//解析工具
                .build();

        JieKou jiekou =retrofit.create(JieKou.class);
        Call<ProgressInfo> call = jiekou.getWanNianLi("c3630b78e75fc7f2dd4c8481b092f6e2");


        call.enqueue(new retrofit2.Callback<ProgressInfo>() {
            @Override
            public void onResponse(Call<ProgressInfo> call,  retrofit2.Response<ProgressInfo> response) {
                recyclerAdapter = new RecyclerAdapter(getContext(),response.body().getResult().getList());
                Log.e("msg","集合里的东西1:"+response.body().getResult().getStatuslist().toString());
                Log.e("msg","集合里的东西2:"+response.body().getResult().getList().toString());
                Log.e("msg","集合里的东西3:"+response.body().getResult());
                Log.e("msg","集合大小"+response.body().getResult().getList().size());
                recyclerView.setAdapter(recyclerAdapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                recyclerAdapter.setOnClicListener(new RecyclerAdapter.OnItemClicListener() {
                    @Override
                    public void onItemClic(View view, int position) {
                        Toast.makeText(getContext(), "sss" + position, Toast.LENGTH_SHORT).show();
                    }
                });
//                progressBar.setVisibility(View.GONE);
            }
            @Override
            public void onFailure(Call<ProgressInfo> call, Throwable t) {
            }
        });
    }

    public interface JieKou{
        @GET("nba")
        Call<ProgressInfo> getWanNianLi(@Query("key") String key);
    }
}
