package com.lesson_5;

public class method_8 {
    public static void main(String[] args) {
        daytime(7);
        daytime(13);
        daytime(18);
        daytime(2);
    }

    static void daytime(int hour) {
        if (hour > 24 || hour < 0)
            return;
        else if (hour > 21 || hour < 6)
            System.out.println("Good night");
        else if (hour >= 15)
            System.out.println("Good evening");
        else if (hour >= 11)
            System.out.println("Good after noon");
        else
            System.out.println("Good morning");
    }
}
