package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by aholgate on 9/12/17.
 */

public class ImportantTweet extends Tweet implements Tweetable{

    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date){
        super(message, date);
    }

    //@Override  // don't need but it's helpful
    //public Boolean isImportant(){
        //return Boolean.TRUE;
    //}
}

