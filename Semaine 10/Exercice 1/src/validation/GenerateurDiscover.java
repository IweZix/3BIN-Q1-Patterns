package validation;

import domaine.CarteDeCredit;
import domaine.Discover;

import java.util.Calendar;

public class GenerateurDiscover extends Generateur {

    public GenerateurDiscover(Generateur successeur) {
        super(successeur);
    }

    public boolean valider(String numero) {
        return numero.length() == 16 && numero.startsWith("6011");
    }

    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero)) {
            return new Discover(numero, dateExpiration, nom);
        }
        return super.creerCarte(numero, dateExpiration, nom);
    }

}
