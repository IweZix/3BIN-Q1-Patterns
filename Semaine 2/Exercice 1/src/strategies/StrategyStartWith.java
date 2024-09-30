package strategies;

public class StrategyStartWith implements Strategies{

    private final String startWith;

    public StrategyStartWith(String startWith) {
        this.startWith = startWith;
    }

    @Override
    public boolean isValid(String word) {
        return word.toLowerCase().startsWith(startWith.toLowerCase());
    }
}
