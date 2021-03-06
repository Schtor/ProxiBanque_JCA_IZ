package model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Classe Compte caract�ris�e par un id, un num�ro de compte, un solde et une date d'ouverture. On lui ajoute
 * en attribut des objets Client. C'est une entit� qui donnera une table dans la base de donn�e. 
 * Sa PK correspond � l'attribut Id, dont la valeur est g�n�r�e automatiquementet elle est un attribut 
 * de l'entit� Client, prenant donc une FK client_id. C'est la classe m�re de 
 * CompteCourant et CompteEpargne, qui apparaitront donc dans la table Compte dans la base de donn�es.
 * 
 * @author Jean-Charles & Ihab
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {

	// Attributs
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private long numeroCompte;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "client_id")
	private Client client;

	private double solde;
	private String dateOuverture;

	// Constructeur
	public Compte(int solde, Long numeroCompte, String dateOuverture, Client c) {
		this.solde = solde;
		this.numeroCompte = numeroCompte;
		this.dateOuverture = dateOuverture;
		this.client = c;
	}

	public Compte() {
		super();
	}

	// Getters et setters

	public long getNumeroCompte() {
		return numeroCompte;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	/**
	 * Impossible d'attribuer un solde de compte dans le n�gatif
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
