package com.example.cascadinglinearlayout22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,phy,maths,chem;
    Button cbtn;
    String nameval;
    Integer phyval,mathsval,chemval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Result");
        name = (EditText)findViewById(R.id.name);
        phy = (EditText)findViewById(R.id.phy);
        maths = (EditText)findViewById(R.id.maths);
        chem = (EditText)findViewById(R.id.chem);
        cbtn = (Button)findViewById(R.id.cbtn);
        SharedPreferences sharedpreferences = getSharedPreferences("mypref", getApplicationContext().MODE_PRIVATE);
        cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameval=name.getText().toString();
                phyval=Integer.parseInt(String.valueOf(phy.getText()));
                mathsval=Integer.parseInt(String.valueOf(maths.getText()));
                chemval=Integer.parseInt(String.valueOf(chem.getText()));
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("name", nameval);
                editor.putInt("phy", phyval);
                editor.putInt("maths", mathsval);
                editor.putInt("chem", chemval);
                editor.commit();

                Intent second = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(second);
            }
        });
    }
}