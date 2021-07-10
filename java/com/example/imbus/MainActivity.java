package com.example.imbus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button btn1;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btn1 = findViewById(R.id.btn1);
        txt1 = findViewById(R.id.txt1);
    }


    public void MainPage(View view)
    {
        if (et1.getText().toString().equals("12345678") && et2.getText().toString().equals("1234"))
        {
            Intent i = new Intent(this, MainActivity2.class);
            startActivity(i);
        }
        else if (et1.getText().toString().equals("87654321") && et2.getText().toString().equals("4321"))
        {
            Intent i = new Intent(this, MainActivity3.class);
            startActivity(i);
        }
        else
            Toast.makeText(this, "failed to login", Toast.LENGTH_SHORT).show();
    }
    public void Forgot(View view)
    {
        Toast.makeText(this, "A confirmation message will be send shortly", Toast.LENGTH_LONG).show();
    }


    public void B1(View view) {
    }

    public void B2(View view) {
    }

    public void B3(View view) {
    }

    public void B4(View view) {
    }

    public void B5(View view) {
    }

    public void B6(View view) {
    }

    public void Drivers(View view) {
    }

    public void Profile(View view) {
    }

    public void Location(View view) {
    }

    public void Buses(View view) {
    }

    public void History(View view) {
    }
}