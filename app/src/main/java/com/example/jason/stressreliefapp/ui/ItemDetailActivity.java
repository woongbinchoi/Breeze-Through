package com.example.jason.stressreliefapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jason.stressreliefapp.R;

public class ItemDetailActivity extends AppCompatActivity {
    private static final String Bundle_Extras = "Bundle_Extras";
    private static final String Extra_quote = "Extra_quote";
    private static final String Extra_Altr = "Extra_atir";

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getBundleExtra(Bundle_Extras);

        ((TextView)findViewById(R.id.lbl_quote_text)).setText(extras.getString(Extra_quote));
        ((TextView)findViewById(R.id.lbl_quote_attribution)).setText(extras.getString(Extra_Altr));

    }
}
