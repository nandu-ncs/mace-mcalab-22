package com.example.validate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements TextWatcher, View.OnClickListener, CompoundButton.OnCheckedChangeListener   {

    EditText percent;
    CheckBox c;
    LinearLayout ll1;
    ToggleButton t1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.label1);

        percent = (EditText) findViewById(R.id.edit1);
        percent.addTextChangedListener(this);

        c = (CheckBox) findViewById(R.id.cb);
        c.setOnClickListener(this);

        ll1 = (LinearLayout) findViewById(R.id.ll1);
        t1 = (ToggleButton) findViewById(R.id.tb);

        t1.setOnCheckedChangeListener(this);

    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        float num = 0;
        String s = editable.toString();
        if (s != null && !s.isEmpty())
            num = Float.parseFloat(editable.toString());
        if (num>100)
            editable.replace(0,editable.length(),"100");
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==c.getId())
            if (c.isChecked())
                Toast.makeText(this,"Terms Accepted",Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,"Please accept terms",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b) {
            ll1.setBackgroundColor(Color.DKGRAY);
            c.setTextColor(Color.WHITE);
            percent.setTextColor(Color.WHITE);
            tv1.setTextColor(Color.WHITE);
        }
        else {
            ll1.setBackgroundColor(Color.LTGRAY);
            c.setTextColor(Color.BLACK);
            tv1.setTextColor(Color.BLACK);
        }
    }
}



