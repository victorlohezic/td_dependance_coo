package q4v2;

interface Customer {
    boolean isRegister();
    boolean isGoldlevelCustomer();
    double fixedDiscount();
    double spendingSince(java.util.Date d);
    boolean hasFixedDiscountAgreement();
    String name();
    boolean isBigSpender();
}