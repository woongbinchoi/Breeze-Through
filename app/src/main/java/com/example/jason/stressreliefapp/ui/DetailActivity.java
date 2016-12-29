package com.example.jason.stressreliefapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.jason.stressreliefapp.DatabaseHelper;
import com.example.jason.stressreliefapp.R;
import com.example.jason.stressreliefapp.adapter.DerpAdapter;
import com.example.jason.stressreliefapp.adapter.DetailAdapter;
import com.example.jason.stressreliefapp.model.DetailData;
import com.example.jason.stressreliefapp.model.ListItem;
import com.example.jason.stressreliefapp.model.StressData;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity implements DetailAdapter.ItemClickCallback {
    private static final String Bundle_Extras = "Bundle_Extras";
    private static final String Extra_quote = "Extra_quote";
    private static final String Extra_Altr = "Extra_atir";

    //for checking the stress type
    private static final String Bundle_Main = "Bundle_Main";
    private static final String Extra_Type = "Extra_Type";

    private RecyclerView recview;
    private DetailAdapter adapter;

    private ArrayList listData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Bundle extras = getIntent().getBundleExtra(Bundle_Main);
        if (extras.getString(Extra_Type).equals("Anxiety")) {
            listData = (ArrayList)DetailData.getListData();
        } else {
            listData = (ArrayList) StressData.getListData();
        }

        recview = (RecyclerView)findViewById(R.id.rec_list);
        recview.setLayoutManager(new LinearLayoutManager(this));

        adapter = new DetailAdapter(listData, this);
        recview.setAdapter(adapter);
        adapter.setItemClickCallback(this);

    }

    @Override
    public void onitemclick(int p) {
        ListItem item = (ListItem) listData.get(p);

        Intent j = new Intent(this, ItemDetailActivity.class);

        Bundle extras = new Bundle();
        extras.putString(Extra_quote, item.getTitle());
        extras.putString(Extra_Altr, item.getSubTitle());

        j.putExtra(Bundle_Extras, extras);

        startActivity(j);
    }

    @Override
    public void onSecondaryclick(int p) {
        ListItem item = (ListItem)listData.get(p);
        if (item.isFavourite()) {
            item.setFavourite(false);
        } else {
            item.setFavourite(true);
        }

        adapter.setListData(listData);
        adapter.notifyDataSetChanged();
    }
}
