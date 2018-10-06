package com.algorithmic.problems;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by agrzesik on Oct 26, 2010 at 7:34:47 PM
 */
public class Problem018 {
    private int size = 15;
    private String filePath = "D:\\dev-sources\\Euler\\Euler\\src\\prod\\project\\euler\\problems\\Problem018.txt";

    public Problem018() {
    }

    public Problem018(int size, String filePath) {
        this.size = size;
        this.filePath = filePath;
    }

    public static void main(String[] args) throws IOException {
        new Problem018().solve();
    }

    public void solve() throws IOException {
        int[][] triangle = initializeData();

        for (int rowNum = triangle.length - 2; rowNum >= 0; rowNum--) {
            for (int col = 0; col <= rowNum; col++) {
                triangle[rowNum][col] += Math.max(triangle[rowNum + 1][col], triangle[rowNum + 1][col + 1]);
            }
        }

        System.out.println(triangle[0][0]);
    }

    private int[][] initializeData() throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader file = new BufferedReader(fileReader);
        String line;

        int[][] bac = new int[size][size];

        int rowNum = 0;

        while ((line = file.readLine()) != null) {
            StringTokenizer tok = new StringTokenizer(line);
            int col = 0;
            while (tok.hasMoreElements()) {
                bac[rowNum][col] = Integer.parseInt(tok.nextToken());
                col++;
            }

            rowNum++;
        }
        return bac;
    }
}
