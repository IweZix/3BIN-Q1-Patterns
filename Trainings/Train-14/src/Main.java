public class Main {
    public static void main(String[] args) {
        // Créer des articles simples
        Item pizza = new Pizza();
        Item soda = new Soda();

        // Créer un menu groupé
        Group menu = new Group();
        menu.addItem(pizza);
        menu.addItem(soda);

        // Créer un menu combiné
        Group bigMenu = new Group();
        bigMenu.addItem(menu);
        bigMenu.addItem(new Pizza());

        // Afficher les différents groupes et articles
        System.out.println("Menu :");
        menu.display();

        System.out.println("\nBig Menu :");
        bigMenu.display();
    }
}