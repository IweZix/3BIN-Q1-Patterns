public class IsCreated extends State {
    public static IsCreated instance = null;

    private IsCreated() {}

    public static IsCreated getInstance() {
        if (instance == null) {
            instance = new IsCreated();
        }
        return instance;
    }

    @Override
    public void addProduct(Order order, String product) {
        System.out.println("Adding product : " + product);
    }

    @Override
    public void confirm(Order order) {
        System.out.println("Order confirmed.");
        order.setState(IsConfirmed.getInstance());
    }

    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship. Order is not confirmed.");
    }
}
