package q3v1;

class CheckoutContext {
  private Customer customer;
  private java.util.List<Product> shoppingCart;
  private ShippingStrategy shippingStrategy;

  public CheckoutContext(Customer customer, ShippingStrategy shippingStrategy) {
    this.customer = customer;
    this.shippingStrategy = shippingStrategy;
    shoppingCart = new java.util.ArrayList<Product>();
  }

  public void setShippingStrategy(ShippingStrategy shippingStrategy) {
    this.shippingStrategy = shippingStrategy;
  }
  
  public void addProduct(Product p) {
    shoppingCart.add(p);
  }

  public void removeProduct(Product p) {
    shoppingCart.remove(p);
  }

  public int nbItem() {
    return shoppingCart.size();
  }


  
  public double shippingCharge() {
    return shippingStrategy.execute(shoppingCart, customer);
  }
}
