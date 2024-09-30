package strategies;

public class NOT implements Strategies {

    private final Strategies[] strategy;

    public NOT(Strategies... strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean isValid(String word) {
        for (Strategies strategy : strategy) {
            if (strategy.isValid(word)) {
                return false;
            }
        }
        return true;
    }
}
