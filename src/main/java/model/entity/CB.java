package model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Classe CB caractérisée par un numéro de carte, un plafond de retrait et du
 * type de carte.
 * 
 * @author Jean-Charles & Ihab
 *
 */
@Entity
public class CB {

	// Attributs
	@Id
	private long numeroCarte;
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;
	
	private int PLAFONDRETRAIT = 300;
	private String typeCarte;

	// Constructeur
	public CB(String typeCarte) {
		this.typeCarte = typeCarte;
	}
	
	public CB() {
		super();
	}


	// Getters et setters
	public long getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(long numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	public int getPlafondRetrait() {
		return PLAFONDRETRAIT;
	}

	public void setPlafondRetrait(int plafondRetrait) {
		this.PLAFONDRETRAIT = plafondRetrait;
	}

	public String getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	@Override
	public String toString() {
		return "numéro carte : " + getNumeroCarte() + ", type de carte : " + getTypeCarte() + ", plafond : "
				+ getPlafondRetrait() + "€";
	}

}
