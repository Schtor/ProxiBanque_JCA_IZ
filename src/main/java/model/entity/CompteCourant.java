package model.entity;


import javax.persistence.Entity;


/**
 * Classe CompteCourant caractérisée par une autorisation de découvert et qui
 * hérite de la classe Compte.
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
		return "numéro de compte : " + getNumeroCompte() + ", solde : " + getSolde() + "€" + ", date d'ouverture : "
				+ getDateOuverture();
	}

}
