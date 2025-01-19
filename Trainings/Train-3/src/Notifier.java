import java.util.ArrayList;
import java.util.List;

public class Notifier {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    public void notify(String str) {
        for (Observer obs : observers) {
            obs.update(str);
        }
    }
}
