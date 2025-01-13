package com.example.project;
import java.util.Arrays;
import java.util.Random;

public class Day2 {
    public static String[][] nameSort(String[] names) {
        int totalNames = names.length;
        String[] niceList = new String[totalNames];
        String[] naughtyList = new String[totalNames];
        int niceCount = 0;
        int naughtyCount = 0;
        for (String name : names) {
            if (Math.random() >= 0.5) {
                niceList[niceCount++] = name;
            } else {
                naughtyList[naughtyCount++] = name;
            }
        }
        return new String[][]{niceList, naughtyList};
    }

public static void main(String[] args) {
        String[] testNames = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Henry"};
        String[][] sortedLists = nameSort(testNames);
        System.out.println(sortedLists);
    }
}