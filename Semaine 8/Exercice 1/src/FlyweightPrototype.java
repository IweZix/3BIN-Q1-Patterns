import java.util.HashMap;
import java.util.Map;

public class FlyweightPrototype {

    private Map<String, Robot> map;

    public FlyweightPrototype() {
        this.map = new HashMap<>();
    }

    public Robot createRobot(String name) throws CloneNotSupportedException {
        return (Robot) map.get(name).clone();
    }

    public void put(String name, Robot robot) {
        map.put(name, robot);
    }
}