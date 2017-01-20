package com.example.jason.stressreliefapp.model;

/**
 * Created by dndql on 2017-01-12.
 */

public class QuestionsList {
    private  String Question;

    public  String AnxiousQuestions [] = {
            "Sleep-anxious?",
            "Peer-pressure-anxious?",
            "Work-anxious?",
            "Bullying-anxious?"
    };
    public  String DepressQuestions [] = {
            "Failed test?",
            "Low self esteem?",
            "Other people too good and you suck?",
            "Did you get dumped?"
    };
    public  String StressedQuestions [] = {
        "Work stress?",
        "Too many problems around you?",
        "Other ppl too good and u suck?",
        "Family issues?",
        "High expectations for you from other people and you suck?"
    };

    public void setString(String string, int n){
        if (string.equals("Depression")) {
            Question = DepressQuestions[n];
        } else if (string.equals("Anxiety")) {
            Question = AnxiousQuestions[n];
        } else if (string.equals("Stress")) {
            Question = StressedQuestions[n];
        }
    }

    public String toString(){
        return String.format("%s", Question);
    }
}
