package model.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


/**
 * Classe Conseiller caractérisée par une liste de clients et qui hérite de la
 * classe Employe.
 * 
 * @author Jean-Charles & Ihab
 *
 */

@Entity
public class Conseiller extends Employe {

//	Attribut

	@OneToMany(mappedBy = "conseiller", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<Client> setClient = new HashSet<Client>();
	


//	Constructeur
	public Conseiller(String nom, String prenom) {
		super(nom, prenom);
	}
	public Conseiller() {
		super();
	}

//	Getter et setter
	public Set<Client> getListeClient() {
		return setClient;
	}

	public void setListeClient(Set<Client> setClient) {
		this.setClient = setClient;
	}

	@Override
	public String toString() {
		return "Conseiller [listeClient=" + setClient + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ "]";
	}

}
