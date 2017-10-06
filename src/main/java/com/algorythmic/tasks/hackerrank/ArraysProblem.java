package com.algorythmic.tasks.hackerrank;

public class ArraysProblem {

    public static void main(String[] args) {

        int arr[] = {12, 17, 70, 15, 22, 65, 21, 90};
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        arr = separateEvenOddNumbers(arr);
        System.out.println("nArray after separating even and odd numbers : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] separateEvenOddNumbers(int[] arr) {
        int[] odd = new int[arr.length];
        int[] even = new int[arr.length];
        int oddLastIdx = 0;
        int evenLastIdx = 0;

        for (int anArr : arr) {
            if (anArr % 2 == 0) {
                even[evenLastIdx] = anArr;
                evenLastIdx++;
            } else {
                odd[oddLastIdx] = anArr;
                oddLastIdx++;
            }
        }
        for (int i = 0; i < evenLastIdx; i++) {
            int i1 = even[i];
            arr[i] = i1;
        }
        int counter = evenLastIdx;
        for (int i = 0; i < oddLastIdx; i++) {
            int i1 = odd[i];
            arr[counter] = i1;
            counter++;
        }
        return arr;

    }
}
