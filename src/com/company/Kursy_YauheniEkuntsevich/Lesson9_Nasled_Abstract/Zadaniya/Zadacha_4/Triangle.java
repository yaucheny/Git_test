package com.company.Kursy_YauheniEkuntsevich.Lesson9_Nasled_Abstract.Zadaniya.Zadacha_4;

public class Triangle extends AbstractShape {

    private int i1;
    private int i2;
    private int i3;

    public Triangle(int square, int i1, int i2, int i3) {
        super(square);
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
    }


    @Override
    protected int perimetr() {
        return i1+i2+i3;
    }
}

