public class IsConfirmed extends State {
    private static IsConfirmed instance = null;

    public IsConfirmed() {}

    public static IsConfirmed getInstance() {
        if (instance == null) {
            instance = new IsConfirmed();
        }
        return instance;
    }

    @Override
    public void addProduct(Order order, String product) {
        System.out.println("Cannot add products. Order is already confirmed.");
    }

    @Override
    public void confirm(Order order) {
        System.out.println("Order is already confirmed.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order shipped.");
        order.setState(IsShipped.getInstance());
    }
}
