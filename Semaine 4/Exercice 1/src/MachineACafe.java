public class MachineACafe {

	public final State idle = new StateInactif();
	public final State collecte = new StateCollecte();
	public final State pasAssez = new StatePasAssez();

	private int montantEnCours = 0;
	private State etatCourant = idle;
	private ToucheBoisson boisson = null;

	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}

	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}

	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
		System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);
	}

	public void setState(State etatCourant) {
		this.etatCourant = etatCourant;
	}

	public void setMontantEnCourst(int montantEnCours) {
		this.montantEnCours = montantEnCours;
	}

	public int getMontantEnCourst() {
		return montantEnCours;
	}

	public void setBoisson(ToucheBoisson boisson) {
		this.boisson = boisson;
	}

	public ToucheBoisson getBoisson() {
		return boisson;
	}

	public void entrerMonnaie(Piece piece) {
		etatCourant.entrerMonnaie(this, piece);

		/*
		montantEnCours += piece.getValeur();
		afficherMontant();
		if ( etatCourant != pasAssez) {
			etatCourant = collecte;
		} else if (boisson.getPrix() > montantEnCours) {
				afficherPasAssez(boisson);
		} else {
			montantEnCours -= boisson.getPrix();
			afficherBoisson(boisson);
			boisson = null;
			afficherMontant();
			if (montantEnCours == 0)
				etatCourant =  idle;
			else
				etatCourant =  collecte;
		}
		*/
	}

	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
		etatCourant.selectionnerBoisson(this, toucheBoisson);
		/*
		if (etatCourant == pasAssez)
			throw new IllegalStateException();
		if (etatCourant == idle) {
			afficherPasAssez(toucheBoisson);
			return;
		}

		if (toucheBoisson.getPrix() > montantEnCours) {
			boisson = toucheBoisson;
			afficherPasAssez(boisson);
			boisson = toucheBoisson;
			etatCourant =  pasAssez;
			return;
		}

		montantEnCours -= toucheBoisson.getPrix();
		afficherBoisson(toucheBoisson);
		afficherMontant();
		if (montantEnCours == 0)
			etatCourant = idle;
		else
			etatCourant = collecte;
		 */
	}

	public void rendreMonnaie() {
		etatCourant.rendreMonnaie(this);
		/*
		if (etatCourant != idle) {
			afficherRetour();
			montantEnCours = 0;
			boisson = null;
		}
		etatCourant = idle;
		*/
	}
}
