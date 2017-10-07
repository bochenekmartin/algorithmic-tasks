package com.algorythmic.tasks.hackerrank.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagrams {

    public static void main(String[] args) {
        String out1 = "pangram";
        String out2 = "not pangram";
        Scanner in = new Scanner(System.in);

        String s = in.nextLine().trim().toLowerCase();

        Set<Character> set = new HashSet<>(40);
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            set.add(aChar);
            if (set.size() >= 27) {
                System.out.println(out1);
                return;
            }
        }
        if (set.size() < 27) {
            System.out.println(out2);
        }


    }
}
