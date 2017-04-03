/**
 * Types of cheeses paired with prices, and a method to access price of each type.
 */
public enum CheeseType {
    MOZZARELLA (0.50),
    PARMESEAN (1.00),
    CHEDDAR (2.00),
    BLEU (2.50);

    private final double price;

    CheeseType(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
}
