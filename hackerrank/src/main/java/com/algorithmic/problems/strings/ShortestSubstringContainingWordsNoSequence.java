package com.algorithmic.problems.strings;

import java.util.*;

// dostaje stringa (jakis tekst) i drugi parametr to tablica wyrazow - trzeba
// zwrocic najkrotszy substring zawierajacy te wyrazy z tablicy

public class ShortestSubstringContainingWordsNoSequence {

    private final String input = "Amazon com Inc doing business as Amazon is an American electronic commerce and cloud computing company based in " +
            "Amazon com Inc doing business as Amazon is an American electronic cloud computing company based in " +
            "Seattle Washington that was founded by Jeff Bezos on July 5 1994 The tech giant is the largest Internet retailer in the world as measured " +
            "by revenue and market capitalization and second largest after Alibaba Group in terms of total sales The amazon com website started as " +
            "an online bookstore and later diversified to sell video downloads streaming MP3 downloads streaming audiobook downloads streaming " +
            "software video games electronics apparel furniture food toys and jewelry The company also produces consumer electronics Kindle " +
            "e-readers Fire tablets Fire TV and Echo and is the world's largest provider of cloud infrastructure services IaaS and PaaS " +
            "Amazon also sells certain low-end products under its in-house brand AmazonBasics".toLowerCase();

    private final String[] search = {"amazon", "electronic", "company"};
    private static final int NOT_FOUND = -1;

    public static void main(String[] args) {
        ShortestSubstringContainingWordsNoSequence solution = new ShortestSubstringContainingWordsNoSequence();
        solution.doIt2();
    }

    private void doIt2() {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(search).forEach(s -> map.put(s, -1));

        String[] words = input.toLowerCase().split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (map.containsKey(word)) {
                //start logic for desired word

                int index = map.get(word);
                if (index == -1 || map.containsValue(-1) || diffIsLower(map, word, i)) {
                    //this word found for the first time or
                    //this word found previously but some other words not found yet or
                    //all words already found and check if diff is lower
                    map.put(word, i);
                }
            }
        }

        Integer min = Collections.min(map.values());
        Integer max = Collections.max(map.values());
        for (int i = min; i <= max; i++) {
            String word = words[i];
            System.out.print(word.concat(" "));
        }
    }

    private boolean diffIsLower(Map<String, Integer> map, String word, int i) {
        int diffNow = diff(map);

        Map<String, Integer> tempMap = new HashMap<>(map);
        tempMap.put(word, i);

        return diffNow > diff(tempMap);
    }

    private int diff(Map<String, Integer> map) {
        Integer maxNow = Collections.max(map.values());
        Integer minNow = Collections.min(map.values());

        return maxNow - minNow;
    }

    private void doIt() {
        Map<String, List<Integer>> indexes = getIndexes();
        printIndexes(indexes);

        Holder[] holders = new Holder[search.length];
        for (int i = 0; i < search.length; i++) {
            holders[i] = new Holder(search[i], indexes.get(search[i]));
        }

        findLowestDifference(holders);
    }

    private void findLowestDifference(Holder[] holders) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (Holder h : holders) {
            for (int i = 0; i < h.indexes.length; i++) {
                min = Math.min(min, h.indexes[i]);
                max = Math.max(max, h.indexes[i]);
            }
        }

        Map<String, Integer> words = new HashMap<>();
        Arrays.stream(holders).forEach(holder -> words.put(holder.word, -1));


    }

    private void printIndexes(Map<String, List<Integer>> indexes) {
        for (String s : search) {
            String arg = s.toLowerCase();
            List<Integer> integers = indexes.get(arg);
            System.out.println(arg + " -> " + integers);
        }
    }

    private Map<String, List<Integer>> getIndexes() {
        String[] split = input.toLowerCase().split(" ");
        Map<String, List<Integer>> indexes = new HashMap<>();

        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            if (!indexes.containsKey(s)) {
                indexes.put(s, new ArrayList<>());
            }
            List<Integer> integers = indexes.get(s);
            integers.add(i);
            integers.sort(Comparator.naturalOrder());
        }
        return indexes;
    }


    static class Holder {
        String word;
        int[] indexes;

        public Holder(String word, List<Integer> indexes) {
            this.word = word;
            int[] arr = new int[indexes.size()];
            for (int i = 0; i < indexes.size(); i++) {
                arr[i] = indexes.get(i);

            }
            this.indexes = arr;
        }

        int getFirstIndexHigherThan(int leftLimit) {
            for (int integer : indexes) {
                if (integer > leftLimit) {
                    return integer;
                }
            }
            return NOT_FOUND;
        }

        @Override
        public String toString() {
            return "word='" + word + '\'' +
                    ", indexes=" + Arrays.toString(indexes);
        }
    }
}
