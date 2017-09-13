package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by aholgate on 9/12/17.
 */

public abstract class Tweet {

    // attributes
    private String message;
    private Date date;


    // constructors
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    // functions;methods
    public abstract Boolean isImportant();

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            // throw exception
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }




}
