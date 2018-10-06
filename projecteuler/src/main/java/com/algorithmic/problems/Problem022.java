package com.algorithmic.problems;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * User: Martin Bochenek
 * Date: 11/22/10
 */
public class Problem022 {
    public static void main(String[] args) throws IOException {
        new Problem022().solve();
    }

    private void solve() throws IOException {
        List<String> allNames = readNamesFromFile();
        Collections.sort(allNames);

        int totalScores = 0;

        for (int i = 0; i < allNames.size(); i++) {
            int nameScore = getNameScore(allNames.get(i), i+1);
            totalScores += nameScore;
        }
        System.out.println(totalScores);
    }

    private int getNameScore(String name, int placeInList) {
        int score = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            score += ((int) ch) - 64;  //ch is always upper case
        }
        return score * placeInList;
    }

    private List<String> readNamesFromFile() throws IOException {
        String fileName = "Problem022.txt";
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        int ch;
        NamesCollector collector = new NamesCollector();
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

    class NamesCollector {
        private StringBuilder nameBuilder = new StringBuilder("");
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
