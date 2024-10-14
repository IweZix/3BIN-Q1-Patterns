package strategies;

public class StrategyStartWith implements Strategies{

    private final char startWith;

    public StrategyStartWith(char startWith) {
        this.startWith = startWith;
    }

    @Override
    public boolean isValid(String word) {
        return Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(startWith);
    }
}
