package com.algorythmic.problems.hackerrank.datastructures;

import java.util.Scanner;
import java.util.TreeSet;

public class QHeap1 {

    public static void main(String... args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Integer numberOfCommands = Integer.valueOf(s);

        TreeSet<Integer> heap = new TreeSet<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String cmd = in.nextLine();
            if (cmd.length() == 1) {
                System.out.println(heap.first());
                continue;
            }
            int e = Integer.valueOf(cmd.substring(2));
            if (cmd.charAt(0) == '1') {
                heap.add(e);
                continue;
            }
            if (cmd.charAt(0) == '2') {
                heap.remove(e);
            }
        }
    }


}
