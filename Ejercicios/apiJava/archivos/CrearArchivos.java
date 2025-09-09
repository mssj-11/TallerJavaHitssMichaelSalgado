import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CrearArchivos {
    public static void main(String[] args) {
        //java.nio.file
        //Path -> Representa la ruta del archivo o directorio
        //Patchs -> Indica el nombre o ruta del archivo o directorio
        //en forma de cadena de texto
        //Files -> Contiene los metodos estaticos para operaciones de archivos
        //(crear, copiar, mover, eliminar, leer, escribir, etc)

        //Creación de un archivo
        Path ruta = Paths.get("archivo.txt");
        try {
            Files.createFile(ruta);
            System.out.println("Archivo creado: " + ruta.toAbsolutePath());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
