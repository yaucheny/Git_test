package com.company.Kursy_YauheniEkuntsevich.Lesson5_Methods.Zadaniya;

public class method_15 {
    public static void main(String[] args) {
        stepen(2, 3);

    }

    static void stepen(int x, int y) {
        int z = 1;
        for (int i = 0; i < y; i++) {

            z=z * x;

        }
        System.out.println("число " + x + " в степени " + y + " равно " + z);

    }
}
