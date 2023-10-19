package q4v2;

class CheckoutContext {
    private ShippingStrategy shippingStrategy;
    private Customer customer;
    private java.util.List<Product> shoppingCart;

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

    public double subTotalOrder() {
        double total = 0.0;
        for (Product p : shoppingCart)
            total += p.price(customer);
        return total;
    }

    public double getMaxSize() {
        double maxSize = 0.0;
        for (Product p : shoppingCart) {
            if (p.size() > maxSize)
                maxSize = p.size();
        }
        return  maxSize;
    }

    public double getWeigthTotal() {
        double totalWeight = 0;
        for (Product product : shoppingCart) {
            totalWeight += product.weight();
        }
        return  totalWeight;
    }


    public boolean customerIsGoldLevel() {
        return customer.isGoldlevelCustomer();
    }
    public double shippingCharge() {

        return this.shippingStrategy.execute(getMaxSize());
    }
}





/* Dans le code de la methode shippingCharge()
  ajouter le calcul STANDARD avec reduction pour le client gold

  private double STD_PRICE_GOLD = 0.5;
  private double STD_PRICE = 3.0;

  double standard(boolean customerIsGold) {
      if (customerIsGold)
	return STD_PRICE_GOLD;
      return STD_PRICE;
  }
*/
