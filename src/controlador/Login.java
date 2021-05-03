package controlador;

import java.util.HashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jasypt.util.password.StrongPasswordEncryptor;

import controlador.crud.Consultar;
import modelo.Usuario;

public class Login {

	private static Logger logger = LogManager.getLogger(Login.class);
	Consultar consultar;

	public boolean validarCredenciales(String email, String contrasenha) {
		Usuario usuario = null;
		consultar = new Consultar();

		try {
			usuario = consultar.obtenerUsuarioSegunEmail(email);
			logger.info(usuario);

			StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
			String encryptedPassword = passwordEncryptor.encryptPassword(contrasenha);
			logger.info("ENCRIPTADA ----> "+encryptedPassword);

			// Comparar contraseñas
			String clavePlana = usuario.getClave();
			logger.info("Clave introducida: "+encryptedPassword);
			logger.info("Clave del usuario: "+clavePlana);
			
			if (passwordEncryptor.checkPassword(clavePlana, encryptedPassword)) {
				System.out.println("Clave correcta"); // correct!
				return true;
			} else {
				System.out.println("Clave incorrecta"); // bad login!
				return false;
			}

		} catch (NullPointerException npe) {
			System.err.println("Usuario no existente");
			logger.error("El usuario introducido no existe");
		}
		return false;
	}
}
