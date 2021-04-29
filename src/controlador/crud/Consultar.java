package controlador.crud;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import modelo.Rol;
import modelo.Usuario;

public class Consultar {
	//Logger
	private static Logger logger = LogManager.getLogger(Consultar.class);
	private Session session;

	private void iniciaOperacion() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		logger.info("Inserción iniciada");
	}

	private void terminaOperacion() {
		session.getTransaction().commit();
		session.close();
		logger.info("Inserción finalizada");
	}
	
	public Usuario obtenerUsuarioSegunNombre(String nombreUsuario) {
        //Creación de un empleado para su retorno
		Usuario usuario = null;
        //Definición de la lista de empleados
        List<Usuario> listaUsuarios = listarUsuarios();
        iniciaOperacion();
        int idUsuario = 0;
        //Recorrer la lista de emplados
        for (int i = 0; i < listaUsuarios.size(); i++) {
            //Obtener el código cuando el nombre introducido sea igual que el nombre de la lista
            if (nombreUsuario.equals(listaUsuarios.get(i).getNombre())) {
                idUsuario = listaUsuarios.get(i).getId();
            }
        }
        usuario = (Usuario) session.get(Usuario.class, idUsuario);
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
		iniciaOperacion();
		List<Usuario> usuarios = null;
		usuarios = session.createQuery("from Usuario").list();
		terminaOperacion();
		logger.info("Usuarios listados correctamente");
		return usuarios;
	}
}
