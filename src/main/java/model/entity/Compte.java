package model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Classe Compte caractérisée par un numéro de compte, un solde et une date
 * d'ouverture.
 * 
 * @author Jean-Charles & Ihab
 *
 */

@Entity
public class Compte {

	// Attributs
	@Id
	private long numeroCompte;
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;
	
	private double solde;
	private String dateOuverture;

	// Constructeur
	public Compte(double solde, String dateOuverture) {
		setSolde(solde);
		this.dateOuverture = dateOuverture;
	}
	public Compte() {
		super();
	}

	// Getters et setters
	public long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	/**
	 * Impossible d'attribuer un solde de compte dans le négatif
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

}
