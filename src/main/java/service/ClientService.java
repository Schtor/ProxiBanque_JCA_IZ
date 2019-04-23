package service;

import java.util.List;

import model.entity.CB;
import model.entity.Client;
import model.entity.CompteCourant;
import model.entity.CompteEpargne;

/**
 * Interface ClientService est compos�e des r�gles m�tiers pour le client et
 * joue le r�le d'interm�diaire entre l'utilisateur et la base de donn�es des
 * clients.
 * 
 * @author Jean-Charles & Ihab
 *
 */
public interface ClientService {

	/**
	 * M�thode appelant la sauvegarde d'un client dans la base de donn�es clients.
	 * 
	 * @param Client c
	 */
	public void ajouterClient(Client c);

	/**
	 * M�thode appelant la demande d'un client dans la base de donn�es clients.
	 * 
	 * @param int id
	 */
	public Client trouverClientValide(int id);

	/**
	 * M�thode appelant la demande de tous les client dans la base de donn�es
	 * clients.
	 * 
	 */
	public List<Client> trouverToutClient();

	/**
	 * M�thode appelant la modification de l'adresse d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, String adresse
	 */
	public void modifierAdresseClient(int id, String adresse);

	/**
	 * M�thode appelant la modification du code postal d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, int codePostal
	 */
	public void modifierCodePostalClient(int id, int codePostal);

	/**
	 * M�thode appelant la modification de la ville d'un client dans la base de
	 * donn�es clients.
	 * 
	 * @param int id, String ville
	 */
	public void modifierVilleClient(int id, String ville);

	/**
	 * M�thode appelant la modification du num�ro de t�l�phone d'un client dans la
	 * base de donn�es clients.
	 * 
	 * @param int id, String telephone
	 */
	public void modifierTelephoneClient(int id, String telephone);

	/**
	 * M�thode permettant d'associer un compte epargne � un client.
	 * 
	 * @param CompteEpargne compteEpargne, Client c
	 */
	public void ajouterCompteEpargne(CompteEpargne compteEpargne, Client c);

	/**
	 * M�thode permettant d'associer un compte courant � un client.
	 * 
	 * @param CompteCourant compteCourant, Client c
	 */
	public void ajouterCompteCourant(CompteCourant compteCourant, Client c);

	/**
	 * M�thode permettant d'associer une carte bancaire � un client.
	 * 
	 * @param CB cb, Client c
	 */
	public void ajouterCarteBancaire(CB cb, Client c);
}
