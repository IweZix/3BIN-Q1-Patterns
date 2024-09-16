package interfaces;

/**
 * Observer interface.
 */
public interface Observer {

    /**
     * Update the observer.
     * @param line The line
     */
    public void update(String line);

    /**
     * Display stats of an observer.
     */
    public void displayStats();
}
