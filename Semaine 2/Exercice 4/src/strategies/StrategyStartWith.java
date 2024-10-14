package strategies;

public class StrategyStartWith implements Strategy {

    private final char startWith;

    public StrategyStartWith(char startWith) {
        this.startWith = startWith;
    }

    @Override
    public boolean isValid(String word) {
        return Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(startWith);
    }
}
