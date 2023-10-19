package q3v2;

public class WeightShippingStrategy implements ShippingStrategy {
    private double RSH_LIMIT_WEIGHT = 20.0;
    private double RSH_PRICE_BELOW_LIMIT = 4.8;
    private double RSH_PRICE_ABOVE_LIMIT = 7.5;

    @Override
    public double execute(double size, double subTotal, double weight, boolean customerIsGold) {
        return (weight <= RSH_LIMIT_WEIGHT) ?
                RSH_PRICE_BELOW_LIMIT : RSH_PRICE_ABOVE_LIMIT;
    }
}
