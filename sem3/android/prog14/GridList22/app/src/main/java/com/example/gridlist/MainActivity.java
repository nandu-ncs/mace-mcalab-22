package com.example.gridlist;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    int image[]={R.drawable.img_12, R.drawable.img, R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,R.drawable.img_7,R.drawable.img_8,R.drawable.img_9,R.drawable.img_10,R.drawable.img_13,R.drawable.img_14,R.drawable.img_15};
    String[] names = {"India","Afghanistan", "Aland Islands Circular", "Albania Circular", "Algeria", "American Samoa Circular", "Andora", "Angola","Anguilla Circular","Antarctica Circular","Antigua and Barbuda","Argentina","Armenia","Aruba Circular","Australia"};
    GridView g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        g = (GridView) findViewById(R.id.grid);
        GridArrayAdapter gridArrayAdapter = new GridArrayAdapter(this, R.layout.cell, image,names);
        g.setAdapter(gridArrayAdapter);
        g.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you know the flag of "+names[position]+"?");
        builder.setPositiveButton("YES",null);
        builder.setNegativeButton("NO",null);
        AlertDialog a = builder.create();
        a.show();
    }
}
