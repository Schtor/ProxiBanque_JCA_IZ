package model.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 * Classe Client caractérisée par un id, un nom, une adresse, un code postal,
 * une ville, un téléphone. On lui ajoute en attribut des objets Conseiller, un SetCompte qui comptient des 
 * CompteCourant et CompteEpargne, et un SetCB qui contient des objets CB. C'est une entité qui donnera une
 * table dans la base de donnée. Sa PK correspond à l'attribut Id, dont la valeur est générée automatiquement
 * et elle est un attribut de l'entité Conseiller, prenant donc une FK conseiller_id. C'est la classe mère de 
 * Particulier et Entreprise, qui apparaitront donc dans la table client dans la base de données.
 * 
 * @author Jean-Charles & Ihab
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Client {

//	Attributs
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	@OneToMany(mappedBy = "client", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<Compte> setCompte = new HashSet<Compte>();
	

	@OneToMany(mappedBy = "client", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<CB> setCB = new HashSet<CB>();
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="conseiller_id")
	private Conseiller conseiller;
		
	private String nom;
	private String adresse;
	private int codePostal;
	private String ville;
	private String telephone;
	private String prenom;
	private Long numeroSIRET;

//	Constructeur
	public Client(String nom, String adresse, int codePostal, String ville, String telephone, Conseiller co) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.conseiller = co;
	}


	public Client() {
		super();
	}

//	Getters et setters
	public Conseiller getConseiller() {
		return conseiller;
	}
	
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public Set<CB> getSetCB() {
		return setCB;
	}


	public void setSetCB(Set<CB> setCB) {
		this.setCB = setCB;
	}


	public Set<Compte> getSetCompte() {
		return setCompte;
	}


	public void setSetCompte(Set<Compte> setCompte) {
		this.setCompte = setCompte;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public Long getNumeroSIRET() {
		return numeroSIRET;
	}




	public void setNumeroSIRET(Long numeroSIRET) {
		this.numeroSIRET = numeroSIRET;
	}

	
}
