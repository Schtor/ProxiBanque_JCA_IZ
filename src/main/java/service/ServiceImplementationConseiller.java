package service;

import model.entity.Conseiller;
import persistance.DAOConseiller;

/**
 * Classe ServiceImplementationEmploye qui implémente l'interface
 * EmployeService. Elle est composée des règles métiers pour l'employe et joue
 * le rôle d'intermédiaire entre l'utilisateur et la base de données des
 * clients/employés. Cette classe est également composé des règles métiers pour
 * réaliser des virements, ainsi que pour réaliser un audit
 * sur une agence.
 * 
 * @author Jean-Charles & Ihab
 *
 */
public class ServiceImplementationConseiller implements ConseillerService, VirementService {

	DAOConseiller daoco = new DAOConseiller();
	
	/**
	 * Méthode appelant la demande d'un employé dans la base de données employés.
	 * 
	 * @param int id
	 */
	@Override
	public Conseiller trouverConseiller(int id) {
		Conseiller co = daoco.afficherConseillerParId(id);
		return co;
	}

//	/**
//	 * Méthode permettant de réaliser le virement d'un compte courant d'un client c1
//	 * à un compte courant d'un client c2. Le virement n'est realisé uniquement si
//	 * le montant du virement est supérieur ou égal à 0, ainsi que si le montant du
//	 * virement est inférieur ou égal au solde du compte potentiellement débité.
//	 * 
//	 * @param Client c, double montantVirement
//	 */
//	public void virementClientAClient(Client c1, Client c2, double montantVirement) {
//		if (montantVirement <= 0) {
//			System.out.println("Montant négatif, virement impossible");
//		} else {
//			if (montantVirement > c1.getSetCompte().toArray(new Compte[]).) {
//				System.out.println("Montant du virement supérieur au solde du compte courant, virement impossible");
//			} else {
//				double soldeCompteCourantC1 = c1.getCompteCourant().getSolde();
//				double soldeCompteCourantC2 = c2.getCompteCourant().getSolde();
//
//				soldeCompteCourantC1 -= montantVirement;
//				c1.getCompteCourant().setSolde(soldeCompteCourantC1);
//
//				soldeCompteCourantC2 += montantVirement;
//				c2.getCompteCourant().setSolde(soldeCompteCourantC2);
//
//				System.out.println("Virement du client " + c1.getNom() + " au client " + c2.getNom()
//						+ " d'un montant de " + montantVirement + " €");
//				System.out.println("Nouveau solde compte courant du client " + c1.getNom() + " : "
//						+ soldeCompteCourantC1 + " €" + "\n" + "Nouveau solde compte courant du client " + c2.getNom()
//						+ " : " + soldeCompteCourantC2 + " €");
//			}
//		}
//	}

//	/**
//	 * Méthode permettant de réaliser l'audit d'une agence. La méthode retourne un
//	 * booléen qui vaut true si l'audit s'est bien déroulé, sinon un booléen false.
//	 * Si un problème est survenu pendant l'audit, la méthode indique de quel(s)
//	 * client(s) provient le problème.
//	 * 
//	 * @param Agence agence
//	 */
//	public boolean audit(Agence agence) {
//		boolean okAudit = true;
//		for (Conseiller conseiller : agence.getListeConseiller()) {
//			for (Client client : conseiller.getListeClient()) {
//				if (client instanceof Particulier) {
//					if (client.getCompteEpargne() != null) {
//						if (client.getCompteCourant().getSolde() + client.getCompteEpargne().getSolde() < -5000) {
//							okAudit = false;
//							System.out.println("Probleme avec le client particulier " + client.getNom()
//									+ ", veuillez le contacter au " + client.getTelephone());
//						}
//					} else {
//						if (client.getCompteCourant().getSolde() < -5000) {
//							okAudit = false;
//							System.out.println("Probleme avec le client particulier " + client.getNom()
//									+ ", veuillez le contacter au " + client.getTelephone());
//						}
//					}
//				}
//				if (client instanceof Entreprise) {
//					if (client.getCompteEpargne() != null) {
//						if (client.getCompteCourant().getSolde() + client.getCompteEpargne().getSolde() < -50000) {
//							okAudit = false;
//							System.out.println("Probleme avec le client entreprise " + client.getNom()
//									+ ", veuillez le contacter au " + client.getTelephone());
//
//						}
//					} else {
//						if (client.getCompteCourant().getSolde() < -50000) {
//							okAudit = false;
//							System.out.println("Probleme avec le client entreprise " + client.getNom()
//									+ ", veuillez le contacter au " + client.getTelephone());
//						}
//					}
//
//				}
//			}
//		}
//
//		if (okAudit) {
//			System.out.println("L'agence n°" + agence.getId() + " a passé l'audit avec succès !");
//		}
//
//		return okAudit;
//	}
}
