package com.company.Kursy_YauheniEkuntsevich.Lesson8_Class.Zadaniya;

public class Person {
    private String fullname;
    private int age;


    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;

        ;


    }

    public Person() {

    }

    void move() {
        System.out.println("Такой-то "+ fullname+ age+" бежит");
    }

    void talk() {
        System.out.println("Такой-то "+ fullname+" говорит");
    }

    public static void main(String[] args) {
        Person Tom = new Person("Tom", 18);
        Tom.move();
        Tom.talk();
        Person Mike = new Person();
        Mike.move();
        Mike.talk();


    }
}
