package com.ZhouTao.XiaoYuan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    public String UnityToAndroid(int id,  int value1,int value2,int value3,String str1,String str2,String str3)
    {
        return  "UnityToAndroid测试数据";
    }
}