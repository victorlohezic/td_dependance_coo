package q3v2;

public class GoldShippingStrategy implements ShippingStrategy {
    private double STD_PRICE_GOLD = 0.5;
    private double STD_PRICE = 3.0;
    @Override
    public double execute(double size, double subTotal, double weight, boolean customerIsGold) {
        if (customerIsGold)
            return STD_PRICE_GOLD;
        return STD_PRICE;
    }
}
