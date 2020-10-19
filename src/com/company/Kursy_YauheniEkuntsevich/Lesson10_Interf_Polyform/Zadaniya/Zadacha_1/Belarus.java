package com.company.Kursy_YauheniEkuntsevich.Lesson10_Interf_Polyform.Zadaniya.Zadacha_1;

public class Belarus implements Country {
    @Override
    public void population() {
        System.out.println("Belarus Population is 10mln");
    }

    @Override
    public void square() {
        System.out.println("Belarus Square is 40mln kmkv");
    }
}
