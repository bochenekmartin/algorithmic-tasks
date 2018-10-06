package com.algorithmic.problems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: 11/10/10
 */
public class Problem013 {
    public static void main(String[] args) throws Exception {
        new Problem013().solve();
    }

    private void solve() throws Exception {
        File file = new File("Problem013.txt");
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        long result = 0;

        while ((line = bufferedReader.readLine()) != null) {
            line = line.substring(0, 11);
            result += Long.valueOf(line);
        }
        System.out.println(result);
        System.out.println(Long.toString(result).length());
        System.out.println(Long.toString(result).substring(0,10));
    }
}
