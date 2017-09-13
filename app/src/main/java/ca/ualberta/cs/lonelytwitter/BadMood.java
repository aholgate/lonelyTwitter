package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by aholgate on 9/12/17.
 */

public class BadMood extends Moods {

    public BadMood(String mood){
        super(mood);
    }

    public BadMood(String mood, Date date){
        super(mood, date);
    }

    @Override  // don't need but it's helpful
    public String GetMood() {
        return "Bad Mood";
    }

}
