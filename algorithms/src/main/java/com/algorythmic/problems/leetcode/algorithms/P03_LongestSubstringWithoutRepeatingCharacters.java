package com.algorythmic.problems.leetcode.algorithms;

import java.util.HashSet;
import java.util.Set;

public class P03_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        while (i < n && j < n) {
            char c = s.charAt(j);
            if (set.contains(c)) {
                set.remove(s.charAt(i++));
            } else {
                set.add(s.charAt(j++));
                max = Math.max(set.size(), max);
            }
        }

        return max;
    }

}
