package com.company.Kursy_YauheniEkuntsevich.Lesson13_ENUM_Generics.Zadaniya.Zadacha_2;

public enum DaysOfWeek2 {
    MONDAY(32), TUESDAY(24), WEDNESDAY(16), THUSDAY(8), FRIDAY(0), SATURDAY(0), SUNDAY(0);
    private int number;

    DaysOfWeek2(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
