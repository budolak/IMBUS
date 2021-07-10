package com.example.imbus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void Logout(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void Update(View view)
    {
        Toast.makeText(this, "History Updated", Toast.LENGTH_SHORT).show();
    }

    public void Call1(View view)
    {
    }

    public void Call2(View view) {
    }

    public void Call3(View view) {
    }

    public void Call4(View view) {
    }
}