package model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import model.entity.Client;

/**
 * Classe CB caract�ris�e par un num�ro de carte, un plafond de retrait, un
 * type de carte et un attribut client. C'est une entit� qui donnera une table dans la base de donn�e. Sa PK 
 * correspond au numero de carte, et elle est un attribut de l'entit� Client, prenant donc une FK client_id.
 * 
 * @author Jean-Charles & Ihab
 *
 */
@Entity
public class CB {

	// Attributs
	@Id
	private long numeroCarte;
	

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="client_id")
	private Client client;
	
	private int plafondRetrait = 300;
	private String typeCarte;

	// Constructeur
	public CB(String typeCarte) {
		this.typeCarte = typeCarte;
	}
	
	public CB(long numeroCarte, Client c) {
		super();
		this.numeroCarte = numeroCarte;
		this.client = c;
	}

	public CB() {
		super();
	}


	// Getters et setters
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	public long getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(long numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	public int getPlafondRetrait() {
		return plafondRetrait;
	}

	public void setPlafondRetrait(int plafondRetrait) {
		this.plafondRetrait = plafondRetrait;
	}

	public String getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	@Override
	public String toString() {
		return "num�ro carte : " + getNumeroCarte() + ", type de carte : " + getTypeCarte() + ", plafond : "
				+ getPlafondRetrait() + "�";
	}

}
