package com.example;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fs =
                new FibonacciSequence(); // You should change only this line

        long tenthValue = fs.get(10);

        System.out.println(tenthValue);
    }
}
