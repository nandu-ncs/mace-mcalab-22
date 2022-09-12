package com.example.cascadinglinearlayout22;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView name,perc,res;
    Integer phy,maths,chem;
    Float per;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Result");
        name = (TextView)findViewById(R.id.name);
        perc = (TextView)findViewById(R.id.perc);
        res = (TextView)findViewById(R.id.res);

        SharedPreferences sharedpreferences = getSharedPreferences("mypref", MODE_PRIVATE);
        phy = sharedpreferences.getInt("phy",0);
        maths = sharedpreferences.getInt("maths",0);
        chem = sharedpreferences.getInt("chem",0);
        name.setText("Hi, "+sharedpreferences.getString("name",""));
        per = (phy.floatValue()+maths+chem)/3;
        perc.setText("Percentage : "+String.valueOf(per));
        if(per<50) {
            res.setText("Better Luck Next Time!");
        }
        else {
            res.setText("Passed!");
        }
    }
}
