import java.util.List;

public class Library {
    private List<Book> books;
    private SortingStrategy strategy;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortBooks() {
        if (strategy != null) {
            strategy.sort(books);
        } else {
            System.out.println("No sort strategy set!");
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}