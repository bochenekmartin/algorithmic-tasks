package com.experiments.jmh;

import org.openjdk.jmh.annotations.Benchmark;

public class MyJmhBenchmark {

    @Benchmark
    public void testMethod() {
        // This is a demo/sample template for building your JMH benchmarks. Edit as needed.
        // Put your benchmark code here.

        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println("sum=" + sum);
    }

}