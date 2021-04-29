package vista;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.crud.Insertar;

@WebServlet("/VistaInsertarUsuario")
public class VistaInsertarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Insertar insertar;
	
	public void init() {
		insertar = new Insertar();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String rol = request.getParameter("rol");

		response.sendRedirect("insertar_rol.jsp");
		insertar.guardarRol(Integer.parseInt(id), rol);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String rol = request.getParameter("rol");

		response.sendRedirect("insertar_rol.jsp");
		insertar.guardarRol(Integer.parseInt(id), rol);
	}
}