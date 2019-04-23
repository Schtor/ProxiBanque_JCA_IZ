package persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.entity.Conseiller;
import model.entity.Client;
import model.entity.CB;
import model.entity.CompteCourant;
import model.entity.CompteEpargne;

public class DAOClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			Client c = new Client();
			c.setNom("Stephane");
			Conseiller co = new Conseiller();
			co.setNom("Maxime");
			co.getSetClient().add(c);
			c.setConseiller(co);
			CB cb = new CB();
			cb.setNumeroCarte(178646446L);
			cb.setClient(c);
			c.getSetCB().add(cb);
			CompteCourant cco = new CompteCourant();
			cco.setNumeroCompte(43486348364343L);
			cco.setClient(c);
			c.getSetCompte().add(cco);
			CompteEpargne cce = new CompteEpargne();
			cce.setNumeroCompte(18643848673783L);
			cce.setClient(c);
			c.getSetCompte().add(cce);
			em.persist(co);
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
