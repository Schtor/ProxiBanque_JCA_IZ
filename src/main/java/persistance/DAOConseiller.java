package persistance;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.entity.Conseiller;

/**
 * Cette classe contient les m�thodes permettent de cr�er et sauvegarder des objets Conseiller dans la
 * base de donn�es, et �galement d'y acc�der pour, lire, modifier, supprimer et 
 * r�cup�rer des informations ou des objets. 
 */
public class DAOConseiller {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	EntityManager em = emf.createEntityManager();
	EntityTransaction txn = em.getTransaction();
	Conseiller p = new Conseiller();
	List<Conseiller> l = new ArrayList<Conseiller>();

	
	/**
	 * M�thode permettant de sauvegarder un Conseiller dans la base de donn�es
	 * clients. 
	 * 
	 * @param Conseiller 
	 */
	public void sauvegarderConseiller(Conseiller p) {

		try {
			txn.begin();
			p = new Conseiller();
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
	 * M�thode retournant un Conseiller de la base de donn�es � partir de son
	 * id.
	 * 
	 * @param int id
	 */
	
	public Conseiller afficherConseillerParId(int id) {

		try {
			txn.begin();
			p = em.find(Conseiller.class, id);
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
	 * M�thode retournant la liste de tous les Conseiller dans la table
	 * Conseiller.
	 * 
	 */
	public List<Conseiller> afficherTout() {

		try {
			txn.begin();
			int i;
			for (i=0; i<100; i++) {
				if (em.find(Conseiller.class, i)!= null) {
				Conseiller p = em.find(Conseiller.class, i);
				l.add(p);
				}
			}
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
	 * M�thode permettant de supprimer un client dans la base de donn�es clients �
	 * partir de son id.
	 * 
	 * @param int id
	 */
	
	public void supprimerConseillerParId(int id) {
		try {
			txn.begin();
			p = em.find(Conseiller.class, id);
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
