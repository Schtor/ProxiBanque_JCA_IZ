package persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.entity.CB;
import model.entity.Client;
import model.entity.Compte;
import model.entity.CompteCourant;
import model.entity.CompteEpargne;
import model.entity.Conseiller;
import model.entity.Entreprise;
import model.entity.Particulier;


/**
 * Cette classe contient la méthode permettant de générer la base de données du scénario pré-rédigé. 
 */
public class DAOScenario {

	/**
	 * Cette méthode instancie tous les objets nécessaires au scénario, associe des valeurs à leurs 
	 * attributs, puis en persistant seulement un conseiller, la base entière est crée grace aux 
	 * cascades annotées dans chaque entité.
	 */
	public void scenario() {
		
		//INSTANCIATIONS EM
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		//INSTANCIATIONS CLIENTS-CONSEILLER
		Conseiller co = new Conseiller("Balleur", "Clement");
		Client c1 = new Particulier("Ziada", "Ihab", "176 bd de charonne", 75020, "Paris", "0635407421", co);
		Client c2 = new Particulier("Goda", "Florian", "2 rue de l'Orangerie", 77450, "Suresnes", "0761253457", co);
		Client c3 = new Particulier("Terradot", "Guillaume", "2 avenue de Paris", 77300, "Vincennes", "0789224583", co);
		Client c4 = new Particulier("Alborghetti", "Lucie", "99 boulevard davout", 78874, "Marseille", "0689471332", co);
		Client c5 = new Particulier("Roman", "Kinan", "15 avenue Morel", 18644, "Clichy", "0615884397", co);
		Client c6 = new Particulier("Barrel", "Melanie", "2 rue maxwell", 41035, "Lyon", "0689464586", co);
		Client c7 = new Particulier("Gillet", "Nicolas", "15 rue boule", 51481, "Lille", "0615846581", co);
		Client c8 = new Entreprise("Total", "Avenue de France", 75013, "Paris", "015848745", 18769431L, co);
		Client c9 = new Entreprise("GDF", "Bd Magenta", 75010, "Paris","0154825654", 158691064L, co);
		Client c10 = new Entreprise("Capgemini", "Boulevard Voltaire", 75011, "Paris", "0158436584", 18461689432L, co);

		
		//INSTANCIATIONS CB-COMPTES
		CB cb1 = new CB(449489149168L, c1);
		Compte cco1 = new CompteCourant(1500, 1616168L, "avril", c1);
		Compte cce1 = new CompteEpargne(150000, 4522042L, "avril", c1);
		
		CB cb2 = new CB(74998184914L, c2);
		Compte cco2 = new CompteCourant(18610, 75343435L, "mai", c2);
		Compte cce2 = new CompteEpargne(1791531, 654328L, "juin", c2);
		
		CB cb3 = new CB(79416186191L, c3);
		Compte cco3 = new CompteCourant(7816, 8322348L, "juillet", c3);
		Compte cce3 = new CompteEpargne(94613,27867458L, "aout", c3);
		
		CB cb4 = new CB(6109610917814L, c4);
		Compte cco4 = new CompteCourant(947614, 653435434L, "septembre", c4);
		Compte cce4 = new CompteEpargne(94631, 5643578L, "octobre", c4);
		
		CB cb5 = new CB(97197841648L, c5);
		Compte cco5 = new CompteCourant(1651, 3545465L, "novembre", c5);
		Compte cce5 = new CompteEpargne(348146,565445654L, "decembre", c5);
		
		CB cb6 = new CB(971918434836641L, c6);
		Compte cco6 = new CompteCourant(38410, 7235834L, "janvier", c6);
		Compte cce6 = new CompteEpargne(351864, 168724524L, "fevrier", c6);
		
		CB cb7 = new CB(8916186848L, c7);
		Compte cco7 = new CompteCourant(161, 7585646L, "mars", c7);
		Compte cce7 = new CompteEpargne(3000, 76752312L, "avril", c7);
		
		CB cb8 = new CB(191614867641L, c8);
		Compte cco8 = new CompteCourant(80500, 98736538L, "mars", c8);
		Compte cce8 = new CompteEpargne(1054, 425697864L, "mars", c8);
		
		CB cb9 = new CB(69194618619L, c9);
		Compte cco9 = new CompteCourant(6811, 97836542L, "septembre", c9);
		Compte cce9 = new CompteEpargne(16140,786954548L, "decembre", c9);
		
		CB cb10 = new CB(971616848646136L, c10);
		Compte cco10 = new CompteCourant(600, 8863453L, "juin", c10);
		Compte cce10 = new CompteEpargne(350, 56434588L, "mai", c10);
		

		
		//SETTERS CLIENTS

		//SETTERS CB-COMPTES-CONSEILLER
		co.getSetClient().add(c1);
		co.getSetClient().add(c2);
		co.getSetClient().add(c3);
		co.getSetClient().add(c4);
		co.getSetClient().add(c5);
		co.getSetClient().add(c6);
		co.getSetClient().add(c7);
		co.getSetClient().add(c8);
		co.getSetClient().add(c9);
		co.getSetClient().add(c10);

		c1.getSetCB().add(cb1);
		c2.getSetCB().add(cb2);
		c3.getSetCB().add(cb3);
		c4.getSetCB().add(cb4);
		c5.getSetCB().add(cb5);
		c6.getSetCB().add(cb6);
		c7.getSetCB().add(cb7);
		c8.getSetCB().add(cb8);
		c9.getSetCB().add(cb9);
		c10.getSetCB().add(cb10);
		
		c1.getSetCompte().add(cco1);
		c1.getSetCompte().add(cce1);
		c2.getSetCompte().add(cco2);
		c2.getSetCompte().add(cce2);
		c3.getSetCompte().add(cco3);
		c3.getSetCompte().add(cce3);
		c4.getSetCompte().add(cco4);
		c4.getSetCompte().add(cce4);
		c5.getSetCompte().add(cco5);
		c5.getSetCompte().add(cce5);
		c6.getSetCompte().add(cco6);
		c6.getSetCompte().add(cce6);
		c7.getSetCompte().add(cco7);
		c7.getSetCompte().add(cce7);
		c8.getSetCompte().add(cco8);
		c8.getSetCompte().add(cce8);
		c9.getSetCompte().add(cco9);
		c9.getSetCompte().add(cce9);
		c10.getSetCompte().add(cco10);
		c10.getSetCompte().add(cce10);

		

		try {
			txn.begin();
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
