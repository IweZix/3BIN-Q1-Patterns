package strategies;

public class NOT implements Strategy {

    private final Strategy[] strategy;

    public NOT(Strategy... strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean isValid(String word) {
        for (Strategy strategy : strategy) {
            if (strategy.isValid(word)) {
                return false;
            }
        }
        return true;
    }
}
