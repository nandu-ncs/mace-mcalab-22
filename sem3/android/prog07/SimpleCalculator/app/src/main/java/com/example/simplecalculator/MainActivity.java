package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView res;
    Button btnadd,btnsub,btnmul,btndiv;
    Integer a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Simple Calculator");
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        res = (TextView)findViewById(R.id.res);
        btnadd = (Button)findViewById(R.id.add);
        btnsub = (Button)findViewById(R.id.sub);
        btnmul = (Button)findViewById(R.id.mul);
        btndiv = (Button)findViewById(R.id.div);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(String.valueOf(num1.getText()));
                b = Integer.parseInt(String.valueOf(num2.getText()));
                res.setText(String.valueOf(a+b));
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(String.valueOf(num1.getText()));
                b = Integer.parseInt(String.valueOf(num2.getText()));
                res.setText(String.valueOf(a-b));
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(String.valueOf(num1.getText()));
                b = Integer.parseInt(String.valueOf(num2.getText()));
                res.setText(String.valueOf(a*b));
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(String.valueOf(num1.getText()));
                b = Integer.parseInt(String.valueOf(num2.getText()));
                res.setText(String.valueOf(a.floatValue()/b));
            }
        });
    }
}