package validation;

import domaine.CarteDeCredit;
import domaine.Visa;

import java.util.Calendar;

public class GenerateurVisa extends Generateur {

    public GenerateurVisa(Generateur successeur) {
        super(successeur);
    }

    public boolean valider(String numero) {
        return numero.length() == 16 && numero.startsWith("4");
    }

    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero)) {
            return new Visa(numero, dateExpiration, nom);
        }
        return super.creerCarte(numero, dateExpiration, nom);
    }
}
