package implementations;

import interfaces.Observer;

public class MotObserver implements Observer {

    private Integer count = 0;

    @Override
    public void update(String line) {
        if (line == null) {
            displayStats();
        } else {
            for (String mot : line.trim().split(" ")) {
                count++;
            }
        }
    }

    @Override
    public void displayStats() {
        System.out.println("Il y avait " + count + " mots.");
    }
}
