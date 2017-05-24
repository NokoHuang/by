package com.example.noko.activitylifetext;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
        setContentView(R.layout.activity_normal);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCollector.finishAll();
            }
        });
    }
}
