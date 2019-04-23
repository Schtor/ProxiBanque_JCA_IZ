package service;

import model.Agence;
import model.entity.Client;
import model.entity.Employe;

/**
 * Interface EmployeService est compos�e des r�gles m�tiers pour l'employ� et
 * repr�sente l'interm�diaire entre l'utilisateur et la base de donn�es des
 * clients/employ�s. Cette interface comprend les m�thodes permettant de faire
 * des virements d'un compte courant � �pargne et inversement ainsi que les
 * virements d'un client � un autre (compte courant � compte courant). La
 * m�thode relative � l'audit d'une agence est �galement comprise dans cette
 * interface.
 * 
 * @author Jean-Charles & Ihab
 *
 */
public interface EmployeService {

	/**
	 * M�thode appelant la sauvegarde d'un employ� dans la base de donn�es employ�s.
	 * 
	 * @param Employe e
	 */
	public void ajouterEmploye(Employe e);

	/**
	 * M�thode permettant de r�aliser l'audit d'une agence
	 * 
	 * @param Agence agence
	 */
	public boolean audit(Agence agence);
}
