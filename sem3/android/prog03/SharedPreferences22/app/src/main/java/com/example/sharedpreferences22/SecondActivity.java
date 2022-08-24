package com.example.sharedpreferences22;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView welcome,name,email;
    Button bbtn;
    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Welcome");
        welcome = (TextView)findViewById(R.id.welcome);
        name = (TextView)findViewById(R.id.name);
        email = (TextView)findViewById(R.id.email);
        bbtn = (Button)findViewById(R.id.back);
        sharedpreferences = getSharedPreferences("mypref",MODE_PRIVATE);
        welcome.setText("Hi, "+sharedpreferences.getString("fname",""));
        name.setText("Name : "+sharedpreferences.getString("fname","")+" "+sharedpreferences.getString("lname",""));
        email.setText("Email : "+sharedpreferences.getString("email",""));
        bbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
