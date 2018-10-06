package com.algorithmic.problems;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Problem079Test {
    Problem079 underTest = new Problem079();

    @Test
    public void alwaysAfter() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(378);
        numbers.add(123);
        numbers.add(234);

        int number = 3;
        int result = underTest.alwaysAfter(number, numbers);

        Assert.assertEquals(3, result);
    }

    @Test
    public void presentDigits() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(378);
        numbers.add(123);
        numbers.add(234);

        Assert.assertEquals(6, underTest.presentDigits(numbers).size());
    }
}
