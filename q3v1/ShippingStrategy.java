package q3v1;

import java.util.List;

public interface ShippingStrategy {
    public double execute(List<Product> products, Customer customer);
}
