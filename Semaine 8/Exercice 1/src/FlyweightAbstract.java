import java.util.HashMap;
import java.util.Map;

public class FlyweightAbstract {

    private Map<String, AbstractFactory> map;

    public FlyweightAbstract() {
        this.map = new HashMap<>();
    }

    public Robot createRobot(String name) {
        return map.get(name).createRobot();
    }

    public void put(String name, AbstractFactory factory) {
        map.put(name, factory);
    }
}
