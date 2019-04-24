package service;

/**
 * Interface VirementService est composée des règles métiers pour les Virements et
 * représente l'intermédiaire entre l'utilisateur et la base de données des
 * comptes. Cette interface comprend les méthodes permettant de faire
 * des virements d'un client à un autre (compte courant à compte courant). La
 * méthode relative à l'audit d'une agence est également comprise dans cette
 * interface.
 * 
 * @author Jean-Charles & Ihab
 *
 */
public interface VirementService {

	/**
	 * Méthode permettant de réaliser le virement d'un compte courant d'un client c1
	 * vers le compte courant d'un client c2 d'un montant de montantVirement.
	 * 
	 * @param Client c1, Client c2, double montantVirement
	 */
//	public void virementClientAClient(Client c1, Client c2, double montantVirement);
}
