package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 50;
        long a = 1, b = 1;
        System.out.println(a + " " + b);
        long fib = 2, i = 2;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.println(" " + fib);
            i++;
        }

    }
}
