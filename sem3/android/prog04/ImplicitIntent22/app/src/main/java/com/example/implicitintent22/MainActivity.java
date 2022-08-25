package com.example.implicitintent22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button browser,playstore,map,gmail,phone,message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        browser = (Button)findViewById(R.id.browser);
        playstore = (Button)findViewById(R.id.playstore);
        map = (Button)findViewById(R.id.map);
        gmail = (Button)findViewById(R.id.gmail);
        phone = (Button)findViewById(R.id.phone);
        message = (Button)findViewById(R.id.message);
        browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nandusasikumar.atwebpages.com"));
                Intent chooser = Intent.createChooser(intent,"Choose your Browser");
                startActivity(chooser);
            }
        });
        playstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://market.android.com/details?id=com.instagram.android"));
                Intent chooser = Intent.createChooser(intent,"Choose Appstore");
                startActivity(chooser);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:9.967589, 76.422502"));
                Intent chooser = Intent.createChooser(intent,"Choose Maps");
                startActivity(chooser);
            }
        });
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to[] = {"nandusasikumar7@gmail.com"};
                Intent intent = new Intent(Intent.ACTION_SEND, Uri.parse("mailto"));
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT,"From emulator");
                intent.putExtra(Intent.EXTRA_TEXT,"My first test mail");
                intent.setType("message/rfc822");
                Intent chooser = Intent.createChooser(intent,"Choose Gmail");
                startActivity(chooser);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9562396427"));
                Intent chooser = Intent.createChooser(intent,"Choose Phone");
                startActivity(chooser);
            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "Hi!");
                intent.setData(Uri.parse("android.resource://" + getPackageName() + "/drawable/" + R.drawable.pro));
                intent.putExtra(Intent.EXTRA_STREAM, Uri.parse("android.resource://" + getPackageName() + "/drawable/" + R.drawable.pro));
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                intent.setType("image/jpeg");
                Intent chooser = Intent.createChooser(intent,"Choose message app");
                startActivity(chooser);
            }
        });
    }
}