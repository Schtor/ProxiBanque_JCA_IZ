package service;

import java.util.List;

import model.entity.Client;

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
	public Client trouverClient(int id);

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
	 * M�thode appelant la modification du nom d'un client dans la
	 * base de donn�es clients.
	 * 
	 * @param int id, String telephone
	 */
	public void modifierNomClient(int id, String nom);


}