package com.company.Kursy_YauheniEkuntsevich.Lesson9_Nasled_Abstract.Zadaniya.Zadacha_3;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int square, int height, int width) {
        super(square);
        this.height = height;
        this.width = width;
    }

    @Override
    protected void printsuare() {
        System.out.println("Rectangle");
    }
}
