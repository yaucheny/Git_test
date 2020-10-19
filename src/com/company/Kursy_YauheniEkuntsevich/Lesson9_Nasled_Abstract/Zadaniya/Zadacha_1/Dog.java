package lesson9.Zadacha_1;


class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color);
    }


    void bite() {
        System.out.println("I can bite");
    }
}