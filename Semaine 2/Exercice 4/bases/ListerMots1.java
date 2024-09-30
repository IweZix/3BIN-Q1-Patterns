import java.io.*;
import java.util.*;

public class ListerMots1 { // mal foutu
	private String fichier;

	public ListerMots1(String fichier) {
		this.fichier = fichier;
	}

	public void imprimerSiCommenceParT() throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(this.fichier));
		String buffer = null;
		while ((buffer = input.readLine()) != null) {
			StringTokenizer mots = new StringTokenizer(buffer, " \t.;(){}\"'*=:!/\\");
			while (mots.hasMoreTokens()) {
				String mot = mots.nextToken();
				if (mot.charAt(0) == 't')
					System.out.println(mot);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.out.println("Usage : java ListerMots1 fichier");
			System.exit(1);
		}
		new ListerMots1(args[0]).imprimerSiCommenceParT();
	}
}
