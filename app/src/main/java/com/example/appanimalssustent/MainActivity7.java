package com.example.appanimalssustent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void linkMain2(View view) {
        Intent in = new Intent(MainActivity7.this, MainActivity2.class);
        startActivity(in);
    }
    public void linkMain1(View view) {
        Intent in= new Intent(MainActivity7.this, MainActivity.class);
        startActivity(in);
    }
    public void linkMain9(View view) {
        Intent in= new Intent(MainActivity7.this, MainActivity9.class);
        startActivity(in);
    }
}