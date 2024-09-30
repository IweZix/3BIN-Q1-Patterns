package strategies;

public class StrategyPalindrome {

        public boolean isValid(String word) {
            word = word.replaceAll("^[\\W_]+|[\\W_]+$", "");
            StringBuffer temp = new StringBuffer(word);
            return word.equalsIgnoreCase(temp.reverse().toString());
        }
}
