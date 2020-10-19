package com.company.Kursy_YauheniEkuntsevich.Lesson8_Class.Zadaniya;

public class class_object_1 {
    public static void main(String[] args) {
        Person_1 undef = new Person_1();//вызов первого конструктора без параметров
        undef.displayInfo();
        Person_1 tom = new Person_1("Tom");//вызов второго конструктора с одним параметром
        tom.displayInfo();
        Person_1 sam = new Person_1("Sam", 25);//вызов третьего конструктора с двумя параметрами
        sam.displayInfo();

    }
}

class Person_1 {
    String name;
    int age;

    Person_1() {

        this("underfined", 18);
    }

    Person_1(String name) {
        this(name, 18);

    }

    Person_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s \t Age: %d \n", name, age);
    }

}
