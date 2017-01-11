package com.example.jason.stressreliefapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.jason.stressreliefapp.model.FragmentFour;
import com.example.jason.stressreliefapp.model.FragmentOne;
import com.example.jason.stressreliefapp.model.FragmentThree;
import com.example.jason.stressreliefapp.model.FragmentTwo;

/**
 * Created by dndql on 2017-01-03.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentThree();
            case 3:
                return new FragmentFour();

            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public float getPageWidth(int position){
        return (0.5f);
    }
}
