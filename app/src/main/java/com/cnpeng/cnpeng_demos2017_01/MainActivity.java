package com.cnpeng.cnpeng_demos2017_01;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cnpeng.cnpeng_demos2017_01.a_01_WebView01.WebViewTestActivity01;
import com.cnpeng.cnpeng_demos2017_01.databinding.ActivityMainBinding;
import com.cnpeng.cnpeng_demos2017_01.utils.CommonUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int RequsetCode = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btWebviewTest01.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_webview_Test01:
                CommonUtils.mStartActivity(this, WebViewTestActivity01.class);
                break;
        }

    }
}
