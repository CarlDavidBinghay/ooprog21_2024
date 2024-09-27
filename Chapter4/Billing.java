class Billing {
    private static final double TAX = 0.08;

    static void computeBill(double price, int quantity, double couponDiscount) {
        double priceBeforeTax = (price * quantity) - couponDiscount;
        double finalPrice = priceBeforeTax + (priceBeforeTax * TAX);
        System.out.println("The total price for the bill is: $" + finalPrice);
    }

    static void computeBill(double price) {
        computeBill(price, 1, 0);
    }

    static void computeBill(double price, int quantity) {
        computeBill(price, quantity, 0);
    }

    public static void main(String[] args) {
        computeBill(23.2);
        computeBill(24.4, 2);
        computeBill(40.45, 2, 10);
    }
}
