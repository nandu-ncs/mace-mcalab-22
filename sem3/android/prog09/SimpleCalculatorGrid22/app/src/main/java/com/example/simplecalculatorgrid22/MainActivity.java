package com.example.simplecalculatorgrid22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer flag=0,op = 0;
    Float res = Float.parseFloat("0");
    Float num;
    TextView input;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnadd,btnsub,btnmul,btndiv,btneq,btnac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Simple Calculator");
        input = (TextView) findViewById(R.id.input);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);
        btneq = (Button) findViewById(R.id.btneq);
        btnac = (Button) findViewById(R.id.btnac);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+String.valueOf(0));
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+String.valueOf(1));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+String.valueOf(2));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+String.valueOf(3));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+String.valueOf(4));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+String.valueOf(5));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+String.valueOf(6));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+String.valueOf(7));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+String.valueOf(8));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+String.valueOf(9));
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Float.parseFloat((String)input.getText());
                input.setText("");
                if(flag==0) {
                    res=num;
                    flag=1;
                }
                else if (op!=1) {
                    if(op == 2)
                        res-=num;
                    if(op == 3)
                        res*=num;
                    if(op == 4)
                        res/=num;
                }
                else {
                    res+=num;
                }
                op = 1;
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Float.parseFloat((String)input.getText());
                input.setText("");
                if(flag==0) {
                    res=num;
                    flag=1;
                }
                else if (op!=2) {
                    if(op == 1)
                        res+=num;
                    if(op == 3)
                        res*=num;
                    if(op == 4)
                        res/=num;
                }
                else {
                    res-=num;
                }
                op = 2;
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Float.parseFloat((String)input.getText());
                input.setText("");
                if(flag==0) {
                    res=num;
                    flag=1;
                }
                else if (op!=3) {
                    if(op == 1)
                        res+=num;
                    if(op == 2)
                        res-=num;
                    if(op == 4)
                        res/=num;
                }
                else {
                    res*=num;
                }
                op = 3;
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Float.parseFloat((String)input.getText());
                input.setText("");
                if(flag==0) {
                    res=num;
                    flag=1;
                }
                else if (op!=4) {
                    if(op == 1)
                        res+=num;
                    if(op == 3)
                        res*=num;
                    if(op == 2)
                        res-=num;
                }
                else {
                    res/=num;
                }
                op = 4;
            }
        });
        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag = 0;
                num = Float.parseFloat((String)input.getText());
                if(op == 1)
                    res+=num;
                if(op == 2)
                    res-=num;
                if(op == 3)
                    res*=num;
                if(op == 4)
                    res/=num;
                input.setText(String.valueOf(res));
            }
        });
        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag = 0;
                input.setText("");
            }
        });
    }
}