public class IsShipped extends State {
    private static IsShipped instance = null;

    private IsShipped() {}

    public static IsShipped getInstance() {
        if (instance == null) {
            instance = new IsShipped();
        }
        return instance;
    }

    @Override
    public void addProduct(Order order, String product) {
        System.out.println("Cannot add products. Order is already shipped.");
    }

    @Override
    public void confirm(Order order) {
        System.out.println("Order is already shipped. Cannot confirm.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order is already shipped.");
    }
}