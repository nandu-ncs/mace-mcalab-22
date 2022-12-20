package com.example.sqlitedemo22;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuCompat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MyHelper myhelper;
    EditText eName, eLoc, eOne, eName1, eLoc1, eolds, enews, erem;
    Button bAdd, bView, bOne, bId, bChange, bRem;
    LinearLayout l1, l2, l3, l4, l5, l6;
    ImageView img;
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myhelper = new MyHelper(this);
        SQLiteDatabase sql = myhelper.getWritableDatabase();
        eolds = (EditText) findViewById(R.id.eOld);
        enews = (EditText)findViewById(R.id.eNew);
        eName = (EditText) findViewById(R.id.name);
        eLoc = (EditText) findViewById(R.id.loc);
        bAdd = (Button) findViewById(R.id.add);
        bAdd.setOnClickListener(this);
        bView = (Button) findViewById(R.id.view);
        bView.setOnClickListener(this);
        eOne = (EditText) findViewById(R.id.eViewOne);
        bOne = (Button) findViewById(R.id.one);
        bOne.setOnClickListener(this);
        eName1 = (EditText) findViewById(R.id.eName1);
        eLoc1 = (EditText) findViewById(R.id.eloc);
        bId = (Button) findViewById(R.id.id);
        bId.setOnClickListener(this);
        bChange = (Button) findViewById(R.id.change);
        bChange.setOnClickListener(this);
        l1 = (LinearLayout) findViewById(R.id.lay1);
        l2 = (LinearLayout) findViewById(R.id.lay2);
        l4 = (LinearLayout) findViewById(R.id.lay4);
        l5 = (LinearLayout) findViewById(R.id.lay5);
        l6 = (LinearLayout) findViewById(R.id.lay6);
        img = (ImageView) findViewById(R.id.img1);
        t1 = (TextView) findViewById(R.id.textall);
        t2 = (TextView) findViewById(R.id.textone);
        t3 = (TextView) findViewById(R.id.textid);
        erem = (EditText) findViewById(R.id.rem);
        bRem = (Button) findViewById(R.id.remove);
        bRem.setOnClickListener(this);
        l3 = (LinearLayout) findViewById(R.id.lay3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        MenuCompat.setGroupDividerEnabled(menu,true);
        return true;
    }

    public void visi(){
        img.setVisibility(View.GONE);
        l1.setVisibility(View.GONE);
        l2.setVisibility(View.GONE);
        l3.setVisibility(View.GONE);
        l4.setVisibility(View.GONE);
        l5.setVisibility(View.GONE);
        l6.setVisibility(View.GONE);
        t1.setText(" ");
        t2.setText(" ");
        t3.setText(" ");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        visi();
        switch (item.getItemId()){
            case R.id.a1:
                l1.setVisibility(View.VISIBLE);
                break;
            case R.id.a2:
                l2.setVisibility(View.VISIBLE);
                break;
            case R.id.a3:
                l3.setVisibility(View.VISIBLE);
                break;
            case R.id.a4:
                l4.setVisibility(View.VISIBLE);
                break;
            case R.id.a5:
                l5.setVisibility(View.VISIBLE);
                break;
            case R.id.a6:
                l6.setVisibility(View.VISIBLE);
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.add) {
            String user = eName.getText().toString();
            String loc = eLoc.getText().toString();
            long id = myhelper.insertData(user, loc);
            if (id < 0)
                Toast.makeText(this, "Unsuccessful Insertion", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this, "Successfully Inserted", Toast.LENGTH_LONG).show();
        }
        if (v.getId() == R.id.view) {
            String a = myhelper.getAllData();
            t1.setText(a);
        }
        if (v.getId() == R.id.one) {
            String name = eOne.getText().toString();
            String r = myhelper.getData(name);
            t2.setText(r);
        }
        if(v.getId()==R.id.id){
            String a = eName1.getText().toString();
            String b = eLoc1.getText().toString();
            String r = myhelper.getId(a,b);
            t3.setText(r);
        }
        if (v.getId()==R.id.change){
            String s1 = eolds.getText().toString();
            String s2 = enews.getText().toString();
            int c = myhelper.updateName(s1,s2);
            if (c>0)
                Toast.makeText(this, "Update Successful", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this, "Maybe update at a LATER time", Toast.LENGTH_LONG).show();
        }
        if (v.getId()==R.id.remove){
            String s = erem.getText().toString();
            int c = myhelper.deleteRow(s);
            if (c>0)
                Toast.makeText(this, "Deletion Successful", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this, "Maybe delete at a LATER time", Toast.LENGTH_LONG).show();
        }
    }

    class MyHelper extends SQLiteOpenHelper {
        MyHelper(Context c) {
            super(c, "deptDB", null, 1);
        }

        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL("CREATE TABLE dept (deptid INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(30), location VARCHAR(10));");
            } catch (SQLException e) {
                System.out.println("hi");
            }
        }

        public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
            try {
                db.execSQL("CREATE TABLE IF NOT EXISTS dept (deptid INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(30), location VARCHAR(10));");
            } catch (SQLException e) {
            }
        }

        public long insertData(String username, String password) {
            SQLiteDatabase db = getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put("name", username);
            cv.put("location", password);
            long rowid = db.insert("dept", null, cv);
            return rowid;
        }

        public String getAllData() {
            // SELECT id, name, loc FROM dept
            SQLiteDatabase db = getWritableDatabase();
            String columns[] = {"deptid", "name", "location"};
            Cursor cr = db.query("dept", columns, null, null, null, null, null);
            StringBuffer buffer = new StringBuffer();
            while (cr.moveToNext()) {
                int pid = cr.getInt(0);
                String name = cr.getString(1);
                String password = cr.getString(2);
                buffer.append(pid + " --- " + name + " --- " + password + "\n");
            }
            return buffer.toString();
        }

        public String getData(String username) {
            //SELECT name, location FROM dept WHERE name = "”
            SQLiteDatabase db = getWritableDatabase();
            String columns[] = {"name", "location"};
            Cursor cr = db.query("dept", columns, "name" + " = '" + username + "'", null, null, null, null);
            StringBuffer buffer = new StringBuffer();
            while (cr.moveToNext()) {
                int index1 = cr.getColumnIndex("name");
                int index2 = cr.getColumnIndex("location");
                String name = cr.getString(index1);
                String l = cr.getString(index2);
                buffer.append(name + " " + l + "\n");
            }
            return buffer.toString();
        }

        public String getId(String name, String location) {
            //SELECT deptid FROM dept WHERE name = ? AND location = ?
            SQLiteDatabase db = getWritableDatabase();
            String columns[] = {"deptid"};
            String selectionArgs[] = {name, location};
            Cursor cr = db.query("dept", columns, "name" + " = ?            AND " + "location" + " = ? ", selectionArgs, null, null, null);
            StringBuffer buffer = new StringBuffer();

            while (cr.moveToNext()) {
                int index0 = cr.getColumnIndex("deptid");
                int id = cr.getInt(index0);
                buffer.append(id + "\n");
            }
            return buffer.toString();
        }
        public int updateName(String oldName, String newName){
            //UPDATE dept SET name = ? WHERE NAME = ?
            SQLiteDatabase db = getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put("name",newName);
            String whereArgs[] = {oldName};
            int count = db.update("dept",cv,"name=?",whereArgs);
            System.out.println("Testing");
            return count;
        }
        public int deleteRow(String dname){
            //DELETE * FROM dept WHERE NAME = ?
            SQLiteDatabase db = getWritableDatabase();
            String whereArgs[] = {dname};
            int count = db.delete("dept","name=?",whereArgs);
            return count;
        }


    }
}
