package com.algorithmic.problems;

import com.algorithmic.utils.NumbersMagician;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Problem079 {
    public static void main(String[] args) throws IOException {
        new Problem079().solve();
    }

    NumbersMagician magician = new NumbersMagician();

    private void solve() throws IOException {
        List<Integer> numbers = readNumbersFromFile();
        Set<Integer> presentDigits = presentDigits(numbers);
        Map<Integer, Integer> numbersAfter = new HashMap<Integer, Integer>();
        for (Integer i : presentDigits) {
            int alwaysAfter = alwaysAfter(i, numbers);
            numbersAfter.put(alwaysAfter, i);
        }

        String password = stickPassword(numbersAfter);
        System.out.println(password);
    }

    private String stickPassword(Map<Integer, Integer> numbersAfter) {
        StringBuilder builder = new StringBuilder("");
        for (int i = 9; i >= -1; i--) {
            Integer digit = numbersAfter.get(i);
            if (digit != null) {
                builder.append(digit);
            }
        }
        return builder.toString();
    }

    Set<Integer> presentDigits(List<Integer> numbers) {
        Set<Integer> digits = new TreeSet<Integer>();
        for (Integer number : numbers) {
            char[] chars = Integer.toString(number).toCharArray();
            for (char aChar : chars) {
                digits.add(magician.asInt(aChar));
            }
        }
        return digits;
    }

    int alwaysAfter(int digit, List<Integer> numbers) {
        Set<Integer> digitsAfter = new HashSet<Integer>();
        for (Integer integer : numbers) {
            String number = Integer.toString(integer);
            int firstDigit = magician.asInt(number.charAt(0));
            int secondDigit = magician.asInt(number.charAt(1));
            int thirdDigit = magician.asInt(number.charAt(2));
            if (firstDigit == digit) {
                digitsAfter.add(secondDigit);
                digitsAfter.add(thirdDigit);
            }
            if (secondDigit == digit) {
                digitsAfter.add(thirdDigit);
            }
        }
        return digitsAfter.size();
    }

    private List<Integer> readNumbersFromFile() throws IOException {
        File file = new File("d:\\dev-projects\\Euler\\src\\main\\resources\\Problem079.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<Integer> numbers = new ArrayList<Integer>();
        while ((line = bufferedReader.readLine()) != null) {
            int number = Integer.parseInt(line);
            numbers.add(number);
        }
        return numbers;
    }
}
