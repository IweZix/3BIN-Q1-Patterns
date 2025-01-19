import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void sortBooks(String criterion) {
        if (criterion.equals("title")) {
            books.sort((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        } else if (criterion.equals("author")) {
            books.sort((b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor()));
        } else if (criterion.equals("year")) {
            books.sort((b1, b2) -> Integer.compare(b1.getYear(), b2.getYear()));
        }
    }
}