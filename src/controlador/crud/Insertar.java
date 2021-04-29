package controlador.crud;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modelo.Rol;

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

}
