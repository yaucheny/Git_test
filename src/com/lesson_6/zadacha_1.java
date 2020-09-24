package com.lesson_6;

public class zadacha_1 {
    public static void main(String[] args) {
        int factorial = factorial(3);
        System.out.println(factorial);
    }

    static int factorial(int x) {
        if (x == 1)
        {
            return 1;
        }
        return x * factorial(x - 1);
    }
}

