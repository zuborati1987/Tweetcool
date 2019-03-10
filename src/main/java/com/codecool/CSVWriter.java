package com.codecool;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CSVWriter {

    public void writingToCSV(Tweet tweet) {
        try {
                PrintWriter pw = new PrintWriter(new FileWriter(("Tweets.csv"), true));
                StringBuilder sb = new StringBuilder();
                sb.append(tweet.getName() + ",");
                sb.append(tweet.getTweet());
                sb.append("\n");
                pw.append(sb.toString());
                pw.close();



        } catch (
                Exception e) {
            System.out.println("file not found exception");
        }
    }
}
