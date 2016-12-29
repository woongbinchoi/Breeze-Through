package com.example.jason.stressreliefapp.model;

import com.example.jason.stressreliefapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2016-12-29.
 */

public class StressData {

    private static final String[] titles = {"Motivational quote title - Stress",
            "Inspirational story title",
            "Video link title" ,
            "Image Link Title"
    };
    private static final String[] subTitles = {"Description",
            "Description",
            "Description",
            "Description"
    };
    private static final String[] types = {"Quote","Story","Video", "Image"};

    private static final String[] content = {"quote content", "Story Content", "Video Link" ,"Image Link"};

    private static final int[] icon = {R.drawable.ic_star_black_24dp, R.drawable.ic_star_black_24dp,
            R.drawable.ic_tonality_black_24dp, R.drawable.ic_tonality_black_24dp};

    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();

        //Repeat process 4 times, so that we have enough data to demonstrate a scrollable
        //RecyclerView
        for (int x = 0; x < 4; x++) {
            //create ListItem with dummy data, then add them to our List
            for (int i = 0; i < titles.length; i++) {
                ListItem item = new ListItem();
                item.setImageResid(icon[i]);
                item.setTitle(titles[i]);
                item.setSubTitle(subTitles[i]);
                data.add(item);
            }
        }
        return data;
    }
}
