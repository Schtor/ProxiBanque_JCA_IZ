package model;

import model.entity.Employe;

/**
 * Classe Gerant et qui hérite de la classe Employe.
 * 
 * @author Jean-Charles & Ihab
 *
 */
public class Gerant extends Employe {

//	Constructeur
	public Gerant(String nom, String prenom) {
		super(nom, prenom);
	}

}
