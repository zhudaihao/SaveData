package com.gemini.cloud.app.mysavedata;

import android.os.Bundle;
import android.util.Log;
import android.view.View;


import com.gemini.cloud.app.mysavedata.saveUtils.DataSaveUtils;
import com.gemini.cloud.app.mysavedata.saveUtils.SPSave;

import java.util.HashSet;
import java.util.Set;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "zdh";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化配置饿 实现一键切换
//        DataSaveUtils.getInstance().initSave(new MMKVSave(getApplicationContext()));
        DataSaveUtils.getInstance().initSave(new SPSave(getApplicationContext()));
    }

    public void set(View view) {
        DataSaveUtils.getInstance().encode("tag1", false);
        DataSaveUtils.getInstance().encode("tag2", "测试");
        DataSaveUtils.getInstance().encode("tag3", 100);
        Set<String> list = new HashSet<>();
        list.add("张三");
        DataSaveUtils.getInstance().encode("tag4", list);
    }

    public void get(View view) {
        Log.e(TAG, "-------- " + DataSaveUtils.getInstance().decodeBool("tag1"));
        Log.e(TAG, "-------- " + DataSaveUtils.getInstance().decodeString("tag2"));
        Log.e(TAG, "-------- " + DataSaveUtils.getInstance().decodeInt("tag3"));
        Log.e(TAG, "-------- " + DataSaveUtils.getInstance().decodeStringSet("tag4"));
    }
}