package com.example.sampletest;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {
    Integer re=0;
    SharedPreferences sharedPreferences;
    TextView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        setTitle("Tech Quiz");
        sharedPreferences = getSharedPreferences("res",getApplicationContext().MODE_PRIVATE);
        if(sharedPreferences.getString("q1","")=="ans2") {
            re+=1;
        }
        if(sharedPreferences.getString("q2","")=="ans2") {
            re+=1;
        }
        if(sharedPreferences.getString("q3","")=="ans2") {
            re+=1;
        }
        r = (TextView) findViewById(R.id.res);
        r.setText("Result : "+String.valueOf(re)+"/3");
    }
}
