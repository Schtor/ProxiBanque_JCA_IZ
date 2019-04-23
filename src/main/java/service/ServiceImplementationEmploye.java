package service;

import model.Agence;
import model.entity.Client;
import model.entity.Conseiller;
import model.entity.Employe;
import model.entity.Entreprise;
import model.entity.Particulier;
import persistance.DAOEmploye;

/**
 * Classe ServiceImplementationEmploye qui impl�mente l'interface
 * EmployeService. Elle est compos�e des r�gles m�tiers pour l'employe et joue
 * le r�le d'interm�diaire entre l'utilisateur et la base de donn�es des
 * clients/employ�s. Cette classe est �galement compos� des r�gles m�tiers pour
 * r�aliser des virements de compte � compte ainsi que pour r�aliser un audit
 * sur une agence.
 * 
 * @author Jean-Charles & Ihab
 *
 */
public class ServiceImplementationEmploye implements EmployeService, VirementService {

	/**
	 * M�thode appelant la sauvegarde d'un employ� dans la base de donn�es employ�s.
	 * 
	 * @param Employe e
	 */
	@Override
	public void ajouterEmploye(Employe e) {
		if (e != null) {
			DAOEmploye.sauvegarderEmploye(e);
		}
	}

	/**
	 * M�thode appelant la demande d'un employ� dans la base de donn�es employ�s.
	 * 
	 * @param int id
	 */
	@Override
	public Employe trouverEmploye(int id) {
		return DAOEmploye.afficherEmployeParId(id);
	}

	/**
	 * M�thode permettant d'associer un client � un conseiller. Le client n'est pas
	 * associ� au conseiller si le conseiller poss�de d�j� 10 clients.
	 * 
	 * @param Client client, Conseiller conseiller
	 */
	public void associerClientAConseiller(Client client, Conseiller conseiller) {
		if (conseiller.getListeClient().size() < 10) {
			conseiller.getListeClient().add(client);
		}
		if (conseiller.getListeClient().size() == 10) {
			System.out.println("Ce conseiller a d�j� 10 clients !");
		}
	}

	/**
	 * M�thode permettant de r�aliser le virement d'un client c d'un montant de
	 * montantVirement depuis le compte courant jusqu'au compte �pargne. Le virement
	 * n'est realis� uniquement si le montant du virement est sup�rieur ou �gal � 0,
	 * ainsi que si le montant du virement est inf�rieur ou �gal au solde du compte
	 * potentiellement d�bit�.
	 * 
	 * @param Client c, double montantVirement
	 */
	public void virementCourantAEpargne(Client c, double montantVirement) {
		if (c.getCompteEpargne() != null) {
			if (montantVirement <= 0) {
				System.out.println("Montant n�gatif, virement impossible");
			} else {
				if (montantVirement > c.getCompteCourant().getSolde()) {
					System.out.println("Montant du virement sup�rieur au solde du compte courant, virement impossible");
				} else {
					double soldeCompteCourant = c.getCompteCourant().getSolde();
					soldeCompteCourant -= montantVirement;
					c.getCompteCourant().setSolde(soldeCompteCourant);

					double soldeCompteEpargne = c.getCompteEpargne().getSolde();
					soldeCompteEpargne += montantVirement;
					c.getCompteEpargne().setSolde(soldeCompteEpargne);
					System.out.println("Virement du client " + c.getNom()
							+ " du compte courant � son compte �pargne d'un montant de " + montantVirement + " �");
					System.out.println("Nouveau solde compte courant : " + soldeCompteCourant + " �" + "\n"
							+ "Nouveau solde compte �pargne : " + soldeCompteEpargne + " �");
				}
			}

		} else {
			System.out.println("Vous n'avez pas de compte �pargne, impossible de faire un virement compte � compte !");
		}
	}

