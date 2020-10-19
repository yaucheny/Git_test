package lesson9.Zadacha_2;

public class A_Programme {
    public static void main(String[] args) {
        A_Durk duck = new A_Durk();
        A_Dog dog = new A_Dog();
        duck.swim();
        duck.walk();
        dog.bite();
        dog.walk();
        dog.makeNoise();
        duck.makeNoise();
    }
}
