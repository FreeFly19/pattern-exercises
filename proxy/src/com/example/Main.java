package com.example;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fs = new CachedFibonacciSequence(new FibonacciSequenceImpl());

        int index = 40;

        long startTime = System.currentTimeMillis();
        long fibValue = fs.get(index);
        System.err.printf("fib[%d] took: %dms\n", index, System.currentTimeMillis() - startTime);

        System.out.println(fibValue);
    }
}
