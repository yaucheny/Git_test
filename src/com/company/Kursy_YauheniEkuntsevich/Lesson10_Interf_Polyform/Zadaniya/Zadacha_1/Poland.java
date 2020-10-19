package com.company.Kursy_YauheniEkuntsevich.Lesson10_Interf_Polyform.Zadaniya.Zadacha_1;

public class Poland implements Country{
    @Override
    public void population() {
        System.out.println("Poland Population is 40mln");
    }

    @Override
    public void square() {
        System.out.println("Poland Square is 40mln kmkv");
    }
}
