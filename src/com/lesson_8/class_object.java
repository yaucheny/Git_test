package com.lesson_8;

public class class_object {
    public static void main(String[] args) {
        Person bob = new Person();//вызов первого конструктора без параметров
        bob.displayInfo();
        Person tom = new Person("Tom");//вызов второго конструктора с одним параметром
        tom.displayInfo();
        Person sam = new Person("Sam", 25);//вызов третьего конструктора с двумя параметрами
        sam.displayInfo();

    }
}

class Person {
    String name;
    int age;

    Person() {
        name = "underfined";
        age = 18;
    }

    Person(String n) {
        name = n;
        age = 18;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void displayInfo() {
        System.out.printf("Name: %s \t Age: %d \n", name, age);
    }
}