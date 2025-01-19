import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création des livres
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("1984", "George Orwell", 1949));

        // Création de la bibliothèque
        Library library = new Library(books);

        // Tri par titre
        library.setStrategy(new SortingTitleStrategy());
        System.out.println("Sorted by Title:");
        library.sortBooks();
        library.displayBooks();

        // Tri par auteur
        library.setStrategy(new SortingAuthorStrategy());
        System.out.println("\nSorted by Author:");
        library.sortBooks();
        library.displayBooks();

        // Tri par année
        library.setStrategy(new SortingYearStrategy());
        System.out.println("\nSorted by Year:");
        library.sortBooks();
        library.displayBooks();
    }
}