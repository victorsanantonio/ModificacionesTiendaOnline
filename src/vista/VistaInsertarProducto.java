package vista;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.crud.Insertar;

@WebServlet("/VistaInsertarProducto")
public class VistaInsertarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Insertar insertar;

	public void init() {
		insertar = new Insertar();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String id = request.getParameter("id");
			String id_categoria = request.getParameter("id_categoria");
			String nombre = request.getParameter("nombre");
			String descripcion = request.getParameter("descripcion");
			String precio = request.getParameter("precio");
			String stock = request.getParameter("stock");
			String fecha_altaCadena = request.getParameter("fecha_alta");
			String fecha_bajaCadena = request.getParameter("fecha_baja");
			String impuesto = request.getParameter("impuesto");

			Date fecha_alta = new SimpleDateFormat("dd/MM/yyyy").parse(fecha_altaCadena);
			Date fecha_baja = new SimpleDateFormat("dd/MM/yyyy").parse(fecha_bajaCadena);

			response.sendRedirect("insertar_producto.jsp");
			insertar.guardarProducto(Integer.parseInt(id), Integer.parseInt(id_categoria), nombre, descripcion,
					Double.parseDouble(precio), Integer.parseInt(stock), fecha_alta, fecha_baja,
					Float.parseFloat(impuesto));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String id = request.getParameter("id");
			String id_categoria = request.getParameter("id_categoria");
			String nombre = request.getParameter("nombre");
			String descripcion = request.getParameter("descripcion");
			String precio = request.getParameter("precio");
			String stock = request.getParameter("stock");
			String fecha_altaCadena = request.getParameter("fecha_alta");
			String fecha_bajaCadena = request.getParameter("fecha_baja");
			String impuesto = request.getParameter("impuesto");

			Date fecha_alta = new SimpleDateFormat("dd/MM/yyyy").parse(fecha_altaCadena);
			Date fecha_baja = new SimpleDateFormat("dd/MM/yyyy").parse(fecha_bajaCadena);

			response.sendRedirect("insertar_producto.jsp");
			insertar.guardarProducto(Integer.parseInt(id), Integer.parseInt(id_categoria), nombre, descripcion,
					Double.parseDouble(precio), Integer.parseInt(stock), fecha_alta, fecha_baja,
					Float.parseFloat(impuesto));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}