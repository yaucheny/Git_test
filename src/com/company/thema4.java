package com.company;

import java.sql.SQLOutput;

public class thema4 {
    public static void main(String[] args) {

        {
            System.out.println("Задача 4");
            double a = (Math.random()) * 156 + 5;
            int b = (int) a;
            System.out.println("рандомное число из отрезка [5;155] равно " + b);
            if (25 < b & b < 100) {
                System.out.println("Результат равен " + b);
                System.out.println("это число принадлежит отрезку (25;100) ");
            } else {
                System.out.println("это число не принадлежит отрезку (25;100) ");
            }
            System.out.println("____________________________________________");
        }
        System.out.println("Задача 5");
        int a1 = (int) ((Math.random() * 10));
        int a2 = (int) ((Math.random() * 10));
        int a3 = (int) ((Math.random() * 10));
        int a4 = 100 * a1 + 10 * a2 + a3;
        System.out.println("рандомное трехзначное число " + a4);
        if (a1 >= a2 & a1 >= a3) {
            System.out.println("наибольшее число из трех " + a1);
        } else {
            if (a2 >= a3) {
                System.out.println("наибольшее число из трех " + a2);
            } else {
                System.out.println("наибольшее число из трех " + a3);
            }
            System.out.println("____________________________________________");
        }
        System.out.println("Задача 6");
        int b1 = 1;
        int b2 = 5;
        int b3 = 3;
        if (b1 > b2 & b1 > b3) {
            if (b2 > b3) {
                System.out.println("число по возрастанию " + b3 + b2 + b1);
            } else {
                System.out.println("число по возрастанию " + b1 + b2 + b3);
            }
        } else {
            if (b2 > b1 & b2 > b3) {
                if (b3 > b1) {
                    System.out.println("число по возрастанию " + b1 + b3 + b2);
                } else {
                    System.out.println("число по возрастанию " + b3 + b1 + b2);
                }
                ;
            } else {
                if (b3 > b2 & b3 > b1) {
                    if (b2 > b1) {
                        System.out.println("число по возрастанию " + b1 + b2 + b3);
                    } else {
                        System.out.println("число по возрастанию " + b2 + b1 + b3);
                    }
                }
                System.out.println("____________________________________________");
            }
        } System.out.println("Задача 7");
        int c1 = (int) ((Math.random() * 28801));
        System.out.println("число по возрастанию " + c1);
        int c2 = c1 / 3600;
        int c3 = (c1 % 3600) / 60;
        System.out.println("остается " + c2+ " часов " + c3 + " минут");

    }
}
