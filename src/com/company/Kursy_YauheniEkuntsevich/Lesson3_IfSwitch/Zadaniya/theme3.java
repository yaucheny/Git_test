package com.company.Kursy_YauheniEkuntsevich.Lesson3_IfSwitch.Zadaniya;

import org.w3c.dom.ls.LSOutput;

public class theme3 {
    public static void main(String[] args) {
        {
            System.out.println("---задание 1 (опер)----------------------------");

            int q = 32;
            int w = 5;
            int e = q / w;
            int d = q % w;
            System.out.println("Результат равен " + e + " остаток равен " + d);
            System.out.println("---задание 2 (опер)-------------------------------------");
            int ab = 50;
            int a = (int) (ab / 10);
            int b = ab % 10;
            int f = a + b;
            System.out.println("результат суммы цифр " + f);
            System.out.println("---задание 3 (опер)-------------------------------------");
        }
        {
            double a = 1.74;
            float b = (int) (a + 0.5);
            System.out.println("округленное число " + b);
            System.out.println("---задание 4 (опер)-------------------------------------");
            {
                {
                    {
                        int cde = 954;
                        int c = (int) (cde / 100);
                        int d = (cde / 10) % 10;
                        int e = cde % 10;
                        int edc = c + d + e;
                        System.out.println("сумма знаков числа " + edc);
                        System.out.println("---задание 1 (условия)-------------------------------------");
                        int i = 3;
                        int z = i % 2;
                        if (z == 0) {
                            System.out.println("n-четное");
                        } else {
                            System.out.println("n-нечетное");

                            System.out.println("---задание 2 (условия)-------------------------------------");
                            double k = -11.74;
                            double l = 12.13;
                            double m, n;
                            m = Math.abs(k - 10);
                            n = Math.abs(l - 10);
                            if (m > n) {
                                System.out.println("l-ближе к 10");
                            } else {
                                System.out.println("k-ближе к 10");
                            }
                            System.out.println("---задание 3 (условия)-------------------------------------");
                            double s = 1;
                            double o = -5;
                            double p = 6;
                            double D = o * o - 4 * s * p;
                            double r, q;
                            if (D == 0) {
                                r = -1 * o / (2 * s);
                                System.out.println("единственный корень уравнения " + r);
                            } else {
                                if (D > 0) {
                                    r = (-1 * o + Math.sqrt(D)) / (2 * s);
                                    q = (-1 * o - Math.sqrt(D)) / (2 * s);
                                    System.out.println("1-sq корень уравнения " + r + " второй корень уравнения " + q);
                                } else {
                                    System.out.println("уравнение не имеет корней");
                                }
                            }
                        }


                    }
                }
            }
        }
    }
}
