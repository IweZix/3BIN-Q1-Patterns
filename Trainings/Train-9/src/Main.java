public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // État "Created"
        order.addProduct("Laptop");
        order.confirm();

        // État "Confirmed"
        order.addProduct("Mouse"); // Ne devrait pas fonctionner
        order.ship();

        // État "Shipped"
        order.addProduct("Keyboard"); // Ne devrait pas fonctionner
        order.confirm(); // Ne devrait pas fonctionner
        order.ship(); // Déjà expédié
    }
}