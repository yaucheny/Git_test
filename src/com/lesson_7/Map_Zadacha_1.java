package com.lesson_7;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Zadacha_1 {
    public static void main(String[] args) {
        Map<Long, String>map= new HashMap<>();
        map.put(1111111L, "7 ones");
        map.put(2222222L, "7 twos");
        map.put(3333333L, "7 threes");
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Long, Spring> pair = (Map.Entry<Long, Spring>) it.next();
            if (pair.getKey() == 1111111) {
                System.out.println("Value with key"+ pair.getKey()+" равно " + pair.getValue());
                break;
            }


        }
    }
}
