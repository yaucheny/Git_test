package com.lesson_5;

public class method_4 {
    public static void main(String[] args) {
        sum (1, 2, 3);
        sum (1, 2, 4, 5);
        sum ();

    }
    static void sum (int...nums){
        int result = 0;
        for (int n: nums){
            result += n;
            System.out.println(result);

        }
    }
}
