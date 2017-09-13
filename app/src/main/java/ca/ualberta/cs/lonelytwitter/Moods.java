package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by aholgate on 9/12/17.
 */

public abstract class Moods {

    private String mood;
    private Date date;

    public Moods(String mood) {
        this.mood = mood;
        this.date = new Date();
    }

    public Moods(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMood();

    public String listMoods() {
        return "[GoodMood, BadMood]";
    }
}
