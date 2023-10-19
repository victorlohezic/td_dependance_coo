package q4v2;

public class WeightShippingStrategy implements ShippingStrategy {
    private double RSH_LIMIT_WEIGHT = 20.0;
    private double RSH_PRICE_BELOW_LIMIT = 4.8;
    private double RSH_PRICE_ABOVE_LIMIT = 7.5;

    @Override
    public double execute(CheckoutContext checkoutContext) {
        return (checkoutContext.getWeigthTotal() <= RSH_LIMIT_WEIGHT) ?
                RSH_PRICE_BELOW_LIMIT : RSH_PRICE_ABOVE_LIMIT;
    }
}
