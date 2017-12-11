package com.algorythmic.tasks.problems.hackerrank.datastructures;

public class LeftArrayRotation {

    private static int[] leftRotation(int[] a, int d) {
        int len = a.length;
        if (d > len) { //d=20, a=8 => 4
            d = d % len;
        }
        int[] result = new int[len];
        //copy 3,4,5
        System.arraycopy(a, d, result, 0, len - d);
        //copy 1,2
        System.arraycopy(a, 0, result, len -d, d);
        return result;

        // Complete this function
    }

    public static void main(String... args) {
        int n = 5;
        int d = 7;
        int[] a = {1,2,3,4,5};
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


//        in.close();
    }
}
