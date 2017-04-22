package com.example.jason.stressreliefapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jason.stressreliefapp.R;
import com.example.jason.stressreliefapp.model.DepressionData;
import com.example.jason.stressreliefapp.model.DetailData;
import com.example.jason.stressreliefapp.model.StressData;

public class SolutionActivitiy extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution_activitiy);
        String type = getIntent().getStringExtra("Type");
        int integer = getIntent().getIntExtra("Int", 0);
        TextView title = (TextView)findViewById(R.id.Title);
        TextView content = (TextView)findViewById(R.id.Content);
        TextView solution = (TextView)findViewById(R.id.SolutionText);
        ImageView iv = (ImageView)findViewById(R.id.Image);
        switch (type) {
            case "DEP":
                DepressionData depression = new DepressionData();
                depression.setcontents(type,integer);
                title.setText(depression.toTitle());
                content.setText(depression.toContent());
                solution.setText("For your depression...");
                iv.setImageResource(depression.toImage());
                break;
            case "ANX":
                DetailData anxiety = new DetailData();
                anxiety.setcontents(type,integer);
                title.setText(anxiety.toTitle());
                content.setText(anxiety.toContent());
                solution.setText("For your anxiety...");
                iv.setImageResource(anxiety.toImage());
                break;
            case "STR":
                StressData stress = new StressData();
                stress.setcontents(type,integer);
                title.setText(stress.toTitle());
                content.setText(stress.toContent());
                solution.setText("For your stress...");
                iv.setImageResource(stress.toImage());
                break;



        }
    }
}
