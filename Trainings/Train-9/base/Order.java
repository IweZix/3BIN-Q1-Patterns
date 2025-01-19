public class Order {
    private String state;

    public Order() {
        state = "CREATED";
    }

    public void addProduct(String product) {
        if (state.equals("CREATED")) {
            System.out.println("Adding product: " + product);
        } else {
            System.out.println("Cannot add products, order is not in CREATED state.");
        }
    }

    public void confirm() {
        if (state.equals("CREATED")) {
            System.out.println("Order confirmed.");
            state = "CONFIRMED";
        } else {
            System.out.println("Order cannot be confirmed.");
        }
    }

    public void ship() {
        if (state.equals("CONFIRMED")) {
            System.out.println("Order shipped.");
            state = "SHIPPED";
        } else {
            System.out.println("Order cannot be shipped.");
        }
    }
}