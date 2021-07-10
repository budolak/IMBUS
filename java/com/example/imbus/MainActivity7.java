package com.example.imbus;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


    }

    public void Update(View view)
    {
        Toast.makeText(this, "Recent History Updated", Toast.LENGTH_SHORT).show();

    }


}