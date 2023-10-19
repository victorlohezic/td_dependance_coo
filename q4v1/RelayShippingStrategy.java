package q4v1;

import java.util.List;

public class RelayShippingStrategy implements ShippingStrategy{
    private double RLY_MAX_SIZE = 10.0;
    private double RLY_PRICE_BELOW_SIZE = 2.50;
    private double RLY_PRICE_ABOVE_SIZE = 4.50;
    private double RLY_SUBTOTAL_PRICE = 50.0;
    private double RLY_SHIPPING_GOLD = 0.0;

    private double computeMaxSize(List<Product> shoppingCart) {
        double maxSize = 0.0;
        for (Product p : shoppingCart) {
            if (p.size() > maxSize)
                maxSize = p.size();
        }
        return maxSize;
    }


    public double subTotalOrder(List<Product> shoppingCart, Customer customer) {
        double total = 0.0;
        for (Product p : shoppingCart)
            total += p.price(customer);
        return total;
    }
    @Override
    public double execute(CheckoutContext checkoutContext) {
        List<Product> products = checkoutContext.getShoppingCart();
        Customer customer = checkoutContext.getCustomer();
        double maxSize = computeMaxSize(products);
        double shipping = (maxSize < RLY_MAX_SIZE) ?
                RLY_PRICE_BELOW_SIZE : RLY_PRICE_ABOVE_SIZE;

        double subTotal = subTotalOrder(products, customer);

        if (subTotal > RLY_SUBTOTAL_PRICE)
            shipping = (customer.isGoldlevelCustomer()) ?
                    RLY_SHIPPING_GOLD: shipping / 2;

        return shipping;
    }
}
