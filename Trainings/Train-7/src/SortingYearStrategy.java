import java.util.List;

public class SortingYearStrategy implements SortingStrategy {
    @Override
    public void sort(List<Book> books) {
        books.sort((b1, b2) -> Integer.compare(b1.getYear(), b2.getYear()));
    }
}
