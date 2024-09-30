package strategies;

public class Decorator implements Strategy {

    private final Strategy strategy;
    private int counter;

    public Decorator(Strategy strategy) {
        this.strategy = strategy;
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public boolean isValid(String word) {
        boolean isValid = strategy.isValid(word);
        if (isValid) counter++;

        return isValid;
    }
}