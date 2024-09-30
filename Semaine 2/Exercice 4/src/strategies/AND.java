package strategies;

public class AND implements Strategy {

    private final Strategy[] strategies;

    public AND(Strategy... strategies) {
        this.strategies = strategies;
    }

    @Override
    public boolean isValid(String word) {
        for (Strategy strategy : strategies) {
            if (!strategy.isValid(word)) {
                return false;
            }
        }
        return true;
    }
}
