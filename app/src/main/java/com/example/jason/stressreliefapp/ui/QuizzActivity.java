package com.example.jason.stressreliefapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jason.stressreliefapp.R;
import com.example.jason.stressreliefapp.model.QuestionsList;

public class QuizzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);
    }

    private int anxnum = 0;

    public void clickButton(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        TextView tv = (TextView) findViewById(R.id.textViewQuestion);
        QuestionsList question = new QuestionsList();
        switch (button_text) {
            case "Go to Cards":
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case "Yes":
                Intent j = new Intent(this, MainActivity.class);
                startActivity(j);
                break;
            case "No":
                if (anxnum > 3) {
                    Intent k = new Intent(this, MainActivity.class);
                    startActivity(k);
                } else {
                    question.setString("Anxiety", anxnum++);
                    tv.setText(question.toString());
                }

        }
    }
}
