package controlador.crud;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modelo.Categoria;
import modelo.Producto;
import modelo.Rol;
import modelo.Usuario;

public class Insertar {
	private Session session;
	private static Logger logger = LogManager.getLogger(Insertar.class);
	/**
     * Iniciar transacción Hibernate
     */
    private void iniciaOperacion() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        logger.info("Iniciar inserción");
    }

    /**
     * Terminar transacción Hibernate
     */
    private void terminaOperacion() {
        session.getTransaction().commit();
        session.close();
        logger.info("Finalizar inserción");
    }
    
    public void guardarRol(int id, String nombre){
    	iniciaOperacion();
    	Rol rol = new Rol(id, nombre);
    	session.save(rol);
    	logger.info(rol);
    	terminaOperacion();
    }

    public void guardarUsuario(int id, int id_rol, String email, String clave, String nombre, String apellido1, String apellido2, String direccion, String localidad, String provincia, String telefono, String dni) {
    	iniciaOperacion();
    	Usuario usuario = new Usuario(id, id_rol, email, clave, nombre, apellido1, apellido2, direccion, localidad, provincia, telefono, dni);
    	session.save(usuario);
    	logger.info(usuario);
    	terminaOperacion();
    }
    
    public void guardarCategoria(int id, String nombre, String descripcion){
    	iniciaOperacion();
    	Categoria categoria = new Categoria(id, nombre, descripcion);
    	session.save(categoria);
    	logger.info(categoria);
    	terminaOperacion();
    }
    
    public void guardarProducto(int id, int id_categoria, String nombre, String descripcion, double precio, int stock, Date fecha_alta, Date fecha_baja, float impuesto){
    	iniciaOperacion();
    	Producto producto = new Producto(id, id_categoria, nombre, descripcion, precio, stock, fecha_alta, fecha_baja, impuesto);
    	session.save(producto);
    	logger.info(producto);
    	terminaOperacion();
    }
}
