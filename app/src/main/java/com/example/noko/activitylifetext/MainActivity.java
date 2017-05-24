package com.example.noko.activitylifetext;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        ActivityCollector.addActivity(this);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null){
            String pty = savedInstanceState.getString("key");


            Log.d("key",pty);

        }
//        通过按钮id启动不同界面
        findViewById(R.id.bt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,NormalActivity.class);

                startActivity(i);

        }
        });
        findViewById(R.id.bt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,DialogActivity.class);
                startActivity(i);
            }
        });

    }
    public void onStart(){
        super.onStart();
        Log.d(TAG,"onStart");
    }
    public void onResume(){
        super.onResume();
        Log.d(TAG,"onResume");
            }
    public  void onPause(){
        super.onPause();
        Log.d(TAG,"onPause");
    }
    public void onStop(){
        super.onStop();
        Log.d(TAG,"onStop");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
    public void onRestart(){
        super.onRestart();
        Log.d(TAG,"onRestart");
    }

//    重写onSaveInstanceState方法，带一个数据包参数
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
//        获取数据
        String data= "ddd";
//        将数据存入数据包，使用putString(键名，键值)方法
        outState.putString("key",data);

    }
}
