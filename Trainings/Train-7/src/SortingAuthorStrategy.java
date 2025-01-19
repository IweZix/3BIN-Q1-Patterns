import java.util.List;

public class SortingAuthorStrategy implements SortingStrategy {
    @Override
    public void sort(List<Book> books) {
        books.sort((b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor()));
    }
}
