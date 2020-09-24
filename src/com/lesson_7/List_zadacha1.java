package com.lesson_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_zadacha1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Cat");
        strings.add("Dog");
        strings.add("Lion");
        strings.add("Monkey");
        strings.add("Elephant");
        strings.add("Bear");
        for (String i : strings) {
            System.out.println(i);
        }
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            if ("Dog".equals(iterator.next())) {
                iterator.remove();
                break;
            }
        }
        for (String j : strings) {
            System.out.println(j);
        }
        System.out.println("--------------");
        int size = strings.size();
        for (int i1 = 0; i1 < size / 2; i1++) {
            String temp = strings.get(size - 1 - i1);
            String temp1 = strings.get(i1);
            strings.set(size - 1 - i1, temp1);
            strings.set(i1, temp);
        }
        for (String i2 : strings) {
            System.out.println(i2);
        }
        System.out.println("--------------");
        List<String> strings1 = new ArrayList<>(size);
        int size1 = strings.size();
        for (int i3 = size1 - 1; i3 >= 0; i3--) {
            String temp2 = strings.get(i3);
            strings1.add(temp2);
        }
        for (String i4 : strings1) {
            System.out.println(i4);
        }
        System.out.println("Итог--------------");
        strings.clear();
        strings.addAll(strings1);
        for (String i5 : strings) {
            System.out.println(i5);
        }
    }
}