package com.example.jason.stressreliefapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.jason.stressreliefapp.R;

public class FirstScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }

    public void clickButton(View view){
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Check my condition")){
            Intent i = new Intent(this, TestActivity.class);
                startActivity(i);
        }
        else if (button_text.equals("Go to the Cards")) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        else if (button_text.equals("Developers")) {
            Intent i = new Intent(this, CreditActivity.class);
            startActivity(i);
        }
    }

}
