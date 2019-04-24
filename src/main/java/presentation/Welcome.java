package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ServiceImplementationClient;

/**
 * Cette Servlet permet d'appeler la méthode de lancement du scénario.
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServiceImplementationClient sic = new ServiceImplementationClient();

	public Welcome() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher;
		sic.lancerScenario();
		dispatcher = request.getRequestDispatcher("/WEB-INF/Login.html");
		dispatcher.forward(request, response);
	}

}
