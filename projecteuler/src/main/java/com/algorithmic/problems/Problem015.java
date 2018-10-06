package com.algorithmic.problems;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: Oct 21, 2010
 */
public class Problem015 {
    private static final int SIZE = 21;

    public static void main(String[] args) {
        int[][] levels = new int[SIZE][SIZE];
        levels[0][0] = 1;

        for (int y = 1; y < levels.length; y++) {
            int[] level = levels[y];
            int[] prevLevel = levels[y-1];
            for (int i = 0; i < level.length; i++) {
                int i1 = prevLevel[i];
                int i2 = i > 0 ? prevLevel[i - 1] : 0;
                level[i] = i1 + i2; 
            }
        }

        long sum = 0;
        for (int i = 0; i < levels.length; i++) {
            int[] level = levels[i];
            for (int j = 0; j <= i; j++) {
                int i1 = level[j];
                System.out.print("\t\t" + i1);

                sum += i1;
            }
            System.out.print("\n");

        }
        System.out.println(sum - 1);
    }

}
