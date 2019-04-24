package model.entity;


import java.util.Set;

import javax.persistence.Entity;


/**
 * Classe Entreprise caractérisée par numéro SIRET et qui hérite de la classe Client.
 * C'est une entité qui apparait directement dans la table Client dans la base de données.
 * 
 * @author Jean-Charles & Ihab
 *
 */

@Entity
public class Entreprise extends Client {

//	Attribut
	private Long numeroSIRET;

//	Constructeur
	
	public Entreprise(String nom, String adresse, int codePostal, String ville, String telephone, Long numeroSIRET, Conseiller co) {
		super(nom, adresse, codePostal, ville, telephone, co);
		this.numeroSIRET = numeroSIRET;
	}

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}


	//	Getter et setter
	public Long getNumeroSIRET() {
		return numeroSIRET;
	}

	public void setNumeroSIRET(long numeroSIRET) {
		this.numeroSIRET = numeroSIRET;
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

	//TOSTRING
	@Override
	public String toString() {
		return "Entreprise [numeroSIRET=" + numeroSIRET + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
