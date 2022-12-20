package com.example.studentportal;

import androidx.appcompat.app.AppCompatActivity;

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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MyHelper myhelper;
    EditText name,phno;
    RadioGroup course;
    CheckBox a,b,c;
    Button save;

    String vname,vphno,vcourse,vblock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Student Portal");

        myhelper = new MyHelper(this);
        SQLiteDatabase sql = myhelper.getWritableDatabase();

        name = findViewById(R.id.name);
        phno = findViewById(R.id.phno);
        course = findViewById(R.id.course);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        save = findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vname = String.valueOf(name.getText());
                vphno = String.valueOf(phno.getText());
                if(course.getCheckedRadioButtonId()==findViewById(R.id.r1).getId()) {
                    vcourse = "B.Tech";
                }
                else if(course.getCheckedRadioButtonId()==findViewById(R.id.r2).getId()) {
                    vcourse = "MCA";
                }
                vblock="";
                if(a.isChecked()) {
                    vblock+="A";
                }
                if(b.isChecked()) {
                    vblock+="B";
                }
                if(c.isChecked()) {
                    vblock+="C";
                }

                long id = myhelper.insertData(vname, vphno, vcourse, vblock);
                if (id < 0)
                    Toast.makeText(getApplicationContext(), "Unsuccessful Insertion", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Successfully Inserted", Toast.LENGTH_LONG).show();
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
                Intent intent = new Intent(getApplicationContext(), ShowActivity.class);
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

    static class MyHelper extends SQLiteOpenHelper {
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

        public long insertData(String name, String phno, String course, String block) {
            SQLiteDatabase db = getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put("name", name);
            cv.put("phno", phno);
            cv.put("course", course);
            cv.put("block", block);
            long rowid = db.insert("std", null, cv);
            return rowid;
        }

        public String getAllData(String name) {
            // SELECT id, name, loc FROM dept
            SQLiteDatabase db = getWritableDatabase();
            String columns[] = {"stdid", "name", "phno","course","block"};
            Cursor cr = db.query("std", columns, "name" + " = '" + name + "'", null, null, null, null);
            StringBuffer buffer = new StringBuffer();

            String res;
            if ((cr != null) && (cr.getCount() > 0)) {
                while (cr.moveToNext()) {
                    int pid = cr.getInt(0);
                    String vname = cr.getString(1);
                    String phno = cr.getString(2);
                    String course = cr.getString(3);
                    String block = cr.getString(4);
                    buffer.append(pid + "\n\n" + vname + "\n\n" + phno + "\n\n"+ course + "\n\n");
                    for (int i=0;i<block.length();i++) {
                        if(i!=block.length()-1) {
                            buffer.append(block.charAt(i)+",");
                        }
                        else {
                            buffer.append(block.charAt(i)+"\n\n");
                        }
                    }
                }
                res = buffer.toString();
            } else {
                res = "No records!";
            }
            return res;
        }

    }


}