package com.example;

import java.util.HashMap;

public class CachedFibonacciSequence implements FibonacciSequence {
    private FibonacciSequence fibonacciSequence;
    private HashMap<Integer, Long> cachedFibonacci = new HashMap<>();

    public CachedFibonacciSequence(FibonacciSequence fibonacciSequence) {
        this.fibonacciSequence = fibonacciSequence;
    }

    @Override
    public long get(int index) {
        Long fibonacciResult = cachedFibonacci.get(index);

        if (cachedFibonacci.get(index) == null) {
            fibonacciResult = fibonacciSequence.get(index);
            cachedFibonacci.put(index, fibonacciResult);
        }

        return fibonacciResult;
    }
}
