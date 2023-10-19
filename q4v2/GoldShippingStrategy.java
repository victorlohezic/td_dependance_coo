package q4v2;

public class GoldShippingStrategy implements ShippingStrategy {
    private double STD_PRICE_GOLD = 0.5;
    private double STD_PRICE = 3.0;
    @Override
    public double execute(CheckoutContext checkoutContext) {
        if (checkoutContext.customerIsGoldLevel())
            return STD_PRICE_GOLD;
        return STD_PRICE;
    }
}
