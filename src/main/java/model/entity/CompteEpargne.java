package model.entity;


import javax.persistence.Entity;

/**
 * Classe CompteEpargne caract�ris�e par un taux de r�mun�ration qui h�rite de
 * la classe Compte.
 * 
 * @author Jean-Charles & Ihab
 *
 */

@Entity
public class CompteEpargne extends Compte {

//	Attribut
	private int tauxRemuneration = 3;

//	Constructeur
	public CompteEpargne(double solde, String dateOuverture) {
		super(solde, dateOuverture);
	}

	public CompteEpargne() {
		super();
	}

	//	Getter et setter
	public int getTAUXREMUNERATION() {
		return tauxRemuneration;
	}

	public void setTAUXREMUNERATION(int TauxRemuneration) {
		tauxRemuneration = TauxRemuneration;
	}

	@Override
	public String toString() {
		return "num�ro de compte : " + getNumeroCompte() + ", �pargne : " + getSolde() + "�" + ", date d'ouverture : "
				+ getDateOuverture();
	}

}
