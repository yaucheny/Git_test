package com.company.Kursy_YauheniEkuntsevich.Lesson13_ENUM_Generics.Zadaniya.Zadacha_3;

public class NumberOfHours {
    public static void main(String[] args) {
        DaysOfWeek3 hours = DaysOfWeek3.THUSDAY;

        DaysOfWeek3 hours1 = DaysOfWeek3.MONDAY;
        DaysOfWeek3 hours2 = DaysOfWeek3.THUSDAY;
        DaysOfWeek3 hours3 = DaysOfWeek3.WEDNESDAY;
        DaysOfWeek3 hours4 = DaysOfWeek3.THUSDAY;
        DaysOfWeek3 hours5 = DaysOfWeek3.FRIDAY;
        DaysOfWeek3 hours6 = DaysOfWeek3.SATURDAY;
        DaysOfWeek3 hours7 = DaysOfWeek3.SUNDAY;

        switch (hours) {


            case MONDAY:

                int result1 = hours1.getNumberOfDay() * hours1.getNumberOfHours();
                int result2 = hours2.getNumberOfDay() * hours2.getNumberOfHours();
                int result3 = hours3.getNumberOfDay() * hours3.getNumberOfHours();
                int result4 = hours4.getNumberOfDay() * hours4.getNumberOfHours();
                int result5 = hours5.getNumberOfDay() * hours5.getNumberOfHours();
                int result6 = hours6.getNumberOfDay() * hours6.getNumberOfHours();
                int result7 = hours7.getNumberOfDay() * hours7.getNumberOfHours();
                int result = result1 + result2 + result3 + result4 + result5 + result6 + result7;
                System.out.println("Осталось работать " + result);
                break;

            case TUESDAY:

                result2 = hours2.getNumberOfDay() * hours2.getNumberOfHours();
                result3 = hours3.getNumberOfDay() * hours3.getNumberOfHours();
                result4 = hours4.getNumberOfDay() * hours4.getNumberOfHours();
                result5 = hours5.getNumberOfDay() * hours5.getNumberOfHours();
                result6 = hours6.getNumberOfDay() * hours6.getNumberOfHours();
                result7 = hours7.getNumberOfDay() * hours7.getNumberOfHours();
                result = result2 + result3 + result4 + result5 + result6 + result7;
                System.out.println("Осталось работать " + result);
                break;
            case WEDNESDAY:

                result3 = hours3.getNumberOfDay() * hours3.getNumberOfHours();
                result4 = hours4.getNumberOfDay() * hours4.getNumberOfHours();
                result5 = hours5.getNumberOfDay() * hours5.getNumberOfHours();
                result6 = hours6.getNumberOfDay() * hours6.getNumberOfHours();
                result7 = hours7.getNumberOfDay() * hours7.getNumberOfHours();
                result = result3 + result4 + result5 + result6 + result7;
                System.out.println("Осталось работать " + result);
                break;
            case THUSDAY:

                result4 = hours4.getNumberOfDay() * hours4.getNumberOfHours();
                result5 = hours5.getNumberOfDay() * hours5.getNumberOfHours();
                result6 = hours6.getNumberOfDay() * hours6.getNumberOfHours();
                result7 = hours7.getNumberOfDay() * hours7.getNumberOfHours();
                result = result4 + result5 + result6 + result7;
                System.out.println("Осталось работать " + result);
                break;
            case FRIDAY:

                result5 = hours5.getNumberOfDay() * hours5.getNumberOfHours();
                result6 = hours6.getNumberOfDay() * hours6.getNumberOfHours();
                result7 = hours7.getNumberOfDay() * hours7.getNumberOfHours();
                result = result5 + result6 + result7;
                System.out.println("Осталось работать " + result);
                break;
            case SATURDAY:

                result6 = hours6.getNumberOfDay() * hours6.getNumberOfHours();
                result7 = hours7.getNumberOfDay() * hours7.getNumberOfHours();
                result = result6 + result7;
                System.out.println("Осталось работать " + result);
                break;
            case SUNDAY:
                result7 = hours7.getNumberOfDay() * hours7.getNumberOfHours();
                result = result7;
                System.out.println("Осталось работать " + result);
                break;


        }

    }
}
