package com.example.sharedpreferences22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText f,l,e,p;
    Button btn;
    String f2,l2,e2,p2;

    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Registration");
        f=(EditText)findViewById(R.id.fname);
        l=(EditText)findViewById(R.id.lname);
        e=(EditText)findViewById(R.id.email);
        p=(EditText)findViewById(R.id.pass);
        btn=(Button)findViewById(R.id.reg);
        sharedpreferences = getSharedPreferences("mypref", getApplicationContext().MODE_PRIVATE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                f2=f.getText().toString();
                l2=l.getText().toString();
                e2=e.getText().toString();
                p2=p.getText().toString();
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("fname", f2);
                editor.putString("lname", l2);
                editor.putString("email", e2);
                editor.putString("password", p2);
                editor.commit();

                Intent second = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(second);
            }
        });
    }

}
