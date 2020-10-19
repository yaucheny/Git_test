package lesson9.Zadacha_1;

public class Programme {
    public static void main(String[] args) {
        Durk duck = new Durk("duck","white" );
        Dog dog = new Dog("Bobik","black");
        duck.swim();
        duck.walk();
        dog.bite();
        dog.walk();
    }
}