	/**
	 * M�thode permettant de r�aliser le virement d'un client c d'un montant de
	 * montantVirement depuis le compte �pargne jusqu'au compte courant. Le virement
	 * n'est realis� uniquement si le montant du virement est sup�rieur ou �gal � 0,
	 * ainsi que si le montant du virement est inf�rieur ou �gal au solde du compte
	 * potentiellement d�bit�.
	 * 
	 * @param Client c, double montantVirement
	 */
	public void virementEpargneACourant(Client c, double montantVirement) {
		if (c.getCompteEpargne() != null) {
			if (montantVirement <= 0) {
				System.out.println("Montant n�gatif, virement impossible");
			} else {
				if (montantVirement > c.getCompteEpargne().getSolde()) {
					System.out.println("Montant du virement sup�rieur au solde du compte �pargne, virement impossible");
				} else {
					double soldeCompteEpargne = c.getCompteEpargne().getSolde();
					soldeCompteEpargne -= montantVirement;
					c.getCompteEpargne().setSolde(soldeCompteEpargne);

					double soldeCompteCourant = c.getCompteCourant().getSolde();
					soldeCompteCourant += montantVirement;
					c.getCompteCourant().setSolde(soldeCompteCourant);

					System.out.println("Virement du client " + c.getNom()
							+ " du compte �pargne � son compte courant d'un montant de " + montantVirement + " �");
					System.out.println("Nouveau solde compte courant : " + soldeCompteCourant + " �" + "\n"
							+ "Nouveau solde compte �pargne : " + soldeCompteEpargne + " �");
				}
			}

		} else {
			System.out.println("Vous n'avez pas de compte �pargne, impossible de faire un virement compte � compte !");
		}
	}

	/**
	 * M�thode permettant de r�aliser le virement d'un compte courant d'un client c1
	 * � un compte courant d'un client c2. Le virement n'est realis� uniquement si
	 * le montant du virement est sup�rieur ou �gal � 0, ainsi que si le montant du
	 * virement est inf�rieur ou �gal au solde du compte potentiellement d�bit�.
	 * 
	 * @param Client c, double montantVirement
	 */
	public void virementClientAClient(Client c1, Client c2, double montantVirement) {
		if (montantVirement <= 0) {
			System.out.println("Montant n�gatif, virement impossible");
		} else {
			if (montantVirement > c1.getCompteCourant().getSolde()) {
				System.out.println("Montant du virement sup�rieur au solde du compte courant, virement impossible");
			} else {
				double soldeCompteCourantC1 = c1.getCompteCourant().getSolde();
				double soldeCompteCourantC2 = c2.getCompteCourant().getSolde();

				soldeCompteCourantC1 -= montantVirement;
				c1.getCompteCourant().setSolde(soldeCompteCourantC1);

				soldeCompteCourantC2 += montantVirement;
				c2.getCompteCourant().setSolde(soldeCompteCourantC2);

				System.out.println("Virement du client " + c1.getNom() + " au client " + c2.getNom()
						+ " d'un montant de " + montantVirement + " �");
				System.out.println("Nouveau solde compte courant du client " + c1.getNom() + " : "
						+ soldeCompteCourantC1 + " �" + "\n" + "Nouveau solde compte courant du client " + c2.getNom()
						+ " : " + soldeCompteCourantC2 + " �");
			}
		}
	}

	/**
	 * M�thode permettant de r�aliser l'audit d'une agence. La m�thode retourne un
	 * bool�en qui vaut true si l'audit s'est bien d�roul�, sinon un bool�en false.
	 * Si un probl�me est survenu pendant l'audit, la m�thode indique de quel(s)
	 * client(s) provient le probl�me.
	 * 
	 * @param Agence agence
	 */
	public boolean audit(Agence agence) {
		boolean okAudit = true;
		for (Conseiller conseiller : agence.getListeConseiller()) {
			for (Client client : conseiller.getListeClient()) {
				if (client instanceof Particulier) {
					if (client.getCompteEpargne() != null) {
						if (client.getCompteCourant().getSolde() + client.getCompteEpargne().getSolde() < -5000) {
							okAudit = false;
							System.out.println("Probleme avec le client particulier " + client.getNom()
									+ ", veuillez le contacter au " + client.getTelephone());
						}
					} else {
						if (client.getCompteCourant().getSolde() < -5000) {
							okAudit = false;
							System.out.println("Probleme avec le client particulier " + client.getNom()
									+ ", veuillez le contacter au " + client.getTelephone());
						}
					}
				}
				if (client instanceof Entreprise) {
					if (client.getCompteEpargne() != null) {
						if (client.getCompteCourant().getSolde() + client.getCompteEpargne().getSolde() < -50000) {
							okAudit = false;
							System.out.println("Probleme avec le client entreprise " + client.getNom()
									+ ", veuillez le contacter au " + client.getTelephone());

						}
					} else {
						if (client.getCompteCourant().getSolde() < -50000) {
							okAudit = false;
							System.out.println("Probleme avec le client entreprise " + client.getNom()
									+ ", veuillez le contacter au " + client.getTelephone());
						}
					}

				}
			}
		}

		if (okAudit) {
			System.out.println("L'agence n�" + agence.getId() + " a pass� l'audit avec succ�s !");
		}

		return okAudit;
	}
}
