import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
