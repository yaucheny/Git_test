package com.company.Kursy_YauheniEkuntsevich.Lesson5_Methods.Zadaniya;

public class method_11 {
    public static void main(String[] args) {
        System.out.println(chetnoje(1));
    }
    static String chetnoje (int x){
        int z =x%2;
        if (z ==0)
            return "chetnoe";
        else
            return "niechetnoe";
    }
}
