package com.example.appanimalssustent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
    public void linkQuiz1 (View view){
       Uri uri = Uri.parse("https://pt.quizur.com/trivia/sera-que-voce-conhece-os-animais-em-extincao-492e");
       Intent it = new Intent(Intent.ACTION_VIEW,uri);
       startActivity(it);
    }
    public void linkQuiz2 (View view){
        Uri uri = Uri.parse("https://pt.quizur.com/quiz/que-animal-da-fauna-brasileira-e-voce-EPEF");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
    public void linkQuiz3 (View view){
        Uri uri = Uri.parse("https://wordwall.net/pt/resource/4155115/jogo-animais-em-extin%C3%A7%C3%A3o");
        Intent it= new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}