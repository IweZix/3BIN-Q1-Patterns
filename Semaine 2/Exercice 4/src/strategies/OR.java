package strategies;

public class OR implements Strategy {

    private final Strategy[] strategies;

    public OR(Strategy... strategies) {
        this.strategies = strategies;
    }

    @Override
    public boolean isValid(String word) {
        for (Strategy strategy : strategies) {
            if (strategy.isValid(word)) {
                return true;
            }
        }
        return false;
    }
}
