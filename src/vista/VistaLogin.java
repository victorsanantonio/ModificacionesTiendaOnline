package vista;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import controlador.Login;
import controlador.crud.Consultar;
import modelo.Usuario;

@WebServlet("/VistaLogin")
public class VistaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(VistaLogin.class.getName());
	private Login login;
	private Consultar consultar;

	public void init() {
		login = new Login();
		consultar = new Consultar();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (login.validarCredenciales(username, password)) {
			// HttpSession session = request.getSession();
			// session.setAttribute("username",username);
			// response.sendRedirect("login_exitoso.jsp");

			HttpSession session = request.getSession(true);

			// Obtener el usuario introducido
			Usuario usuario = consultar.obtenerUsuarioSegunEmail(username);

			// Construir el nombre completo
			String nombreCompleto = usuario.getNombre() + " " + usuario.getApellido1() + " " + usuario.getApellido2();
			logger.info("Nombre del usuario: " + nombreCompleto);
			
			int idRolUsuario = usuario.getId_rol(); 
			logger.info("Usuario: "+nombreCompleto+"\nRol: "+idRolUsuario);

			session.setAttribute("nombreCompleto", nombreCompleto);
			session.setAttribute("idRolUsuario", idRolUsuario);
			request.getRequestDispatcher("login_exitoso.jsp").forward(request, response);

		} else {
			HttpSession session = request.getSession();
			// session.setAttribute("user", username);
			response.sendRedirect("login_fallido.jsp");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (login.validarCredenciales(username, password)) {
			// HttpSession session = request.getSession();
			// session.setAttribute("username",username);
			// response.sendRedirect("login_exitoso.jsp");

			HttpSession session = request.getSession(true);

			// Obtener el usuario introducido
			Usuario usuario = consultar.obtenerUsuarioSegunEmail(username);

			// Construir el nombre completo
			String nombreCompleto = usuario.getNombre() + " " + usuario.getApellido1() + " " + usuario.getApellido2();
			logger.info("Nombre del usuario" + nombreCompleto);

			session.setAttribute("nombreCompleto", nombreCompleto);
			request.getRequestDispatcher("login_exitoso.jsp").forward(request, response);

		} else {
			HttpSession session = request.getSession();
			// session.setAttribute("user", username);
			response.sendRedirect("login_fallido.jsp");
		}
	}
}