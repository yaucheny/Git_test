package com.company;

public class thema5 {
    public static void main(String[] args) {
        System.out.println(" Задача 1");
        for (int i1 = 1000; i1 < 10000; i1 = i1 + 3) {
            System.out.println(" " + i1);
        }
        System.out.println("-------------------------");


        {
            System.out.println(" Задача 2");

            {
                for (int i2 = 1, b1 = 1; i2 <= 55; i2++, b1 = b1 + 2) {
                    System.out.println(" " + b1);
                }
            }
        }
        {
            System.out.println("-------------------------");
            System.out.println(" Задача 3");

            {
                for (int i3 = 95; i3 >= 0; i3 = i3 - 5) {
                    System.out.println(" " + i3);
                }
            }
        }
        {
            System.out.println("-------------------------");
            System.out.println(" Задача 4");

            {
                for (int i4 = 1, b2 = 2; i4 <= 20; i4++, b2 = b2 * 2) {
                    System.out.println(" " + b2);
                }
            }
        }
        {
            System.out.println("-------------------------");
            System.out.println(" Задача 5");

            {
                for (int i5 = 2; i5 < 10000; i5 = i5 * 2 - 1) {
                    System.out.println(" " + i5);
                }
            }
        }
        {
            System.out.println("-------------------------");
            System.out.println(" Задача 6");

            {
                for (int i6 = -166; i6 < 100; i6 = i6 * 2 + 200) {
                    {if (i6 > -100)
                        System.out.println(" " + i6);
                    }
                }
            }
        }
    }
}
