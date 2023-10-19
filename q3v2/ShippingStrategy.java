package q3v2;

public interface ShippingStrategy {

    public double execute(double size, double subTotal, double weight, boolean customerIsGold);
}
