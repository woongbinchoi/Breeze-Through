package com.example.jason.stressreliefapp.model;

import com.example.jason.stressreliefapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2016-12-23.
 */
public class DerpData {
    private static final String[] titles = {"Anxeity.....",
            "Stress.......",
            "Depression....."
    };

    private static final String[] subTitles = {"Anxiety",
            "Stress",
            "Depression",

    };
    private static final int[] icon = {R.drawable.anxiety_disorder, R.drawable.eliminate_your_stress, R.drawable.depression_image};

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
