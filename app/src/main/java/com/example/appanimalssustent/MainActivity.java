package com.example.appanimalssustent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void linkMain2(View view) {
        Intent in = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(in);
    }
    public void linkMain10(View view) {
        Intent in = new Intent(MainActivity.this, MainActivity10.class);
        startActivity(in);
    }
}
