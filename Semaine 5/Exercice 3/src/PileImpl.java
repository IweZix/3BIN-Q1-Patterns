public class PileImpl implements Pile {
	private NoeudPile tete;
	private int taille;

	public PileImpl() {
		this.tete = null;
	}

	public void push(Object élément) {
		this.tete = new NoeudPile(élément, this.tete);
		this.taille++;
	}

	public Object pop() {
		Object résultat = sommet();
		this.tete = this.tete.getSuivant();
		this.taille--;
		return résultat;
	}

	public Object sommet() {
		return this.tete.getElement();
	}

	public boolean estVide() {
		return this.tete == null;
	}

	public int taille() {
		return this.taille;
	}

	public String toString() {
		NoeudPile courant = this.tete;
		String résultat = "";
		while (courant != null) {
			résultat += courant.getElement();
			résultat += " ";
			courant = courant.getSuivant();
		}
		return résultat;
	}

	class NoeudPile {
		private Object element;
		private NoeudPile suivant;

		public NoeudPile(Object element) {
			this(element, null);
		}

		public NoeudPile(Object element, NoeudPile suivant) {
			setElément(element);
			setSuivant(suivant);
		}

		public void setElément(Object elem) {
			this.element = elem;
		}

		public void setSuivant(NoeudPile suiv) {
			this.suivant = suiv;
		}

		public Object getElement() {
			return this.element;
		}

		public NoeudPile getSuivant() {
			return this.suivant;
		}
	}
}
