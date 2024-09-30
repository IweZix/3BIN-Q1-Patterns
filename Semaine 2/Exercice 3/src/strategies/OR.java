package strategies;

public class OR implements Strategies {

    private final Strategies[] strategies;

    public OR(Strategies... strategies) {
        this.strategies = strategies;
    }

    @Override
    public boolean isValid(String word) {
        for (Strategies strategy : strategies) {
            if (strategy.isValid(word)) {
                return true;
            }
        }
        return false;
    }
}
