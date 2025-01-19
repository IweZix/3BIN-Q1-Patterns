public class Main {
    public static void main(String[] args) {
        MessagePublisher mp = new MessagePublisher();

        User user1 = new User("Bob");
        User user2 = new User("Alice");
        User user3 = new User("Patrick");

        mp.addObserver(user1);
        mp.addObserver(user2);
        mp.addObserver(user3);

        mp.notifyObservers("Message 1");
        System.out.println();

        mp.removeObserver(user3);

        mp.notifyObservers("Patrick has unsubscribed");
    }
}