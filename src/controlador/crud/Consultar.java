package controlador.crud;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modelo.Rol;
import modelo.Usuario;

public class Consultar {
	// Logger
	private static Logger logger = LogManager.getLogger(Consultar.class);
	private Session session;

	private void iniciaOperacion() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		logger.info("Consulta iniciada");
	}

	private void terminaOperacion() {
		session.getTransaction().commit();
		session.close();
		logger.info("Consulta finalizada");
	}

	public Usuario obtenerUsuarioSegunEmail(String email) {
		// Definición de la lista de usuarios
		List<Usuario> listaUsuarios = listarUsuarios();

		iniciaOperacion();
		// Creación de un usuario para su retorno
		Usuario usuario = null;
		Integer idUsuario = 0;
		// Recorrer la lista de usuarios
		for (int i = 0; i < listaUsuarios.size(); i++) {
			// Obtener el código cuando el nombre introducido sea igual que el nombre de la
			// lista
			if (email.equals(listaUsuarios.get(i).getEmail())) {
				idUsuario = listaUsuarios.get(i).getId();
			}
		}
		usuario = (Usuario) session.get(Usuario.class, idUsuario);
		logger.info(usuario.toString());
		terminaOperacion();

		return usuario;
	}
	
	public Rol obtenerRol(int idRol) {
		iniciaOperacion();
		Rol rol = null;
		rol = (Rol) session.get(Rol.class, idRol);
		terminaOperacion();
		logger.info("Rol obtenido a partir del id: " + idRol);
		return rol;
	}

	public List<Rol> listarRoles() {
		iniciaOperacion();
		List<Rol> roles = null;
		roles = session.createQuery("from Rol").list();
		terminaOperacion();
		logger.info("Roles listados correctamente");
		return roles;
	}

	public Usuario obtenerUsuario(int idUsuario) {
		iniciaOperacion();
		Usuario usuario = null;
		usuario = (Usuario) session.get(Usuario.class, idUsuario);
		terminaOperacion();
		logger.info("Usuario obtenido a partir del id: " + idUsuario);
		return usuario;
	}

	public List<Usuario> listarUsuarios() {
		List<Usuario> usuarios = null;
		iniciaOperacion();
		usuarios = session.createQuery("from Usuario").list();
		terminaOperacion();
		logger.info("Usuarios listados correctamente");
		return usuarios;
	}
}
