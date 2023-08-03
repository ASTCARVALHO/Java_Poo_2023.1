package ufpb.AntonioSergio.fibonacci;

import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 20 ; i++) {
            System.out.println( FibonacciCalculator.fib1(i));
            System.out.println( FibonacciCalculator.fib2(i));
            System.out.println( FibonacciCalculator.fib3(i));
        }

    }

    public static int fib1 (int n){
       if(n<2){
           return n;
       } else {
           return fib1(n-1)+ fib1(n-2);
       }

    }
    public static int fib2 (int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
    public static int fib3 ( int n){
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int fib = 0;
        int i = 2;

        while (i <= n) {
            fib = a + b;
            a = b;
            b = fib;
            i++;
        }

        return fib;

    }
}