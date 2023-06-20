package com.example.appanimalssustent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }
    public void linkMain7 (View view){
        Intent in = new Intent(MainActivity9.this, MainActivity7.class);
        startActivity(in);
    }
    public void linkMain1(View view) {
        Intent in= new Intent(MainActivity9.this, MainActivity.class);
        startActivity(in);
    }
}