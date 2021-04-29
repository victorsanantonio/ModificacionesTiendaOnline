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
		String id_rol = request.getParameter("id_rol");
		String email = request.getParameter("email");
		String clave = request.getParameter("clave");
		String nombre = request.getParameter("nombre");
		String apellido1 = request.getParameter("apellido1");
		String apellido2 = request.getParameter("apellido2");
		String direccion = request.getParameter("direccion");
		String localidad = request.getParameter("localidad");
		String provincia = request.getParameter("provincia");
		String telefono = request.getParameter("telefono");
		String dni = request.getParameter("dni");

		response.sendRedirect("insertar_usuario.jsp");
		insertar.guardarUsuario(Integer.parseInt(id), Integer.parseInt(id_rol), email, clave, nombre, apellido1,
				apellido2, direccion, localidad, provincia, telefono, dni);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String id_rol = request.getParameter("id_rol");
		String email = request.getParameter("email");
		String clave = request.getParameter("clave");
		String nombre = request.getParameter("nombre");
		String apellido1 = request.getParameter("apellido1");
		String apellido2 = request.getParameter("apellido2");
		String direccion = request.getParameter("direccion");
		String localidad = request.getParameter("localidad");
		String provincia = request.getParameter("provincia");
		String telefono = request.getParameter("telefono");
		String dni = request.getParameter("dni");

		response.sendRedirect("insertar_usuario.jsp");
		insertar.guardarUsuario(Integer.parseInt(id), Integer.parseInt(id_rol), email, clave, nombre, apellido1,
				apellido2, direccion, localidad, provincia, telefono, dni);
	}
}