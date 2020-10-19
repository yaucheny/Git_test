package lesson11.Zadacha_1;

public class Apple extends AbstractFruit {
    public Apple(String fruitName, double weight, double priceKilo) {
        super(fruitName, weight, priceKilo);
    }

    @Override
    void amountPurchases() {
        double price = weight * priceKilo;
        totalearned(price);
        System.out.println("стоимость яблок ровна "+ price);


    }

}
