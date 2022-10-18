package com.example.sampletest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Page1 extends AppCompatActivity {
    Button next;
    RadioGroup r1;
    SharedPreferences sharedPreferences;
    String q1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
        setTitle("Tech Quiz");
        r1 = (RadioGroup)findViewById(R.id.r1);
        next = (Button) findViewById(R.id.next);
        sharedPreferences = getSharedPreferences("res",getApplicationContext().MODE_PRIVATE);
        q1 = sharedPreferences.getString("q1","");

        if(q1!="") {
            if(q1=="ans1") {
                r1.check(R.id.ans1);
            }
            else if(q1=="ans2") {
                r1.check(R.id.ans2);
            }
            else if(q1=="ans3") {
                r1.check(R.id.ans3);
            }
            else if(q1=="ans4") {
                r1.check(R.id.ans4);
            }
        }
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Page2.class);
                startActivity(intent);
            }
        });
        r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int sl=radioGroup.findViewById(i).getId();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if(sl==R.id.ans1) {
                    editor.putString("q1","ans1");
                }
                else if(sl==R.id.ans2) {
                    editor.putString("q1","ans2");
                }
                else if(sl==R.id.ans3) {
                    editor.putString("q1","ans3");
                }
                else if(sl==R.id.ans4) {
                    editor.putString("q1","ans4");
                }
                editor.commit();
            }
        });
    }
}
