package lesson9.Zadacha_2;


class A_Dog extends A_Animal {

    void bite() {
        System.out.println("I can bite");
    }

    @Override
    protected void makeNoise() {
        System.out.println("Dog Gav");

    }
}