package implementations;

import interfaces.Observer;

/**
 * Belgique class.
 * Calculate the number of lines containing "Belgique".
 */
public class BelgiqueObserver implements Observer {

    private Integer count = 0;

    @Override
    public void update(String line) {
        if (line == null) {
            displayStats();
        } else {
            if (line.contains("Belgique")) {
                count++;
            }
        }
    }

    @Override
    public void displayStats() {
        System.out.println("Il y avait " + count + " lignes contenant Belgique.");
    }
}
