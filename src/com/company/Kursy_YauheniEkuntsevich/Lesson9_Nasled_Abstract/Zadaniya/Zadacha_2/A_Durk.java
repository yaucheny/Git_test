package lesson9.Zadacha_2;

class A_Durk extends A_Animal {
    void swim() {
        System.out.println("I can swimm");
    }

    @Override
    protected void makeNoise() {
        System.out.println("Duck Kria");

    }
}