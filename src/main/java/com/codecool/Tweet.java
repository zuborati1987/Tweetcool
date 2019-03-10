package com.codecool;

public class Tweet {
    private String name;
    private String tweet;

    public Tweet(String name, String tweet) {
        this.name = name;
        this.tweet = tweet;
    }

    public String getName() {
        return name;
    }

    public String getTweet() {
        return tweet;
    }
}
