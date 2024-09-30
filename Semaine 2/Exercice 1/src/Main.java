import strategies.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ListWords listWords = new ListWords("./resources/file.txt");

        try {
            listWords.listWords(new StrategyStartWith("t"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}