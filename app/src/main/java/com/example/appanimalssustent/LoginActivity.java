package com.example.appanimalssustent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText editUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editUser = (EditText) findViewById(R.id.editUser);

    }
    public void linkCadastro(View view){
        Intent in = new Intent(this, CadastroActivity.class);
        startActivity(in);
    }
    public void linkMain(View view) {
        Intent in= new Intent(this, MainActivity.class);
        in.putExtra("user", editUser.getText().toString());
        startActivity(in);
        finish();
    }
}