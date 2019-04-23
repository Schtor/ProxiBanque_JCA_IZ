package service;

import java.util.List;


import model.entity.CB;
import model.entity.Client;
import model.entity.CompteCourant;
import model.entity.CompteEpargne;
import persistance.ClientDAO;
import persistance.ClientMemoireDAO;

import model.entity.Client;
import persistance.DAOClient;


/**
 * Classe ServiceImplementationClient qui impl�mente l'interface ClientService.
 * Elle est compos�e des r�gles m�tiers pour le client et joue le r�le
 * d'interm�diaire entre l'utilisateur et la base de donn�es des clients.
 * 
 * @author Jean-Charles & Ihab
 *
 */
public class ServiceImplementationClient implements ClientService {

	/**
	 * M�thode appelant la sauvegarde d'un client dans la base de donn�es clients.
	 * Les num�ros de compte (courant, �pargne) et le num�ro de carte bancaire sont
	 * g�n�r�s � condition que le client poss�de ces comptes et une carte bancaire.
	 * 
	 * @param Client c
	 */
	public void ajouterClient(Client c) {
		if (c != null) {
			// Sauvegarde le client dans DAO
			DAOClient.sauvegarderClient(c);
			// Genere le numero de compte courant du client
			if (c.getCompteCourant() != null) {
				c.getCompteCourant().setNumeroCompte(genereNumeroCompte());
			}

			// Genere le numero de compte epargne du client
			if (c.getCompteEpargne() != null) {
				c.getCompteEpargne().setNumeroCompte(genereNumeroCompte());
			}

			// Genere numero de carte du client
			if (c.getCarteBancaire() != null) {
				c.getCarteBancaire().setNumeroCarte(genereNumeroCarte());
			}
		}
	}

	/**
	 * M�thode appelant la demande d'un client dans la base de donn�es clients.
	 * 
	 * @param int id
	 */
	public Client trouverClientValide(int id) {
		return DAOClient.afficherClientParId(id);
	}

	/**
	 * M�thode appelant la demande de tous les client dans la base de donn�es
	 * clients.
	 * 
	 */
	public List<Client> trouverToutClient() {
		return DAOClient.afficherTout();
	}

	/**
	 * M�thode appelant la modification de l'adresse d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, String adresse
	 */
	public void modifierAdresseClient(int id, String adresse) {
		DAOClient.modifierAdresseClientParId(id, adresse);
	}

	/**
	 * M�thode appelant la modification du code postal d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, int codePostal
	 */
	public void modifierCodePostalClient(int id, int codePostal) {
		DAOClient.modifierCodePostalClientParId(id, codePostal);
	}

	/**
	 * M�thode appelant la modification de la ville d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, String ville
	 */
	public void modifierVilleClient(int id, String ville) {
		DAOClient.modifierVilleClientParId(id, ville);
	}

	/**
	 * M�thode appelant la modification du num�ro de t�l�phone d'un client dans la
	 * base de donn�es clients.
	 * 
	 * @param int id, String telephone
	 */
	public void modifierTelephoneClient(int id, String telephone) {
		DAOClient.modifierTelephoneClientParId(id, telephone);
	}

	/**
	 * M�thode g�n�rant un num�ro de compte � 11 chiffres.
	 * 
	 */
	private long genereNumeroCompte() {
		return (long) ((1 + Math.random()) * 10000000000L);
	}

	/**
	 * M�thode g�n�rant un num�ro de carte � 16 chiffres.
	 * 
	 */
	private long genereNumeroCarte() {
		return (long) ((1 + Math.random()) * 1000000000000000L);
	}

}
