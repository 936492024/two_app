package com.example.administrator.my_newapp.shoucang;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.administrator.my_newapp.R;
import com.example.administrator.my_newapp.sport_model.MyAdapter;

/**
 * Created by Administrator on 2017/2/24.
 */
public class ItemActivity extends AppCompatActivity {
    private WebView webView;
    private ProgressBar progressBar;
    MyAdapter adapter;
    private Button button;
    DB_Manager manager=new DB_Manager(this);
    SQLiteDatabase db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_item);
        webView= (WebView) findViewById(R.id.webview);
        progressBar= (ProgressBar) findViewById(R.id.progressBar);
        button= (Button) findViewById(R.id.shoucang);


        final String a = getIntent().getStringExtra("a");//url
        final String b = getIntent().getStringExtra("b");//title
        final String c = getIntent().getStringExtra("c");//图片
        final String d = getIntent().getStringExtra("d");//来源名字
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db = manager.getWritableDatabase();
                String insert_sql = "INSERT INTO info VALUES(null, '"+a+"','"+b+"','"+c+"','"+d+"') ";
                db.execSQL(insert_sql);
                Toast.makeText(ItemActivity.this,"收藏成功",Toast.LENGTH_SHORT).show();
            }
        });

        webView.loadUrl(getIntent().getStringExtra("a"));
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setUseWideViewPort(true);

        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);

        webSettings.setDisplayZoomControls(false);
        webSettings.setJavaScriptEnabled(true); // 设置支持javascript脚本
        webSettings.setAllowFileAccess(true); // 允许访问文件
        webSettings.setBuiltInZoomControls(true); // 设置显示缩放按钮
        webSettings.setSupportZoom(true); // 支持缩放
        webSettings.setMinimumFontSize(10);


        webSettings.setLoadWithOverviewMode(true);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int mDensity = metrics.densityDpi;
        Log.d("maomao", "densityDpi = " + mDensity);
        if (mDensity == 240) {
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.FAR);
        } else if (mDensity == 160) {
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.MEDIUM);
        } else if(mDensity == 120) {
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.CLOSE);
        }else if(mDensity == DisplayMetrics.DENSITY_XHIGH){
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.FAR);
        }else if (mDensity == DisplayMetrics.DENSITY_TV){
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.FAR);
        }else{
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.MEDIUM);
        }

        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);


        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if(newProgress==100){
                    progressBar.setProgress(View.INVISIBLE);
                }else{
                    if(View.INVISIBLE==progressBar.getVisibility()){
                             progressBar.setProgress(View.INVISIBLE);
                    }
                    progressBar.setProgress(newProgress);
                }
            }
        }
        );
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
