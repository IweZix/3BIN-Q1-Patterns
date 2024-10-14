package strategies;

public class AND implements Strategies {

    private final Strategies[] strategies;

    public AND(Strategies... strategies) {
        this.strategies = strategies;
    }

    @Override
    public boolean isValid(String word) {
        for (Strategies strategy : strategies) {
            if (!strategy.isValid(word)) {
                return false;
            }
        }
        return true;
    }
}
