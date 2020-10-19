package com.company.Kursy_YauheniEkuntsevich.Lesson9_Nasled_Abstract.Zadaniya.Zadacha_4;

public class MainInheritance {
    public static void main(String[] args) {
        AbstractShape rectangle = new Rectangle(1,1,1);
        AbstractShape triangle = new Triangle(1,1,1,1);
        rectangle.printsuare();
        triangle.printsuare();


        System.out.println(rectangle.perimetr());
        System.out.println(triangle.perimetr());

    }
}
