package q3v1;

import java.util.List;

public class GoldShippingStrategy implements ShippingStrategy {
    private double STD_PRICE_GOLD = 0.5;
    private double STD_PRICE = 3.0;
    @Override
    public double execute(List<Product> products, Customer customer) {
        if (customer.isGoldlevelCustomer()) return STD_PRICE_GOLD;
        return STD_PRICE;
    }
}
