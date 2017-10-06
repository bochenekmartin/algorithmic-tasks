package com.algorythmic.tasks.hackerrank;

public class ArraysProblem {

    public static void main(String[] args) {

        int arr[] = {12, 17, 70, 15, 22, 65, 21, 90};
        System.out.println("Original Array: ");
        for (int anArr1 : arr) {
            System.out.print(anArr1 + " ");
        }
        arr = separateEvenOddNumbers(arr);
        System.out.println("nArray after separating even and odd numbers : ");
        for (int anArr : arr) {
            System.out.print(anArr + " ");
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
        System.arraycopy(even, 0, arr, 0, evenLastIdx);

        int counter = evenLastIdx;
        for (int i = 0; i < oddLastIdx; i++) {
            int i1 = odd[i];
            arr[counter] = i1;
            counter++;
        }
        return arr;

    }
}
