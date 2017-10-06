package com.algorythmic.tasks.hackerrank;

import java.util.Scanner;


public class HackerRankInAString {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            // your code goes here
            String answer = doIt(s);
            System.out.println(answer);
        }
    }

    static String doIt(String s) {
        String hackerrank = "hackerrank";
        char[] chars = hackerrank.toCharArray();

        String testingStr = s;
        for (char ch : chars) {
            int i = testingStr.indexOf(ch);
            if (i == -1) {
                return "NO";
            } else {
                testingStr = testingStr.substring(i + 1);
            }
        }

        return "YES";
    }
}
