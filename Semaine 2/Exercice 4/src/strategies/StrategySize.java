package strategies;

public class StrategySize implements Strategy {

    private final int size;

    public StrategySize(int size) {
        this.size = size;
    }

    @Override
    public boolean isValid(String word) {
        return word.length() == size;
    }
}