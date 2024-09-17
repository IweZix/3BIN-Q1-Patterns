package implementations;

import interfaces.Observer;

public class PalindromeObserver implements Observer {

    private Integer count = 0;

    @Override
    public void update(String line) {
        if (line == null) {
            displayStats();
        } else {
            for (String mot : line.trim().split("[\\s,.\"]+")) {
                mot = mot.replaceAll("^[\\W_]+|[\\W_]+$", ""); // Remove leading and trailing punctuation
                if (mot.length() > 1) {
                    StringBuffer temp = new StringBuffer(mot);
                    if (temp.reverse().toString().equals(mot)) {
                        System.out.println("Palindrome trouvé: " + mot);
                        count++;
                    }
                }
            }
        }
    }

    @Override
    public void displayStats() {
        System.out.println("Il y avait " + count + " palindromes.");
    }
}
