package service;

import model.entity.Client;

public interface VirementService {

	/**
	 * M�thode permettant de r�aliser le virement d'un client c d'un montant de
	 * montantVirement depuis le compte courant jusqu'au compte �pargne.
	 * 
	 * @param Client c, double montantVirement
	 */
	public void virementCourantAEpargne(Client c, double montantVirement);

	/**
	 * M�thode permettant de r�aliser le virement d'un client c d'un montant de
	 * montantVirement depuis le compte �pargne jusqu'au compte courant.
	 * 
	 * @param Client c, double montantVirement
	 */
	public void virementEpargneACourant(Client c, double montantVirement);

	/**
	 * M�thode permettant de r�aliser le virement d'un compte courant d'un client c1
	 * vers le compte courant d'un client c2 d'un montant de montantVirement.
	 * 
	 * @param Client c1, Client c2, double montantVirement
	 */
	public void virementClientAClient(Client c1, Client c2, double montantVirement);
}
