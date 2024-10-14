import java.io.*;
import java.util.*;

public class ListerMots2 { // mal foutu
	private String fichier;

	public ListerMots2(String fichier) {
		this.fichier = fichier;
	}

	public void imprimerSiDeLongueur(int longueur) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(this.fichier));
		String buffer = null;
		while ((buffer = input.readLine()) != null) {
			StringTokenizer mots = new StringTokenizer(buffer, " \t.;(){}\"'*=:!/\\");
			while (mots.hasMoreTokens()) {
				String mot = mots.nextToken();
				if (mot.length() == longueur)
					System.out.println(mot);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.out.println("Usage : java ListerMots2 fichier");
			System.exit(1);
		}
		new ListerMots2(args[0]).imprimerSiDeLongueur(5);
	}
}
