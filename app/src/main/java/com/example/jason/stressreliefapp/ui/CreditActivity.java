package com.example.jason.stressreliefapp.ui;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.jason.stressreliefapp.R;
import com.example.jason.stressreliefapp.adapter.PagerAdapter;

public class CreditActivity extends FragmentActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);
        viewPager = (ViewPager)findViewById(R.id.pager);
        PagerAdapter padapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(padapter);
        viewPager.setOffscreenPageLimit(6);
        viewPager.setCurrentItem(1);
    }
}
