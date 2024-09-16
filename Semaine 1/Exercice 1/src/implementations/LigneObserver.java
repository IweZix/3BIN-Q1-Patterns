package implementations;

import interfaces.Observer;

public class LigneObserver implements Observer {

    private Integer count = 0;

    @Override
    public void update(String line) {
        if (line == null) {
            displayStats();
        } else {
            count++;
        }
    }

    @Override
    public void displayStats() {
        System.out.println("Il y avait " + count + " lignes.");
    }
}
