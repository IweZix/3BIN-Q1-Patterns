package implementations;

import interfaces.Observer;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class AnalyseurTexte {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    public void readObservers(BufferedReader bufferedReader) {
        String line = null;
        try {
            do {
                line = bufferedReader.readLine();
                for (Observer obs : observers) {
                    obs.update(line);
                }
            } while (line != null);

        } catch (Exception e) {
            System.out.println("Error during file reading");
        }
    }
}
