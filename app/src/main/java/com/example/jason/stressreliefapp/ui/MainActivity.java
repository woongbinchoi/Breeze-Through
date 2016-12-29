package com.example.jason.stressreliefapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jason.stressreliefapp.R;
import com.example.jason.stressreliefapp.adapter.DerpAdapter;
import com.example.jason.stressreliefapp.model.DerpData;
import com.example.jason.stressreliefapp.model.ListItem;
import com.example.jason.stressreliefapp.model.StressData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements DerpAdapter.itemClickCallback {
    private static final String Bundle_Main = "Bundle_Main";
    private static final String Extra_Type = "Extra_Type";

    private RecyclerView recView;
    private DerpAdapter adapter;

    private ArrayList listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listData = (ArrayList)DerpData.getListData();

        recView = (RecyclerView)findViewById(R.id.rec_list);
        //LayoutManager: GridLayoutManager or StaggeredGridLayoutManager
        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new DerpAdapter(DerpData.getListData(), this);
        recView.setAdapter(adapter);
        adapter.setItemClickCallback(this);

    }

    @Override
    public void onItemClick(int p) {
        ListItem item = (ListItem) listData.get(p);

        Intent i = new Intent(this, DetailActivity.class);

        Bundle extras = new Bundle();
        extras.putString(Extra_Type, item.getSubTitle().toString());

        i.putExtra(Bundle_Main, extras);

        startActivity(i);
    }

    @Override
    public void onSecondaryiconClick(int p) {
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
