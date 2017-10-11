package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Ashley on 2017-10-10.
 */

public class TweetListText extends ActivityInstrumentationTestCase2 {

    public TweetListText() {
        super(LonelyTwitterActivity.class);
    }

    // test to see if we have added the tweet to the list of tweets
    // and assert that this is true
    public void testAddTweet() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));

    }

    // ctest to see if we have deleted the tweet from the list of tweets
    // and assert that the tweet list no longer has it
    public void testDeleteTweet() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        tweets.deleteTweet(myTweet);

        assertFalse(tweets.hasTweet(myTweet));

    }


    public void testHasTweet() {
        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        assertFalse(tweets.hasTweet(myTweet));

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));
    }

    public void testGetTweet() {
        // getTweet method will take an index and will return the tweet at that index

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        Tweet fetchedTweet = tweets.getTweet(0);

        assertEquals(myTweet.getMessage(), fetchedTweet.getMessage());

        assertEquals(myTweet.getDate(), fetchedTweet.getDate());

    }

    public void testGetTweets() {

    }

    public void testGetCount() {

    }

    /* addTweet() -- should throw an IllegalArgumentException when one tries to add a duplicate tweet
    getTweets() -- sould return a list of tweets in chronological order
    hasTweet() -- should return true if there is a tweet that equals() another tweet
    getCount() -- should accurately count up the tweets */

}
