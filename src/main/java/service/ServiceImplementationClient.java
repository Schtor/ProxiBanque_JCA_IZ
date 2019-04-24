package service;

import java.util.List;

import model.entity.Client;
import model.entity.Entreprise;
import model.entity.Particulier;
import persistance.DAOEntreprise;
import persistance.DAOParticulier;
import persistance.DAOScenario;

/**
 * Classe ServiceImplementationClient qui impl�mente l'interface ClientService.
 * Elle est compos�e des r�gles m�tiers pour le client et joue le r�le
 * d'interm�diaire entre l'utilisateur et la base de donn�es des clients.
 * 
 * @author Jean-Charles & Ihab
 *
 */
public class ServiceImplementationClient implements ClientService {

	DAOScenario daos = new DAOScenario();
	DAOParticulier daop = new DAOParticulier();
	DAOEntreprise daoe = new DAOEntreprise();
	Client c = new Client();

	
	public void lancerScenario () {
		daos.scenario();	
	}
		
	 /**
	 * M�thode appelant la sauvegarde d'un client dans la base de donn�es clients.
	 * Les num�ros de compte (courant, �pargne) et le num�ro de carte bancaire sont
	 * g�n�r�s � condition que le client poss�de ces comptes et une carte bancaire.
	 * 
	 * @param Client c
	 */
	public void ajouterClient(Client c) {
		if (c instanceof Particulier) {
			daop.sauvegarderClient(c);
		} else if (c instanceof Entreprise) {
			daoe.sauvegarderClient(c);
		}
	}

	/**
	 * M�thode appelant la demande d'un client dans la base de donn�es clients.
	 * 
	 * @param int id
	 */
	public Client trouverClient(int id) {
		if (c instanceof Particulier) {
			daop.afficherClientParId(id);
		} else if (c instanceof Entreprise) {
			daoe.afficherClientParId(id);
		}
		return c;
	}

	/**
	 * M�thode appelant la demande de tous les client dans la base de donn�es
	 * clients.
	 * 
	 */
	public List<Client> trouverToutClient() {

		return daop.afficherTout();
	}

	/**
	 * M�thode appelant la modification de l'adresse d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, String adresse
	 */
	public void modifierAdresseClient(int id, String adresse) {
		if (c instanceof Particulier) {
			daop.modifierAdresseClientParId(id, adresse);
		} else if (c instanceof Entreprise) {
			daoe.modifierAdresseClientParId(id, adresse);
		}
	}

	/**
	 * M�thode appelant la modification du SIRET d'une entreprise dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, String adresse
	 */
	
	public void modifierSiretClientParId(int id, Long siret) {
		daoe.modifierSiretClientParId(id, siret);
	}
	
	/**
	 * M�thode appelant la modification du pr�nom d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, String adresse
	 */
	public void modifierPrenomClientParId(int id, String prenom) {
		daop.modifierPrenomClientParId(id, prenom);
	}
	
	/**
	 * M�thode appelant la modification du code postal d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, int codePostal
	 */
	public void modifierCodePostalClient(int id, int codePostal) {
		if (c instanceof Particulier) {
			daop.modifierCodePostalClientParId(id, codePostal);
		} else if (c instanceof Entreprise) {
			daoe.modifierCodePostalClientParId(id, codePostal);
		}
	}

	/**
	 * M�thode appelant la modification de la ville d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, String ville
	 */
	public void modifierVilleClient(int id, String ville) {
		if (c instanceof Particulier) {
			daop.modifierVilleClientParId(id, ville);
		} else if (c instanceof Entreprise) {
			daoe.modifierVilleClientParId(id, ville);
		}
	}

	/**
	 * M�thode appelant la modification du num�ro de t�l�phone d'un client dans la
	 * base de donn�es clients.
	 * 
	 * @param int id, String telephone
	 */
	public void modifierTelephoneClient(int id, String telephone) {
		if (c instanceof Particulier) {
			daop.modifierTelephoneClientParId(id, telephone);
		} else if (c instanceof Entreprise) {
			daoe.modifierTelephoneClientParId(id, telephone);
		}

	}
	
	/**
	 * M�thode appelant la modification du num�ro de t�l�phone d'un client dans la
	 * base de donn�es clients.
	 * 
	 * @param int id, String telephone
	 */
	public void modifierNomClient(int id, String nom) {
		if (c instanceof Particulier) {
			daop.modifierNomClientParId(id, nom);
		} else if (c instanceof Entreprise) {
			daoe.modifierNomClientParId(id, nom);
		}

	}

}
