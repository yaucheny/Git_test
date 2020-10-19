package com.company.Kursy_YauheniEkuntsevich.Lesson7_Collections.Zadaniya;

public class Array {
    public static void main(String[] args) {
        String[] array = new String[7];
        array[0] = "каждый";
        array[1] = "охотник";
        array[2] = "желает";
        array[3] = "знать";
        array[4] = "где";
        array[5] = "живет";
        array[6] = "фазан";
        int length = array.length;
        System.out.println(length);
        for (int k = 0; k < length / 2; k++) {
            String temp = array[length -1 -k];
            array[length - 1-k] = array[k];
            array[k] = temp;
        }
        for (String j : array) {
            System.out.println(j + " ");
        }

    }
}
