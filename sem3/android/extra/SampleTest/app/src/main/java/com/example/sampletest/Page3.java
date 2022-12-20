package com.example.sampletest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Page3 extends AppCompatActivity {
    Button prev,finish;
    SharedPreferences sharedPreferences;
    String q3;
    RadioGroup r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);
        setTitle("Tech Quiz");
        sharedPreferences = getSharedPreferences("res",getApplicationContext().MODE_PRIVATE);
        finish = (Button) findViewById(R.id.finish);
        prev = (Button) findViewById(R.id.prev);
        q3 = sharedPreferences.getString("q3","");
        r3 = (RadioGroup)findViewById(R.id.r3);
        if(q3!="") {
            if(q3=="ans1") {
                r3.check(R.id.ans1);
            }
            else if(q3=="ans2") {
                r3.check(R.id.ans2);
            }
            else if(q3=="ans3") {
                r3.check(R.id.ans3);
            }
            else if(q3=="ans4") {
                r3.check(R.id.ans4);
            }
        }
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Page2.class);
                startActivity(intent);
            }
        });

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Result.class);
                startActivity(intent);
            }
        });
        r3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int sl=radioGroup.findViewById(i).getId();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if(sl==R.id.ans1) {
                    editor.putString("q3","ans1");
                }
                else if(sl==R.id.ans2) {
                    editor.putString("q3","ans2");
                }
                else if(sl==R.id.ans3) {
                    editor.putString("q3","ans3");
                }
                else if(sl==R.id.ans4) {
                    editor.putString("q3","ans4");
                }
                editor.commit();
            }
        });
    }
}
