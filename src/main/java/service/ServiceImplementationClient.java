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
 * Classe ServiceImplementationClient qui implémente l'interface ClientService.
 * Elle est composée des règles métiers pour le client et joue le rôle
 * d'intermédiaire entre l'utilisateur et la base de données des clients.
 * 
 * @author Jean-Charles & Ihab
 *
 */
public class ServiceImplementationClient implements ClientService {

	/**
	 * Méthode appelant la sauvegarde d'un client dans la base de données clients.
	 * Les numéros de compte (courant, épargne) et le numéro de carte bancaire sont
	 * générés à condition que le client possède ces comptes et une carte bancaire.
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
	 * Méthode appelant la demande d'un client dans la base de données clients.
	 * 
	 * @param int id
	 */
	public Client trouverClientValide(int id) {
		return DAOClient.afficherClientParId(id);
	}

	/**
	 * Méthode appelant la demande de tous les client dans la base de données
	 * clients.
	 * 
	 */
	public List<Client> trouverToutClient() {
		return DAOClient.afficherTout();
	}

	/**
	 * Méthode appelant la modification de l'adresse d'un client dans la base de
	 * données clients.
	 * 
	 * @param int id, String adresse
	 */
	public void modifierAdresseClient(int id, String adresse) {
		DAOClient.modifierAdresseClientParId(id, adresse);
	}

	/**
	 * Méthode appelant la modification du code postal d'un client dans la base de
	 * données clients.
	 * 
	 * @param int id, int codePostal
	 */
	public void modifierCodePostalClient(int id, int codePostal) {
		DAOClient.modifierCodePostalClientParId(id, codePostal);
	}

	/**
	 * Méthode appelant la modification de la ville d'un client dans la base de
	 * données clients.
	 * 
	 * @param int id, String ville
	 */
	public void modifierVilleClient(int id, String ville) {
		DAOClient.modifierVilleClientParId(id, ville);
	}

	/**
	 * Méthode appelant la modification du numéro de téléphone d'un client dans la
	 * base de données clients.
	 * 
	 * @param int id, String telephone
	 */
	public void modifierTelephoneClient(int id, String telephone) {
		DAOClient.modifierTelephoneClientParId(id, telephone);
	}

	/**
	 * Méthode générant un numéro de compte à 11 chiffres.
	 * 
	 */
	private long genereNumeroCompte() {
		return (long) ((1 + Math.random()) * 10000000000L);
	}

	/**
	 * Méthode générant un numéro de carte à 16 chiffres.
	 * 
	 */
	private long genereNumeroCarte() {
		return (long) ((1 + Math.random()) * 1000000000000000L);
	}

}
