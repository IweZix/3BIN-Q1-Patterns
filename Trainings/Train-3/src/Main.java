public class Main {
    public static void main(String[] args) {
        Notifier notifier = new Notifier(); // Le Sujet

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        // Ajout des observateurs
        notifier.addObserver(user1);
        notifier.addObserver(user2);
        notifier.addObserver(user3);

        // Envoi de notifications
        notifier.notify("Welcome to the Observer Pattern!");
        System.out.println();

        // Suppression d'un observateur
        notifier.removeObserver(user2);

        // Nouvelle notification
        notifier.notify("Bob has unsubscribed.");
    }
}