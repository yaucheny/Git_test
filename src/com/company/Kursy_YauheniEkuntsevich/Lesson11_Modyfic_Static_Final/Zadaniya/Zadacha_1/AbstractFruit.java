package lesson11.Zadacha_1;

public abstract class AbstractFruit {

    protected String fruitName;

    protected double weight;

    protected double priceKilo;

    private static double earned = 0;

    public static void totalearned(double totalearned) {
        earned = earned + totalearned;//earned общая сумма покупок (если убрать статик то выводится для каждой покупки отдельно)
    }
    public static void printinfo() {
        System.out.println("Общая сумма покупок "+earned);
    }

    abstract void amountPurchases();

    public AbstractFruit(String fruitName, double weight, double priceKilo) {
        this.fruitName = fruitName;
        this.weight = weight;
        this.priceKilo = priceKilo;
    }
}
