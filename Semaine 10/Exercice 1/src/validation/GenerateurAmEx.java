package validation;

import domaine.AmEx;
import domaine.CarteDeCredit;

import java.util.Calendar;

public class GenerateurAmEx extends Generateur {

    public GenerateurAmEx(Generateur successeur) {
        super(successeur);
    }

    public boolean valider(String numero) {
        return numero.length() == 15 && (numero.startsWith("37") || numero.startsWith("34"));
    }

    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero)) {
            return new AmEx(numero, dateExpiration, nom);
        }
        return super.creerCarte(numero, dateExpiration, nom);
    }
}
