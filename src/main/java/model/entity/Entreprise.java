package model.entity;


import javax.persistence.Entity;


/**
 * Classe Entreprise caractérisée par numéro SIRET et qui hérite de la classe
 * Client.
 * 
 * @author Jean-Charles & Ihab
 *
 */

@Entity
public class Entreprise extends Client {

//	Attribut
	private long numeroSIRET;

//	Constructeur
	public Entreprise(String nom, long numeroSIRET, String adresse, int codePostal, String ville, String telephone) {
		super(nom, adresse, codePostal, ville, telephone);
		this.numeroSIRET = numeroSIRET;
	}

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	//	Getter et setter
	public long getNumeroSIRET() {
		return numeroSIRET;
	}

	public void setNumeroSIRET(long numeroSIRET) {
		this.numeroSIRET = numeroSIRET;
	}

	@Override
	public String toString() {
		return "Entreprise : " + getNom() + "\n" + "n°SIRET : " + getNumeroSIRET() + "\n" + "Adresse :" + getAdresse()
				+ ", " + getCodePostal() + ", " + getVille() + "\n" + "Téléphone : " + getTelephone() + "\n"
				+ "Informations compte courant : " + getCompteCourant() + "\n" + "Carte bancaire : "
				+ getCarteBancaire() + "\n" + "Informations compte épargne : " + getCompteEpargne() + "\n";
	}

}
