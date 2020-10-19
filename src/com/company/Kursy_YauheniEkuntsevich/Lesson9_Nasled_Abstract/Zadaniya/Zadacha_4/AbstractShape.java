package com.company.Kursy_YauheniEkuntsevich.Lesson9_Nasled_Abstract.Zadaniya.Zadacha_4;

public abstract class AbstractShape {
    protected int square;

    public AbstractShape(int square) {
        this.square = square;
    }
    protected void printsuare(){
        System.out.println("Shape");
    };
    protected abstract int perimetr();
}
