package model.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Classe Client caractérisée par un id, un nom, une adresse, un code postal,
 * une ville, un téléphone. Il possède obligatiorement un compte courant et peut
 * possèder un compte épargne et une carte bancaire.
 * 
 * @author Jean-Charles & Ihab
 *
 */

@Entity
public class Client {

//	Attributs
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	@OneToMany(mappedBy = "client", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<Compte> setCompte = new HashSet<Compte>();
	
	@OneToMany(mappedBy = "client", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<CB> setCB = new HashSet<CB>();
	
	@ManyToOne
	@JoinColumn(name="conseiller_id")
	private Conseiller conseiller;
		
	private String nom;
	private String adresse;
	private int codePostal;
	private String ville;
	private String telephone;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	private CB carteBancaire;

//	Constructeur
	public Client(String nom, String adresse, int codePostal, String ville, String telephone) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}
	
	public Client() {
		super();
	}

//	Getters et setters

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

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	public CB getCarteBancaire() {
		return carteBancaire;
	}

	public void setCarteBancaire(CB carteBancaire) {
		this.carteBancaire = carteBancaire;
	}

}
