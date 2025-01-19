import java.util.ArrayList;
import java.util.List;

public class Group implements Item {
    private List<Item> items = new ArrayList<>();

    void addItem(Item item) {
        items.add(item);
    }

    void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public void display() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
