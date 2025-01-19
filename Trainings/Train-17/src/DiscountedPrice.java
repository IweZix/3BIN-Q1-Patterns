public class DiscountedPrice implements Price {
    private Price originalPrice;
    private double discount;

    public DiscountedPrice(Price originalPrice, double discount) {
        this.originalPrice = originalPrice;
        this.discount = discount;
    }

    @Override
    public double calculatePrice() {
        return originalPrice.calculatePrice() * (1 - discount);
    }
}