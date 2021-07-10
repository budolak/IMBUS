package com.example.imbus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void Profile(View view)
    {
        Intent i = new Intent(this, MainActivity4.class);
        startActivity(i);
    }

    public void Drivers(View view)
    {
        Intent i = new Intent(this, MainActivity5.class);
        startActivity(i);
    }

    public void Buses(View view)
    {
        Intent i = new Intent(this, MainActivity6.class);
        startActivity(i);
    }

    public void History(View view)
    {
        Intent i = new Intent(this, MainActivity7.class);
        startActivity(i);
    }

    public void Location(View view)
    {
        Uri uri = Uri.parse("geo:41.40338, 2.17403");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);

    }
}