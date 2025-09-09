package GestionArchivo.app;

import GestionArchivo.excepciones.NombreInvalidoException;
import GestionArchivo.servicios.ValidadorUsuarios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class GestionArchivoUsuarios {
    public static void main(String[] args) {
        Path archivo = Path.of("usuarios.txt");

        try {
            // Intentar leer el archivo
            List<String> lineas = Files.readAllLines(archivo);

            System.out.println("Lista de usuarios leída del archivo:\n");

            for (String nombre : lineas) {
                try {
                    ValidadorUsuarios.validarNombre(nombre);
                    System.out.println("Usuario válido: " + nombre);
                } catch (NombreInvalidoException e) {
                    System.err.println(" " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.err.println("Error: No se pudo leer el archivo " + archivo.toAbsolutePath());
        }
    }

}