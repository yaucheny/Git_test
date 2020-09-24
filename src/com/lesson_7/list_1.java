package com.lesson_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list_1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Вася");
        strings.add("Петя");
        strings.add("Катя");
        strings.add("Игорь");
        strings.add("Настя");
        for (String i : strings
        ) {
            System.out.println(i);

        }
        String s = strings.get(2);
        System.out.println(s);
        strings.remove(0);
        System.out.println(strings);
        int size = strings.size();
        System.out.println(size);

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            if ("Катя".equals(iterator.next())){
                iterator.remove();
                break;
            }
        } System.out.println(strings);


    }
}
