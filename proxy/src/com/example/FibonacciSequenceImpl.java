package com.example;

public class FibonacciSequenceImpl implements FibonacciSequence {

    @Override
    public long get(int index) {
        if (index == 0 || index == 1) return index;
        return get(index - 1) + get(index - 2);
    }
}
