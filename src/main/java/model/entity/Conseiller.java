package model.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


/**
 * Classe Conseiller caract�ris�e par une liste de clients et qui h�rite de la
 * classe Employe. Elle apparait directement dans la table Employe dans la base de donn�es.
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
	public Set<Client> getSetClient() {
		return setClient;
	}

	public void setSetClient(Set<Client> setClient) {
		this.setClient = setClient;
	}

	@Override
	public String toString() {
		return "Conseiller [listeClient=" + setClient + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ "]";
	}

}
