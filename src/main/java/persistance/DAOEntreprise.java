package persistance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.entity.Client;
import model.entity.Conseiller;
import model.entity.Entreprise;

/**
 * Cette classe contient les méthodes permettent de créer et sauvegarder des objets Entreprise dans la
 * base de données, et également d'y accéder pour, lire, modifier, supprimer et 
 * récupérer des informations ou des objets. 
 */
public class DAOEntreprise {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	EntityManager em = emf.createEntityManager();
	EntityTransaction txn = em.getTransaction();
	Entreprise p = new Entreprise();
	Conseiller co = new Conseiller();
	List<Entreprise> l = new ArrayList<Entreprise>();
	Set<Entreprise> s = new HashSet<Entreprise>();
	
	/**
	 * Méthode permettant de sauvegarder une Entreprise dans la table
	 * Client. 
	 * 
	 * @param Client c
	 */
	public void sauvegarderClient(Client p) {

		try {
			txn.begin();
			p = new Entreprise();
			em.persist(p);
			txn.commit();

		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();

			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}

	}

	/**
	 * Méthode retournant une Entreprise de la table client à partir de son
	 * id.
	 * 
	 * @param int id
	 */
	
	public Entreprise afficherClientParId(int id) {

		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();

			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
		return p;

	}

	/**
	 * Méthode retournant la liste de toutes les Entreprises dans la table
	 * clients.
	 * 
	 */
	public List<Client> afficherTout() {
		
		List<Client> l = new ArrayList<Client>();
		try {
			txn.begin();
			TypedQuery<Client> tq = em.createQuery("FROM Particulier", Client.class);
			l = tq.getResultList();
			txn.commit();

		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();

			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
		return l;
	}

	/**
	 * Méthode permettant de modifier l'adresse d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param int id, String adresse
	 */
	public void modifierAdresseClientParId(int id, String adresse) {
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setAdresse(adresse);
			txn.commit();

		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();

			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
	}

	/**
	 * Méthode permettant de modifier le code postal d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param int id, int codePostal
	 */
	public void modifierCodePostalClientParId(int id, int codePostal) {
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setCodePostal(codePostal);
			txn.commit();

		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();

			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
	}

	/**
	 * Méthode permettant de modifier la ville d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param int id, String ville
	 */
	
	public void modifierVilleClientParId(int id, String ville) {
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setVille(ville);
			txn.commit();

		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();

			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
	}

	/**
	 * Méthode permettant de modifier le téléphone d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param int id, String telephone
	 */
	
	public void modifierTelephoneClientParId(int id, String telephone) {
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setTelephone(telephone);
			txn.commit();

		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();

			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
	}
	
	/**
	 * Méthode permettant de modifier le prénom d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param int id, String telephone
	 */
	
	public void modifierSiretClientParId(int id, Long siret) {
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setNumeroSIRET(siret);
			txn.commit();

		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();

			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
	}

	/**
	 * Méthode permettant de modifier le nom d'une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param int id, String telephone
	 */
	
	public void modifierNomClientParId(int id, String nom) {
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			p.setNom(nom);
			txn.commit();

		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();

			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
	}
	/**
	 * Méthode permettant de supprimer une Entreprise dans la table
	 * clients à partir de son id.
	 * 
	 * @param int id
	 */
	
	public void supprimerClientParId(int id) {
		try {
			txn.begin();
			p = em.find(Entreprise.class, id);
			em.remove(p);
			txn.commit();

		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();

			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
	}
}
