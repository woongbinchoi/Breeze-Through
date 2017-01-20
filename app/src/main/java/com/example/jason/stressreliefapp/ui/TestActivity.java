package com.example.jason.stressreliefapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jason.stressreliefapp.R;
import com.example.jason.stressreliefapp.model.QuestionsList;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void clickButton(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        switch (button_text) {
            case "Depression":
                Intent i = new Intent(this, QuizDepActivity.class);
                startActivity(i);
                break;
            case "Anxiety":
                Intent j = new Intent(this, QuizzActivity.class);
                startActivity(j);
                break;
            case "Stress":
                Intent k = new Intent(this, QuizStrActivity.class);
                startActivity(k);
                break;
            case "Go to Cards":
                Intent l = new Intent(this, MainActivity.class);
                startActivity(l);
                break;


        }
    }
}

