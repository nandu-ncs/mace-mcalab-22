package com.example.login22;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.login22.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;


    EditText a,b;
    Button btn;
    String o,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(EditText)findViewById(R.id.uname);
        b=(EditText)findViewById(R.id.pass);
        btn=(Button)findViewById(R.id.login);
        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String m="nandu-ncs";
        String n="123";
        o=a.getText().toString();
        p=b.getText().toString();
        if(o.equals(m) && p.equals(n)) {
            Toast.makeText(this,"Login Success",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show();
        }
    }
}