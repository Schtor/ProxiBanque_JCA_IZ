package service;

import model.entity.Conseiller;
import persistance.DAOConseiller;

/**
 * Classe ServiceImplementationEmploye qui impl�mente l'interface
 * EmployeService. Elle est compos�e des r�gles m�tiers pour l'employe et joue
 * le r�le d'interm�diaire entre l'utilisateur et la base de donn�es des
 * clients/employ�s. Cette classe est �galement compos� des r�gles m�tiers pour
 * r�aliser des virements, ainsi que pour r�aliser un audit
 * sur une agence.
 * 
 * @author Jean-Charles & Ihab
 *
 */
public class ServiceImplementationConseiller implements ConseillerService, VirementService {

	DAOConseiller daoco = new DAOConseiller();
	
	/**
	 * M�thode appelant la demande d'un employ� dans la base de donn�es employ�s.
	 * 
	 * @param int id
	 */
	@Override
	public Conseiller trouverConseiller(int id) {
		Conseiller co = daoco.afficherConseillerParId(id);
		return co;
	}

//	/**
//	 * M�thode permettant de r�aliser le virement d'un compte courant d'un client c1
//	 * � un compte courant d'un client c2. Le virement n'est realis� uniquement si
//	 * le montant du virement est sup�rieur ou �gal � 0, ainsi que si le montant du
//	 * virement est inf�rieur ou �gal au solde du compte potentiellement d�bit�.
//	 * 
//	 * @param Client c, double montantVirement
//	 */
//	public void virementClientAClient(Client c1, Client c2, double montantVirement) {
//		if (montantVirement <= 0) {
//			System.out.println("Montant n�gatif, virement impossible");
//		} else {
//			if (montantVirement > c1.getSetCompte().toArray(new Compte[]).) {
//				System.out.println("Montant du virement sup�rieur au solde du compte courant, virement impossible");
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
//						+ " d'un montant de " + montantVirement + " �");
//				System.out.println("Nouveau solde compte courant du client " + c1.getNom() + " : "
//						+ soldeCompteCourantC1 + " �" + "\n" + "Nouveau solde compte courant du client " + c2.getNom()
//						+ " : " + soldeCompteCourantC2 + " �");
//			}
//		}
//	}

//	/**
//	 * M�thode permettant de r�aliser l'audit d'une agence. La m�thode retourne un
//	 * bool�en qui vaut true si l'audit s'est bien d�roul�, sinon un bool�en false.
//	 * Si un probl�me est survenu pendant l'audit, la m�thode indique de quel(s)
//	 * client(s) provient le probl�me.
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
//			System.out.println("L'agence n�" + agence.getId() + " a pass� l'audit avec succ�s !");
//		}
//
//		return okAudit;
//	}
}
