package service;

import model.Agence;
import model.entity.Client;
import model.entity.Employe;

/**
 * Interface EmployeService est composée des règles métiers pour l'employé et
 * représente l'intermédiaire entre l'utilisateur et la base de données des
 * clients/employés. Cette interface comprend les méthodes permettant de faire
 * des virements d'un compte courant à épargne et inversement ainsi que les
 * virements d'un client à un autre (compte courant à compte courant). La
 * méthode relative à l'audit d'une agence est également comprise dans cette
 * interface.
 * 
 * @author Jean-Charles & Ihab
 *
 */
public interface EmployeService {

	/**
	 * Méthode appelant la sauvegarde d'un employé dans la base de données employés.
	 * 
	 * @param Employe e
	 */
	public void ajouterEmploye(Employe e);

	/**
	 * Méthode permettant de réaliser l'audit d'une agence
	 * 
	 * @param Agence agence
	 */
	public boolean audit(Agence agence);
}
