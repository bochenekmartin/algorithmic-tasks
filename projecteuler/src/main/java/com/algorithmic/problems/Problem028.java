package com.algorithmic.problems;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: 11/25/10
 */
public class Problem028 {

    public static void main(String[] args) {
        new Problem028().solve();
    }

    int size = 1001;
    private int[][] spiral = new int[size][size];

    private void solve() {
        fillDiagonals();
        long result = totalOfDiagonalsValues();
        System.out.println(result);
    }

    private long totalOfDiagonalsValues() {
        long total = 0L;
        for (int i = 0; i < spiral.length; i++) {
            total += spiral[i][i];
        }
        for (int i = 0; i < spiral.length; i++) {
            total += spiral[spiral.length - i - 1][i];
        }
        int center = size / 2;
        total -= spiral[center][center];
        return total;
    }

    private void printSpiral() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(spiral[row][col] + " ");
            }
            System.out.println();
        }
    }

    private void fillDiagonals() {
        writeRightUp();
        writeLeftUp();
        writeLeftDown();
        writeRightDown();
    }

    private void writeRightDown() {
        int currentRow = size / 2;
        int currentCol = size / 2;
        int step = 0;
        while (currentCol > 0) {
            currentCol--;
            currentRow++;
            step += 2;
            spiral[currentRow][currentCol + step] = spiral[currentRow][currentCol] - step;
        }
    }

    private void writeLeftDown() {
        int currentRow = size / 2;
        int currentCol = size / 2;
        int step = 0;
        while (currentRow > 0) {
            currentCol--;
            currentRow--;
            step += 2;
            spiral[currentRow + step][currentCol] = spiral[currentRow][currentCol] - step;
        }
    }

    private void writeLeftUp() {
        int currentRow = size / 2;
        int currentCol = size / 2;
        int step = 0;
        while (currentRow > 0) {
            currentCol++;
            currentRow--;
            step += 2;
            spiral[currentRow][currentCol - step] = spiral[currentRow][currentCol] - step;
        }
    }

    private void writeRightUp() {
        int currentRow = size / 2;
        int currentCol = size / 2;
        int number = 1;
        while (currentRow >= 0) {
            spiral[currentRow][currentCol] = number * number;
            currentCol++;
            currentRow--;
            number += 2;
        }
    }
}
