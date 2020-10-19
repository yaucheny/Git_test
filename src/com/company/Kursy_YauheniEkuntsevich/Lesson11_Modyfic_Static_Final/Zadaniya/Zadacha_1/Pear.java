package lesson11.Zadacha_1;

public class Pear extends AbstractFruit {
    public Pear(String fruitName, double weight, double priceKilo) {
        super(fruitName, weight, priceKilo);
    }

    @Override
    void amountPurchases() {
        double price = weight * priceKilo;
        totalearned(price);
        System.out.println("стоимость груш ровна "+ price);
    }
}
