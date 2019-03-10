package com.codecool;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSReader {
    String[][] tweetArr;
    List<Tweet> tweets = new ArrayList<>();

    public List<Tweet> ReadingFromCSV() {
        int lineCount = 0;
        File f = new File("Tweets.csv");
        try {
            Scanner fileReader = new Scanner(f);
            while (fileReader.hasNextLine()) {
                lineCount++;
                fileReader.nextLine();
            }
            tweetArr = new String[lineCount][5];
        } catch (Exception e) {
            System.out.println("errormsg");
        }
        int x = 0;
        try {
            Scanner fileReader2 = new Scanner(f);
            while (fileReader2.hasNextLine()) {
                String line = fileReader2.nextLine();
                tweetArr[x] = line.split(",");
                x++;
            }
        } catch (Exception e) {
            System.out.println("errormsg");
        }
        for (String[] list : tweetArr) {
            tweets.add(new Tweet(list[0], list[1]));
        }
        return tweets;
    }
}
