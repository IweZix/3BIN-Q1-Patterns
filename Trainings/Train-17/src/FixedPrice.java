public class FixedPrice implements Price {
    private double price;

    public FixedPrice(double price) {
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}