package q4v2;

public class RelayShippingStrategy implements ShippingStrategy {
    private double RLY_MAX_SIZE = 10.0;
    private double RLY_PRICE_BELOW_SIZE = 2.50;
    private double RLY_PRICE_ABOVE_SIZE = 4.50;
    private double RLY_SUBTOTAL_PRICE = 50.0;
    private double RLY_SHIPPING_GOLD = 0.0;

    @Override
    public double execute(CheckoutContext checkoutContext) {
        double shipping = (checkoutContext.getMaxSize() < RLY_MAX_SIZE) ?
                RLY_PRICE_BELOW_SIZE : RLY_PRICE_ABOVE_SIZE;

        if (checkoutContext.subTotalOrder() > RLY_SUBTOTAL_PRICE)
            shipping = (checkoutContext.customerIsGoldLevel()) ?
                    RLY_SHIPPING_GOLD: shipping / 2;

        return shipping;
    }
}
