package com.example;

public class FibonacciSequence {
    long get(int index) {
        if (index == 0 || index == 1) return index;
        return get(index - 1) + get(index - 2);
    }
}
