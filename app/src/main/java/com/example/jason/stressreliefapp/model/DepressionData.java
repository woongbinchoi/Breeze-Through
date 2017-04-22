package com.example.jason.stressreliefapp.model;

import com.example.jason.stressreliefapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2016-12-30.
 */

public class DepressionData {

    private String Title;
    private String Content;
    private int Picture;

    private static final String[] titles = {"Motivational quote - Depression",
            "Help Others",
            "Inspirational Story - Depression" ,
            "Be Patient"
    };
    private static final String[] subTitles = {"A pearl is a beautiful thing that is produced by an injured life. It is the tear [that results] from the injury of the oyster. The treasure of our being in this world is also produced by an injured life. If we had not been wounded, " +
            "if we had not been injured, then we will not produce the pearl. — Stephan Hoeller",
            "The greatest degree of inner tranquility comes from the development of love and compassion. The more we care for the happiness of others, the greater is our own sense of well-being." +
                    "— Tenzin Gyatso",
            "I was diagnosed when i was 15 with severe depression and anxiety. After 2 months of saying I didn't need or want an anti-depressant and instead trying natural methods and self CBT it got a lot worse and i was no longer allowed to sleep with any cord, electronic or sharp object in my room. I was put on a SSRI and for over a year i worked with a child psychologist and later a cognitive behavioral therapist. After 5 months i was told i could begin CBT. I was determined to get better because i couldn't let my 6 year old sister grow up without me. I accepted a challenge put forward to me which was to watch a movie with a girl i had met. I had my parents in the cinema with me without the girl noticing, and i couldn't have done it without them. The next week i was challenged again to text her and say i thought she looked beautiful and that i had a good time (i ended up fainting). However within a year, i was a more confident person and i was no longer a suicide threat but i would still have an occasional spiral (at least every 5 or 6 weeks). I had to change to another SSRI as it was no longer effective. However as i was sensitive to SSRIs I had negative reactions and after 3 months of playing around, I was put on Lexapro without any negative reaction. I stopped seeing my cognitive behavioral therapist, and began to see my psychologist every fortnight instead of once or twice a week within two years of treatment. I'm now in my third year and i no longer see a psychologist but i am still on Lexapro. I can now tell go up to strangers and talk to them about anything, including telling them they look beautiful without a single paralyzing feeling. At the beginning of this year I met my girlfriend, who was attracted to my new found confidence and we have fallen in love.\n" +
                    "Some people will have longer or shorter journeys, but from what i've observed- every journey will have it's challenges. There will be times where there will be failures, but with the right support and determination, these can become opportunities to grow stronger. In 6 months or 6 years time; will these seemingly big failures be important at all? I cannot believe how i have grown as a person. I have been able to self-actualise and develop through it to become a positive and a realistic person who has never been happier. To any of those who read this and are suffering, you CAN get better. It may feel impossible sometimes, but if you are, like i was, at rock bottom- what have you got to lose? ",
            "Be patient toward all that is unsolved in your heart and try to love the questions themselves, like locked rooms and like books that are now written in a very foreign tongue. Do not now seek the answers, which cannot be given you because you would not be able to live them. And the point is, to live everything. Live the questions now. Perhaps you will then gradually, without noticing it, live along some distant da into the answer. – Rainer Maria Rilke "
    };
    private static final String[] types = {"Quote","Story","Video", "Image"};

    private static final String[] content = {"quote content", "Story Content", "Video Link" ,"Image Link"};

    private static final int[] icon = {R.drawable.depression_quote1, R.drawable.depression_quote2,
            R.drawable.depression_quote3, R.drawable.depression_quote};

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

    public void setcontents(String str, int num){
        Title = titles[num];
        Content = subTitles[num];
        Picture = icon[num];
    }

    public String toTitle(){
        return String.format("%s", Title);
    }
    public String toContent(){
        return String.format("%s", Content);
    }
    public int toImage() {
        return Picture;
    }

}

