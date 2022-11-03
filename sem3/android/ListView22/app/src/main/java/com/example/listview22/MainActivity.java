package com.example.listview22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView l;
    String days[] = { "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("List View");
        l = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,days);
        l.setAdapter(arr);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String txt = "Day "+String.valueOf(i+1);
                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_SHORT).show();
            }
        });
    }
}