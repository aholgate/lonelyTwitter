package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

import static java.lang.Boolean.FALSE;

/**
 * Created by aholgate on 9/12/17.
 */

public class NormalTweet extends Tweet{


    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }


    @Override
    public Boolean.isImportant(){
        retun Boolesn.FALSE

    }
}
