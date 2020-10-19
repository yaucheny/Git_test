package com.company.Kursy_YauheniEkuntsevich.Lesson7_Collections.Zadaniya;

import java.util.HashSet;
import java.util.Set;

public class set_1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        for (Integer i : set) {
            System.out.println(i);
        }
        set.add(1);
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
