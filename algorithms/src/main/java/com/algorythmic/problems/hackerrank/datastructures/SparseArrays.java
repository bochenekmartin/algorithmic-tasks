package com.algorythmic.problems.hackerrank.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int s = Integer.valueOf(in.nextLine());
        Map<String, Integer> map = new HashMap<>(s * 2);
        for (int i = 0; i < s; i++) {
            String arg = in.nextLine();
            map.merge(arg, 1, (a, b) -> a + b);
        }

        s = Integer.valueOf(in.nextLine());

        for (int i = 0; i < s; i++) {
            String s1 = in.nextLine();
            Integer integer1 = map.getOrDefault(s1, 0);
            System.out.println(integer1);
        }
    }
}
