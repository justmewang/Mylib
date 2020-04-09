package com.example.mylibrary;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.SettingsActivity;

public class MyLibTest {
    private static MyLibTest _instance;
    private MyLibTest(){}
    public static MyLibTest getInstance(){
        if(_instance==null){
            _instance = new MyLibTest();
        }
        return _instance;
    }

    private boolean isInit = false;

    public void init(){
        isInit = true;
    }

    public void showMyActivity(Context context){
        if(!isInit){
            Toast.makeText(context,"需要先初始化",Toast.LENGTH_SHORT).show();
            return;
        }
        context.startActivity(new Intent(context, SettingsActivity.class));
    }

}
