package com.company.Kursy_YauheniEkuntsevich.Lesson13_ENUM_Generics.Zadaniya.Zadacha_3;

public enum DaysOfWeek3 {
    MONDAY(8,1), TUESDAY(5,2), WEDNESDAY(6,3), THUSDAY(7,4), FRIDAY(3,5), SATURDAY(1,6), SUNDAY(0,7);
    int numberOfHours;
    int numberOfDay;

    DaysOfWeek3(int numberOfHours, int numberOfDay) {
        this.numberOfHours = numberOfHours;
        this.numberOfDay = numberOfDay;

    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public void setNumberOfDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }
}
