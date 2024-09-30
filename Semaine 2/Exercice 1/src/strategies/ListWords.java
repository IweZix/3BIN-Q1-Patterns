package strategies;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ListWords {

    private String file;

    public ListWords(String file) {
        this.file = file;
    }

    public void listWords(Strategies strategy) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(this.file));
        String buffer = null;
        while ((buffer = input.readLine()) != null) {
            String[] words = buffer.split(" ");
            for (String word : words) {
                if (strategy.isValid(word)) {
                    System.out.println(word);
                }
            }
        }
    }
}
