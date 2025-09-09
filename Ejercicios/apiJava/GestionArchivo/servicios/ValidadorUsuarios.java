package GestionArchivo.servicios;
import GestionArchivo.excepciones.NombreInvalidoException;

public class ValidadorUsuarios {
    public static void validarNombre(String nombre) throws NombreInvalidoException {
        if (nombre == null || nombre.trim().length() < 3) {
            throw new NombreInvalidoException("El nombre \"" + nombre + "\" no es válido. Debe tener al menos 3 caracteres.");
        }
    }
}