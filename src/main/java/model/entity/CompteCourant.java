package model.entity;


import javax.persistence.Entity;


/**
 * Classe CompteCourant caract�ris�e par une autorisation de d�couvert et qui
 * h�rite de la classe Compte.
 * 
 * @author Jean-Charles & Ihab
 *
 */

@Entity
public class CompteCourant extends Compte {

//	Attribut
	private int autorisationDecouvert = 1000;

//	Constructeur
	public CompteCourant(double solde, String dateOuverture) {
		super(solde, dateOuverture);
	}


	public CompteCourant() {
		super();
	}

	//	Getter et setter

	public int getAutorisationDecouvert() {
		return autorisationDecouvert;

	}

	public void setAutorisationDecouvert(int AutorisationDecouvert) {
		autorisationDecouvert = AutorisationDecouvert;
	}

	@Override
	public String toString() {
		return "num�ro de compte : " + getNumeroCompte() + ", solde : " + getSolde() + "�" + ", date d'ouverture : "
				+ getDateOuverture();
	}

}
