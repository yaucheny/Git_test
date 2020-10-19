package com.company.Kursy_YauheniEkuntsevich.Lesson13_ENUM_Generics.Zadaniya.Zadacha_1;

public class NumerOfHoursLeft {
    public static void main(String[] args) {
        DaysOFWeek daycurrent = DaysOFWeek.FRIDAY;
        System.out.println(daycurrent);
        switch (daycurrent) {
            case MONDAY:
                System.out.println("Осталось работать 32 часа");
                break;
            case TUESDAY:
                System.out.println("Осталось работать 24 часа");
                break;
            case WEDNESDAY:
                System.out.println("Осталось работать 16 часов");
                break;
            case THUSDAY:
                System.out.println("Осталось работать 8 часов");
                break;
            case FRIDAY:
                System.out.println("Урра выходные!!");
                break;
            case SATURDAY:
                System.out.println("Все еще гуляем");
                break;
            case SUNDAY:
                System.out.println("Завтра на работу((");
                break;

        }

    }
}
