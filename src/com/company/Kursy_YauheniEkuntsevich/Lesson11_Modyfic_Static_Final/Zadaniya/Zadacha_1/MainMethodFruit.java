package lesson11.Zadacha_1;

public class MainMethodFruit {
    public static void main(String[] args) {

        Apple apple = new Apple("apple", 1.5, 2.7);

        apple.amountPurchases();
        
        Pear pear = new Pear("pear", 2.0, 3.7);

        pear.amountPurchases();

        Apricot apricot = new Apricot("apricot", 3.5, 2.6);

        apricot.amountPurchases();

        AbstractFruit.printinfo();





    }
}
