package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistance.DAOEntreprise;
import persistance.DAOParticulier;
import service.ServiceImplementationClient;

/**
 * Cette Servlet permet d'éditer les attributs d'un Particulier.
 */
@WebServlet("/ClientParticulierInterface")
public class ClientParticulierInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DAOEntreprise daoe = new DAOEntreprise();
	DAOParticulier daop = new DAOParticulier();
	ServiceImplementationClient sic = new ServiceImplementationClient();

	public ClientParticulierInterface() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher;

		try {

			int id = Integer.parseInt(request.getParameter("Id"));

			if (request.getParameter("Nom") != null) {
				String name = request.getParameter("Nom");
				sic.modifierNomClient(id, name);
			}
			if (request.getParameter("Prénom") != null) {
				String prenom = request.getParameter("Prénom");
				sic.modifierPrenomClientParId(id, prenom);
			}
			if (request.getParameter("Adresse") != null) {
				String adresse = request.getParameter("Adresse");
				sic.modifierAdresseClient(id, adresse);
			}
			if (request.getParameter("Téléphone") != null) {
				String telephone = request.getParameter("Téléphone");
				sic.modifierTelephoneClient(id, telephone);
			}
			if (request.getParameter("Ville") != null) {
				String ville = request.getParameter("Ville");
				sic.modifierVilleClient(id, ville);
			}
			if (request.getParameter("SIRET") != null) {
				Long siret = Long.parseLong(request.getParameter("SIRET"));
				sic.modifierSiretClientParId(id, siret);
			}

			dispatcher = request.getRequestDispatcher("/WEB-INF/ConfirmationModification.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			dispatcher = request.getRequestDispatcher("/WEB-INF/ClientEntrepriseError.html");
			dispatcher.forward(request, response);
		}
	}

}
