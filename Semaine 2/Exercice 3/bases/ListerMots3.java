import java.io.*;
import java.util.StringTokenizer;

public class ListerMots3 { // mal foutu

	private String fichier;

	public ListerMots3(String fichier) {
		this.fichier = fichier;
	}

	public void imprimerPalindromes() throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(this.fichier));
		String buffer = null;
		while ((buffer = input.readLine()) != null) {
			StringTokenizer mots = new StringTokenizer(buffer, " \t.;(){}\"'*=:!/\\");
			while (mots.hasMoreTokens()) {
				String mot = mots.nextToken();
				if (estPalindrome(mot))
					System.out.println(mot);
			}
		}
	}

	public boolean estPalindrome(String mot) {
		if (mot == null)
			return false;
		StringBuffer stringbuffer = new StringBuffer(mot);
		return mot.equals(stringbuffer.reverse().toString());
	}

	public static void main(String args[]) throws IOException {
		if (args.length == 0) {
			System.out.println("Usage : java ListerMots4 fichier");
			System.exit(1);
		}
		new ListerMots3(args[0]).imprimerPalindromes();
	}
}
