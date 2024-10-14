package strategies;

public class StrategyPalindrome implements Strategies {

        @Override
        public boolean isValid(String word) {
            if (word.length() < 2) {
                return false;
            }
            String reverse = new StringBuilder(word).reverse().toString();
            return word.equalsIgnoreCase(reverse);
        }
}
