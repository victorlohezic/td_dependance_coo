package q3v2;

import java.util.List;

interface Product {
    String name();
    double weight();
    double size();
    java.util.Date addedDate();
    double cost();
    double basePrice();
    double salesPrice();
    boolean isOnSale();
    int quantityAvailable();
    double price(Customer c);
}