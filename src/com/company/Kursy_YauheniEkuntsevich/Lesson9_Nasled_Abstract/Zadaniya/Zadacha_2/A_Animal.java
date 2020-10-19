package lesson9.Zadacha_2;

public abstract class A_Animal {
    protected String name;


    void walk() {
        System.out.println("I can walk");
    }
    protected abstract void makeNoise();

}
