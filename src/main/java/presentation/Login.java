package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Cette Servlet permet de vérifier la validité des identifiants du conseiller.
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");

		RequestDispatcher dispatcher;

		if (("admin".equalsIgnoreCase(login)) && ("password".equalsIgnoreCase(password))) {

			dispatcher = request.getRequestDispatcher("/WEB-INF/Portal.jsp");
		} else {
			dispatcher = request.getRequestDispatcher("/WEB-INF/LoginError.html");

		}
		dispatcher.forward(request, response);
	}
}
