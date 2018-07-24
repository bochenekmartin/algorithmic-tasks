package com.algorithmic.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class P692_TopKFrequentWords {
    public List<String> topKFrequent2(String[] words, int k) {
        Map<String, Integer> count = new HashMap();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        //binary heap
        PriorityQueue<String> heap = new PriorityQueue<String>(
                (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                        w2.compareTo(w1) : count.get(w1) - count.get(w2));

        for (String word : count.keySet()) {
            heap.offer(word);
            if (heap.size() > k) heap.poll();
        }

        List<String> ans = new ArrayList();
        while (!heap.isEmpty()) ans.add(heap.poll());
        Collections.reverse(ans);
        return ans;
    }

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>((int) ((float) words.length / 0.75F + 1.0F));
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            Integer integer = map.get(word);
            if (integer == null) {
                map.put(word, 1);
            } else {
                map.put(word, integer + 1);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> {
            int i = map.get(o2).compareTo(map.get(o1));
            if (i == 0) {
                return o1.compareTo(o2);
            }
            return i;
        });

        return list.subList(0, k);
    }

}
