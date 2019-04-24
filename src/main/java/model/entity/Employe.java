package model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe Employe caract�ris�e par un id, un nom et un pr�nom. C'est une entit� qui donnera une table dans la
 * base de donn�e. Sa PK correspond � l'attribut Id, dont la valeur est g�n�r�e automatiquementet. 
 * C'est la classe m�re de Conseiller et Gerant, qui apparaitront donc dans la table Employe
 * dans la base de donn�es.
 * 
 * @author Jean-Charles & Ihab
 *
 */
@Entity
public class Employe {

//	Attribut
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;

	private String nom;
	private String prenom;

//	Constructeur
	public Employe(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public Employe() {
		super();
	}

//	Getter et setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
