package com.company.Kursy_YauheniEkuntsevich.Lesson9_Nasled_Abstract.Zadaniya.Zadacha_4;

public class Rectangle extends AbstractShape {
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

    @Override
    protected int perimetr() {
        return height+width;
    }
}
