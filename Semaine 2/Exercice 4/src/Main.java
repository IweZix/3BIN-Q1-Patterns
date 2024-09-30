import strategies.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ListWords listWords = new ListWords("./resources/file.txt");

        try {
            System.out.println("Words that start with 't' :");
            Decorator decorator = new Decorator(new StrategyStartWith('t'));
            listWords.listWords(decorator);
            System.out.println("Number of words that start with 't' : " + decorator.getCounter());
            System.out.println();

            System.out.println("Words that have size 5 :");
            listWords.listWords(new StrategySize(5));
            System.out.println();

            System.out.println("Words that are palindromes :");
            listWords.listWords(new StrategyPalindrome());
            System.out.println();

            System.out.println("Words that start with 't' and have size 5 :");
            listWords.listWords(new AND(new StrategyStartWith('t'), new StrategySize(5)));
            System.out.println();

            System.out.println("Words that start with 'e' or are palindromes :");
            listWords.listWords(new OR(new StrategyStartWith('e'), new StrategyPalindrome()));
            System.out.println();

            System.out.println("Words that not start with 'e' :");
            listWords.listWords(new NOT(new StrategyStartWith('e')));
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}