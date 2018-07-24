package com.experiments.algos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class BinaryHeap {

    public static final int INITIAL_CAPACITY = 100;

    public List<Integer> getTop100Numbers(List<Integer> list) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(INITIAL_CAPACITY + 1, Comparator.naturalOrder());

        for (Integer theInt : list) {
            heap.offer(theInt);
            if (heap.size() > INITIAL_CAPACITY) {
                heap.poll();
            }
        }

        Integer[] array = heap.toArray(new Integer[0]);
        Arrays.sort(array);
        return Arrays.asList(array);
    }
}
