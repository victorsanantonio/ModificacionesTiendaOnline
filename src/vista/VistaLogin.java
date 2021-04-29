package vista;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controlador.Login;

@WebServlet("/VistaLogin")
public class VistaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Login login;

	public void init() {
		login = new Login();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (login.validarCredenciales(username, password)) {
			// HttpSession session = request.getSession();
			// session.setAttribute("username",username);
			//response.sendRedirect("login_exitoso.jsp");
			responseE(response, username);
		} else {
			// HttpSession session = request.getSession();
			// session.setAttribute("user", username);
			//response.sendRedirect("login_fallido.jsp");
			responseF(response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (login.validarCredenciales(username, password)) {
			// HttpSession session = request.getSession();
			// session.setAttribute("username",username);
			//response.sendRedirect("login_exitoso.jsp");
			responseE(response, username);
		} else {
			HttpSession session = request.getSession();
			// session.setAttribute("user", username);
			//response.sendRedirect("login.jsp");
			responseF(response);
		}
	}

	private void responseE(HttpServletResponse resp, String username) throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Bienvenido, "+ username + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	
	private void responseF(HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>El usuario o contraseña no son correctos</h1>");
		out.println("<p>No se ha podido acceder a la aplicación</p>");
		out.println("</body>");
		out.println("</html>");
	}
}