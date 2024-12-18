package validation;

import domaine.CarteDeCredit;
import domaine.DinersClub;

import java.util.Calendar;

public class GenerateurDinersClub extends Generateur {
    public GenerateurDinersClub(Generateur successeur) {
        super(successeur);
    }

    public boolean valider(String numero) {
        return numero.length() == 14 && numero.startsWith("36");
    }

    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero)) {
            return new DinersClub(numero, dateExpiration, nom);
        }
        return super.creerCarte(numero, dateExpiration, nom);
    }
}
