package service;

/**
 * Interface VirementService est compos�e des r�gles m�tiers pour les Virements et
 * repr�sente l'interm�diaire entre l'utilisateur et la base de donn�es des
 * comptes. Cette interface comprend les m�thodes permettant de faire
 * des virements d'un client � un autre (compte courant � compte courant). La
 * m�thode relative � l'audit d'une agence est �galement comprise dans cette
 * interface.
 * 
 * @author Jean-Charles & Ihab
 *
 */
public interface VirementService {

	/**
	 * M�thode permettant de r�aliser le virement d'un compte courant d'un client c1
	 * vers le compte courant d'un client c2 d'un montant de montantVirement.
	 * 
	 * @param Client c1, Client c2, double montantVirement
	 */
//	public void virementClientAClient(Client c1, Client c2, double montantVirement);
}
