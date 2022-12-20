package com.example.sampletest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Page2 extends AppCompatActivity {
    Button next,prev;
    SharedPreferences sharedPreferences;
    String q2;
    RadioGroup r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        setTitle("Tech Quiz");
        sharedPreferences = getSharedPreferences("res",getApplicationContext().MODE_PRIVATE);
        next = (Button) findViewById(R.id.next);
        prev = (Button) findViewById(R.id.prev);
        q2 = sharedPreferences.getString("q2","");
        r2 = (RadioGroup)findViewById(R.id.r2);
        if(q2!="") {
            if(q2=="ans1") {
                r2.check(R.id.ans1);
            }
            else if(q2=="ans2") {
                r2.check(R.id.ans2);
            }
            else if(q2=="ans3") {
                r2.check(R.id.ans3);
            }
            else if(q2=="ans4") {
                r2.check(R.id.ans4);
            }
        }
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Page3.class);
                startActivity(intent);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Page1.class);
                startActivity(intent);
            }
        });
        r2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int sl=radioGroup.findViewById(i).getId();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if(sl==R.id.ans1) {
                    editor.putString("q2","ans1");
                }
                else if(sl==R.id.ans2) {
                    editor.putString("q2","ans2");
                }
                else if(sl==R.id.ans3) {
                    editor.putString("q2","ans3");
                }
                else if(sl==R.id.ans4) {
                    editor.putString("q2","ans4");
                }
                editor.commit();
            }
        });
    }
}
