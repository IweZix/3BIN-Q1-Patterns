public class Main {
    public static void main(String[] args) {
        // Création de formes simples
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Création d'un groupe contenant des formes
        Group group1 = new Group();
        group1.addShape(circle);
        group1.addShape(rectangle);

        // Création d'un groupe imbriqué
        Group group2 = new Group();
        group2.addShape(new Circle());

        // Dessiner tout
        group1.draw();
        System.out.println();
        group2.draw();
    }
}