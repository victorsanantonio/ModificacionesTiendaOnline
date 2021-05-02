package vista;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import controlador.crud.Consultar;
import modelo.Categoria;
import modelo.Rol;

@WebServlet("/VistaListarCategorias")
public class VistaListarCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(VistaListarCategoria.class.getName());
	private Consultar consultar;

	public void init() {
		consultar = new Consultar();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);

		List<Categoria> categorias = consultar.listarCategorias();

		logger.info("CATEGORÍAS RECUPERADAS---->"+categorias.get(0));

		session.setAttribute("categorias", categorias);
		request.getRequestDispatcher("listado_categorias.jsp").forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);

		List<Categoria> categorias = consultar.listarCategorias();

		logger.info("CATEGORÍAS RECUPERADAS---->"+categorias.get(0));

		session.setAttribute("categorias", categorias);
		request.getRequestDispatcher("listado_categorias.jsp").forward(request, response);
	}
}