/*
 * Tweet
 *
 * Version 1.0
 *
 * September 26, 2017
 *
 * Copyright 2017 Team X. CMPUT 301. University ofAlberta, All Rights Reserved.
 * You may use, distribute, or modify under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You may find a copy of licence in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

/**
 *  Represents a tweet.
 *
 * @author yourname
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public abstract class Tweet {

    private String message;
    private Date date;

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Returns if tweet important or not.
     *
     * @return boolean value
     */
    public abstract Boolean isImportant();

    /**
     *  Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Gets tweet message.
     *
     * @return tweet message
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * Gets tweet date.
     *
     * @return tweet date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets tweet date.
     *
     * @param date tweet date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Converts tweet to a string.
     *
     * @return date and message concatenated
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
