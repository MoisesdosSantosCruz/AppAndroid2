package com.example.appanimalssustent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void linkMain2(View view) {
        Intent in = new Intent(MainActivity8.this, MainActivity2.class);
        startActivity(in);
    }
    public void linkMain9(View view) {
        Intent in = new Intent(MainActivity8.this, MainActivity9.class);
        startActivity(in);
    }
}
