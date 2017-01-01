package com.example.jason.stressreliefapp.model;

import com.example.jason.stressreliefapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2016-12-29.
 */

public class StressData {

    private static final String[] titles = {"Motivational quote - Stress",
            "Inspirational quote - Stress",
            "Inspirational quote - Stress" ,
            "Inspirational quote - Stress"
    };
    private static final String[] subTitles = {"“It's so hard to forget pain, but it's even harder to remember sweetness. We have no scar to show for happiness. We learn so little from peace.”",
            "Stressed spelled backward is desserts",
            "Life isn’t about waiting for the storm to pass, it’s about learning how to dance in the rain. – Vivian Greene",
            "“Challenges are what make life interesting and overcoming them is what makes life meaningful.” – Joshua J. Marine"
    };
    private static final String[] types = {"Quote","Story","Video", "Image"};

    private static final String[] content = {"quote content", "Story Content", "Video Link" ,"Image Link"};

    private static final int[] icon = {R.drawable.stress_quote, R.drawable.stress_quote1,
            R.drawable.stress_quote2, R.drawable.stress_quote3};

    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();

        //Repeat process 4 times, so that we have enough data to demonstrate a scrollable
        //RecyclerView
            //create ListItem with dummy data, then add them to our List
        for (int i = 0; i < titles.length; i++) {
            ListItem item = new ListItem();
            item.setImageResid(icon[i]);
            item.setTitle(titles[i]);
            item.setSubTitle(subTitles[i]);
            data.add(item);
        }
        return data;
    }
}
