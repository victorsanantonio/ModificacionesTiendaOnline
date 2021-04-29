package controlador;

import java.util.HashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import controlador.crud.Consultar;
import modelo.Usuario;

public class Login {
	
	private static Logger logger = LogManager.getLogger(Login.class);
	Consultar consultar;
	
	public boolean validarCredenciales(String email, String contrasenha) {
        Usuario usuario = null;
        consultar = new Consultar();
        //Clave-valor del usuario introducido...
        HashMap<String, String> usuarioIntroducido = new HashMap<String, String>();
        usuarioIntroducido.put(email, contrasenha);

        try {
            //Creación de un nuevo usuario a partir del nombre introducido
            usuario = consultar.obtenerUsuarioSegunEmail(email);
            
            //Clave valor del usuario original
            //El usuario original se obtiene a partir del nombre de usuario introducido
            HashMap<String, String> usuarioOriginal = new HashMap<String, String>();
            usuarioOriginal.put(usuario.getEmail(), usuario.getClave());
            logger.info(usuarioOriginal);
            logger.info(usuarioIntroducido);
            //Si los credenciales introducidos son iguales a los almacenados
            if (usuarioIntroducido.equals(usuarioOriginal)) {
            	logger.info("Inicio de sesión correcto");
                return true;
            }
            else {
            	logger.error("Credenciales erróneos");
            }
            //Si el usuario no existe, se trata la excepción lanzada en este caso
        } catch (NullPointerException npe) {
            System.err.println("Usuario no existente");
            logger.error("El usuario introducido no existe");
        }
        return false;
    }
}
