package strategies;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ListWords {

    private String file;

    public ListWords(String file) {
        this.file = file;
    }

    public void listWords(Strategy strategy) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(this.file));
        String buffer = null;
        while ((buffer = input.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(buffer, " \t.;(){}\"'*=:!/\\");
            while (st.hasMoreTokens()) {
                String mot = st.nextToken();
                if (strategy.isValid(mot))
                    System.out.println(mot);
            }
        }
    }
}
