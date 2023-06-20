package com.example.appanimalssustent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void linkMain1(View view) {
        Intent in= new Intent(MainActivity2.this, MainActivity.class);
        startActivity(in);
    }
    public void linkMain7 (View view){
        Intent in = new Intent(MainActivity2.this, MainActivity7.class);
        startActivity(in);
    }
    public void linkMain8 (View view){
        Intent in = new Intent(MainActivity2.this, MainActivity8.class);
        startActivity(in);
    }
}