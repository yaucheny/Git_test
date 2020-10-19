package com.company.Kursy_YauheniEkuntsevich.Lesson7_Collections.Zadaniya;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map_1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "First");
        map.put(2, "Second");
        map.put(3, "Third");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " value= " + entry.getValue());

        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Spring> pair = (Map.Entry<Integer, Spring>) it.next();
            if (pair.getKey() == 1) {
                System.out.println("Value with key one was removed " + pair.getValue());
                it.remove();
            }
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " value= " + entry.getValue());

        }
    }
}
