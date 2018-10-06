package com.algorithmic.problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by agrzesik on Oct 24, 2010 at 4:40:49 PM
 */
public class Problem011 {
    private int[][] bac;
    int max;

    public static void main(String[] args) throws Exception {
        new Problem011().solve();
    }

    private void solve() throws Exception {
        bac = readData();

        for (int row = 0; row < bac.length; row++) {
            int[] ints = bac[row];

            for (int col = 0; col < ints.length; col++) {
                calcRight(row, col);
                calcDown(row, col);
                diagRightDown(row, col);
                diagRightUp(row, col);
            }
        }

        System.out.println(max);
    }

    private void calcRight(int row, int col) {
        if (col <= 16) {
            int i = bac[row][col] * bac[row][col + 1] * bac[row][col + 2] * bac[row][col + 3];
            if(max < i)
            {
                max = i;
                System.out.println("right max: " + row + " " + col + " = " + i);
            }
        }
    }

    private void calcDown(int row, int col) {
        if (row <= 16) {
            int i = bac[row][col] * bac[row + 1][col] * bac[row + 2][col] * bac[row + 3][col];
            if(max < i)
            {
                max = i;
                System.out.println("down max: " + row + " " + col + " = " + i);
            }
        }
    }

    private void diagRightDown(int row, int col) {
        if (col <= 16 && row <= 16) {
            int i = bac[row][col] * bac[row + 1][col + 1] * bac[row + 2][col + 2] * bac[row + 3][col + 3];
            if(max < i)
            {
                max = i;
                System.out.println("diag max: " + row + " " + col + " = " + i);
            }
        }
    }

    private void diagRightUp(int row, int col) {
        if (col <= 16 && row > 2) {
            int i = bac[row][col] * bac[row - 1][col + 1] * bac[row - 2][col + 2] * bac[row - 3][col + 3];
            if(max < i)
            {
                max = i;
                System.out.println("diag max: " + row + " " + col + " = " + i);
            }
        }
    }

    private int[][] readData() throws IOException {
        FileReader fileReader = new FileReader("D:\\dev-sources\\Euler\\Euler\\src\\prod\\project\\euler\\problems\\Problem011.txt");
        BufferedReader file = new BufferedReader(fileReader);
        String line;

        int[][] bac = new int[20][20];
        int row = 0;
        while ((line = file.readLine()) != null) {
            StringTokenizer tok = new StringTokenizer(line);
            int col = 0;
            while (tok.hasMoreElements()) {
                bac[row][col] = Integer.parseInt(tok.nextToken());
                col++;
            }

            row++;
        }
        return bac;
    }
}
