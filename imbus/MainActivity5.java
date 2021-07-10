package com.example.imbus;

import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void Call1(View view)
    {

        Uri uri = Uri.parse("tel:084975014");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);


    }

    public void Call2(View view)
    {

        Uri uri = Uri.parse("tel:4987593480");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);


    }

    public void Call3(View view)
    {

        Uri uri = Uri.parse("tel:239582239");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);


    }

    public void Call4(View view)
    {

        Uri uri = Uri.parse("tel:25363653");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);


    }
}
