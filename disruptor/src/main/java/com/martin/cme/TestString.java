package com.martin.cme;

public class TestString {

    public static void main(String[] args) {
        FastStringBuffer fsb = new FastStringBuffer("ASD");
        String content = fsb.getContent();
        System.out.println(content);
    }
}
