package com.codersbay;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("Hello Fibonacci");
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Fibonacci(n));
    }

    public static Integer Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

}
