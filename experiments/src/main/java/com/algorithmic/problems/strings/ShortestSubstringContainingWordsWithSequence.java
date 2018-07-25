package com.algorithmic.problems.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// dostaje stringa (jakis tekst) i drugi parametr to tablica wyrazow - trzeba
// zwrocic najkrotszy substring zawierajacy te wyrazy z tablicy

public class ShortestSubstringContainingWordsWithSequence {

    private final String input = "Amazon com Inc doing business as Amazon is an American electronic commerce and cloud computing company based in " +
            "Amazon com Inc doing business as Amazon is an American electronic cloud computing company based in " +
            "Seattle Washington that was founded by Jeff Bezos on July 5 1994 The tech giant is the largest Internet retailer in the world as measured " +
            "by revenue and market capitalization and second largest after Alibaba Group in terms of total sales The amazon com website started as " +
            "an online bookstore and later diversified to sell video downloads streaming MP3 downloads streaming audiobook downloads streaming " +
            "software video games electronics apparel furniture food toys and jewelry The company also produces consumer electronics Kindle " +
            "e-readers Fire tablets Fire TV and Echo and is the world's largest provider of cloud infrastructure services IaaS and PaaS " +
            "Amazon also sells certain low-end products under its in-house brand AmazonBasics".toLowerCase();

    private final String[] search = {"amazon", "electronic", "company"};

    public static void main(String[] args) {
        ShortestSubstringContainingWordsWithSequence solution = new ShortestSubstringContainingWordsWithSequence();
        solution.doIt2();
    }

    //todo dokonczyc

    private void doIt2() {
        Map<String, Integer> order = new HashMap<>();
        for (int i = 0; i < search.length; i++) {
            String s = search[i];
            order.put(s, i);
        }

        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(search).forEach(s -> map.put(s, -1));

        String[] words = input.toLowerCase().split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (map.containsKey(word)) {
                //start logic for desired word

                int index = map.get(word);
                if (index == -1|| map.containsValue(-1) || diffIsLower(map, word, i)) {
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

}
