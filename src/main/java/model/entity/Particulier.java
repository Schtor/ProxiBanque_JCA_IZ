package model.entity;

import java.util.Set;

import javax.persistence.Entity;

/**
 * Classe Particulier caractérisée par un prénom et qui hérite de la classe Client.
 * C'est une entité qui apparait directement dans la table Compte dans la base de données.
 * 
 * @author Jean-Charles & Ihab
 *
 */

@Entity
public class Particulier extends Client {

//	Attribut
	private String prenom;

//	Constructeur

	public Particulier(String nom, String prenom, String adresse, int codePostal, String ville, String telephone, Conseiller co) {
		super(nom, adresse, codePostal, ville, telephone, co);
		this.prenom = prenom;
	}

	public Particulier() {
		super();
	}


	// Getter et setter
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public Conseiller getConseiller() {
		// TODO Auto-generated method stub
		return super.getConseiller();
	}

	@Override
	public void setConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		super.setConseiller(conseiller);
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom(nom);
	}

	@Override
	public String getAdresse() {
		// TODO Auto-generated method stub
		return super.getAdresse();
	}

	@Override
	public void setAdresse(String adresse) {
		// TODO Auto-generated method stub
		super.setAdresse(adresse);
	}

	@Override
	public int getCodePostal() {
		// TODO Auto-generated method stub
		return super.getCodePostal();
	}

	@Override
	public void setCodePostal(int codePostal) {
		// TODO Auto-generated method stub
		super.setCodePostal(codePostal);
	}

	@Override
	public String getVille() {
		// TODO Auto-generated method stub
		return super.getVille();
	}

	@Override
	public void setVille(String ville) {
		// TODO Auto-generated method stub
		super.setVille(ville);
	}

	@Override
	public String getTelephone() {
		// TODO Auto-generated method stub
		return super.getTelephone();
	}

	@Override
	public void setTelephone(String telephone) {
		// TODO Auto-generated method stub
		super.setTelephone(telephone);
	}

	@Override
	public Set<CB> getSetCB() {
		// TODO Auto-generated method stub
		return super.getSetCB();
	}

	@Override
	public void setSetCB(Set<CB> setCB) {
		// TODO Auto-generated method stub
		super.setSetCB(setCB);
	}

	@Override
	public Set<Compte> getSetCompte() {
		// TODO Auto-generated method stub
		return super.getSetCompte();
	}

	@Override
	public void setSetCompte(Set<Compte> setCompte) {
		// TODO Auto-generated method stub
		super.setSetCompte(setCompte);
	}

	// TOSTRING
	@Override
	public String toString() {
		return "Particulier [prenom=" + prenom + ", toString()=" + super.toString() + "]";
	}

}
