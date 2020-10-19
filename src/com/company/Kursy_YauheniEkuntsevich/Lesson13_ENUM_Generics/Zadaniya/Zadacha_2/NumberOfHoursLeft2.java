package com.company.Kursy_YauheniEkuntsevich.Lesson13_ENUM_Generics.Zadaniya.Zadacha_2;

public class NumberOfHoursLeft2 {
    public static void main(String[] args) {
        DaysOfWeek2 day = DaysOfWeek2.MONDAY;

        switch (day) {
            case MONDAY:
                System.out.println(DaysOfWeek2.MONDAY.getNumber());
                break;
            case TUESDAY:
                System.out.println(DaysOfWeek2.TUESDAY.getNumber());
                break;
            case WEDNESDAY:
                System.out.println(DaysOfWeek2.WEDNESDAY.getNumber());
                break;
            case THUSDAY:
                System.out.println(DaysOfWeek2.THUSDAY.getNumber());
                break;
            case FRIDAY:
                System.out.println(DaysOfWeek2.FRIDAY.getNumber());
                break;
            case SATURDAY:
                System.out.println(DaysOfWeek2.SATURDAY.getNumber());
                break;
            case SUNDAY:
                System.out.println(DaysOfWeek2.SUNDAY.getNumber());
                break;

        }

    }
}
