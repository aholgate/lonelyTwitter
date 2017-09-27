/*
 * ImportantTweet
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
 * Repersents important tweet.
 *
 * @author yourname
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public class ImportantTweet extends Tweet implements Tweetable {

    /**
     * Constructs important tweet object.
     *
     * @param message tweet message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs important tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Checks if tweet is important.
     *
     * @return True
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
