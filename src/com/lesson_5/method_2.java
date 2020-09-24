package com.lesson_5;

public class method_2 {
    public static void main(String[] args) {
        int a = 6;
        int b =8;
        sum(a,b);
        sum (3,a);
        sum(5, 23);
    }
    static void sum (int x, int y) {
        int z = x + y;
        System.out.println(z);
    }
}
