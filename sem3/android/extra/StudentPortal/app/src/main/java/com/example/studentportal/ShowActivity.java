package com.example.studentportal;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    MainActivity.MyHelper myhelper;
    EditText name;
    TextView result;
    Button show;
    String vname;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        setTitle("Student Portal");

        myhelper = new MainActivity.MyHelper(this);
        SQLiteDatabase sql = myhelper.getWritableDatabase();

        name = findViewById(R.id.name);
        show = findViewById(R.id.show);
        result = findViewById(R.id.result);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vname = String.valueOf(name.getText());
                String r = myhelper.getAllData(vname);
                result.setText(r);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.show:
                Intent intent = new Intent(this, ShowActivity.class);
                startActivity(intent);
                return true;
            case R.id.exit:
                this.finishAffinity();
                System.exit(0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    class MyHelper extends SQLiteOpenHelper {
        MyHelper(Context c) {
            super(c, "studentDB", null, 1);
        }

        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL("CREATE TABLE std (stdid INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(30), phno VARCHAR(10), course VARCHAR(20), block varchar(10));");
            } catch (SQLException e) {
                System.out.println("db oncreate except");
            }
        }

        public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
            try {
                db.execSQL("CREATE TABLE IF NOT EXISTS std (stdid INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(30), phno VARCHAR(10), course VARCHAR(20), block varchar(10));");
            } catch (SQLException e) {
                System.out.println("db onupgrade except");
            }
        }




    }
}
