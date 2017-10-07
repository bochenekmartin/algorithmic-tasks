package com.algorythmic.tasks.hackerrank.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by SG0212051 on 8/27/2017.
 */
public class CommonChild {

    //tofo

    static int commonChild(String s1, String s2) {
        // Complete this function
        String s1Updated = withNoDuplicates(s1, s2);
        if (s1Updated.length() == 0) {
            return 0;
        }
        String s2Updated = withNoDuplicates(s2, s1Updated);

        return getStrings(s1Updated, s2Updated);
    }

    private static int getStrings(String s1, String s2) {
        List<String> substrings = getSubstringsFromS1(s1);
        Set<String> set = new HashSet<>(s1.length() * 2);
        for (String s : substrings) {
            System.out.println();
            if (s.length() == 1) {
                substrings.add(s);
            } else {
                StringBuilder b = new StringBuilder(s.length());
                char[] chars = s.toCharArray();
                String s2substr;
                for (char c : chars) {
                    int i = s2.indexOf(c);
                    if (i == -1) {
                        set.add(b.toString());
                        b.delete(0, b.length());
                    }
//                    i.
                }
            }
        }

        int theLongest = 0;

        return theLongest;
    }

    private static List<String> getSubstringsFromS1(String s1) {
        List<String> s = new ArrayList<>(s1.length());
        for (int i = 0; i < s1.length(); i++) {
            s.add(s1.substring(i));
        }
        return s;
    }

    private static String withNoDuplicates(String s1, String s2) {
        StringBuilder b = new StringBuilder(s1.length());
        char[] chars = s1.toCharArray();
        for (char c : chars) {
            if (s2.contains(Character.toString(c))) {
                b.append(c);
            }
        }
        return b.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "ABCDEF";
        //in.next();
        String s2 = "FBDAMN";//in.next();
        int result = commonChild(s1, s2);
        System.out.println(result);
    }

}
