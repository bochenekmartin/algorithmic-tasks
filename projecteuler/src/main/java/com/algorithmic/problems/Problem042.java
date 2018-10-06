package com.algorithmic.problems;

import com.algorithmic.utils.LettersMagician;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: 12/9/10
 */
public class Problem042 {

    public static void main(String[] args) throws IOException {
        new Problem042().solve();
    }

    private void solve() throws IOException {
        createTriangleNumbers();
        List<String> words = readWordsFromFile();
        int numberOfTriangleWords = 0;
        for (String word : words) {
            if (isTriangle(word)) {
                numberOfTriangleWords++;
            }
        }
        System.out.println(numberOfTriangleWords);
    }

    private void createTriangleNumbers() {
        for (int i = 1; i < 200; i++) {
            triangleNumbers.add(triangleNumber(i));
        }
    }

    private int triangleNumber(int i) {
        return (int) (0.5 * i * (i + 1));
    }

    List<Integer> triangleNumbers = new ArrayList<Integer>();
    LettersMagician magician = new LettersMagician();

    boolean isTriangle(String word) {
        char[] letters = word.toCharArray();
        int positionsAmount = 0;
        for (char letter : letters) {
            positionsAmount += magician.alphabeticalPosition(letter);
        }
        return triangleNumbers.contains(positionsAmount);
    }

    private List<String> readWordsFromFile() throws IOException {
        String fileName = "Problem042.txt";
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        int ch;
        WordsCollector collector = new WordsCollector();
        do {
            ch = fileReader.read();
            if (ch != -1 && Character.isLetter(ch)) {
                collector.addChar((char) ch);
            }
            if (ch != -1 && !Character.isLetter(ch)) {
                collector.forceNewName();
            }
        } while (ch != -1);
        fileReader.close();
        return collector.getAllNames();
    }

    static class WordsCollector {
        private StringBuilder nameBuilder = new StringBuilder();
        private List<String> names = new ArrayList<String>();

        public void addChar(char ch) {
            nameBuilder.append(ch);
        }

        public void forceNewName() {
            if (nameBuilder.length() > 0) {
                names.add(nameBuilder.toString());
                nameBuilder.delete(0, nameBuilder.length());
            }
        }

        public List<String> getAllNames() {
            return names;
        }
    }
}
