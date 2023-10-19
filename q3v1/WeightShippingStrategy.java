package q3v1;

import java.util.List;

public class WeightShippingStrategy implements ShippingStrategy {
    private double RSH_LIMIT_WEIGHT = 20.0;
    private double RSH_PRICE_BELOW_LIMIT = 4.8;
    private double RSH_PRICE_ABOVE_LIMIT = 7.5;

    public double computeWeight(List<Product> products) {
        double totalWeight = 0;
        for (Product product : products) {
            totalWeight += product.weight();
        }
        return  totalWeight;
    }
    @Override
    public double execute(List<Product> products, Customer customer) {
        return (computeWeight(products) <= RSH_LIMIT_WEIGHT) ?
                RSH_PRICE_BELOW_LIMIT : RSH_PRICE_ABOVE_LIMIT;
    }
}
