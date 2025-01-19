public abstract class State {
    public abstract void addProduct(Order order, String product);

    public abstract void confirm(Order order);

    public abstract void ship(Order order);
}
