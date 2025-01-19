public class Order {
    private State state;

    public Order() {
        state = IsCreated.getInstance();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void addProduct(String product) {
        state.addProduct(this, product);
    }

    public void confirm() {
        state.confirm(this);
    }

    public void ship() {
        state.ship(this);
    }
}