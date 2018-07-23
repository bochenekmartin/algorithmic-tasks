package com.algorithmic.problems;


import java.util.LinkedList;

public class P151_ReverseWordsinaString {

    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        LinkedList<String> list = new LinkedList<>();
        if (s.charAt(s.length() - 1) != ' ') {
            s = s.concat(" ");
        }

        int previous = 0;
        int indexOf;
        while ((indexOf = s.indexOf(' ', previous)) != -1) {
            String substring = s.substring(previous, indexOf);
            previous = indexOf + 1;
            if (!substring.isEmpty()) {
                list.addFirst(substring);
            }
        }

        StringBuilder sb = new StringBuilder(1024);
        for (String substr : list) {
            sb.append(substr).append(' ');
        }
        if (sb.length() > 0) {
            return sb.delete(sb.length() - 1, sb.length()).toString();
        } else {
            return "";
        }
    }
}
