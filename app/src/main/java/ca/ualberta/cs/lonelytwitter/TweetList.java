package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Ashley on 2017-10-10.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    // add tweet to a list of tweets
    public void addTweet(Tweet tweet) throws IllegalArgumentException {
        // addTweet() -- should throw an IllegalArgumentException when one tries to add a duplicate tweet
        if (tweets.contains(tweet)) {

            throw new IllegalArgumentException("The tweet already exists.");

        } else {

            tweets.add(tweet);

        }
    }

    // delete a tweet from the list of tweets
    public void deleteTweet(Tweet tweet) {

        tweets.remove(tweet);

    }

    // check if a list of tweets has the specified tweet
    // if it does, return True, else return False
    public boolean  hasTweet(Tweet tweet) {
        // hasTweet() -- should return true if there is a tweet that equals() another tweet

        return tweets.contains(tweet);

    }

    // get tweet at given index from a list of tweets
    public Tweet getTweet(int index) {

        return tweets.get(0);

    }

    public int getCount() {
        // getCount() -- should accurately count up the tweets

        return tweets.size();

    }

    public ArrayList<Tweet> getTweets() {
        // getTweets() -- sould return a list of tweets in chronological order

        ArrayList<Tweet> sortedTweets = new ArrayList<Tweet>();

        int n = sortedTweets.size();
        Tweet temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (sortedTweets.get(j - 1).getDate().before(sortedTweets.get(j).getDate())) {
                    temp = sortedTweets.get(j - 1);
                    sortedTweets.set(j - 1, sortedTweets.get(j));
                    sortedTweets.set(j, temp);
                }

            }
        }

        return sortedTweets;
    }

}
