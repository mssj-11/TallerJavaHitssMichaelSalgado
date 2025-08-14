package entrada;
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 1. Obtener los 3 nombres
        System.out.println("Ingresar el primer nombre: ");
        String nombre1 = entrada.nextLine();
        System.out.println("Ingresar el segundo nombre: ");
        String nombre2 = entrada.nextLine();
        System.out.println("Ingresar el tercer nombre: ");
        String nombre3 = entrada.nextLine();

        // 2. Procesar cada nombre segun la logica
        String nuevoNombre1 = transformarNombre(nombre1);
        String nuevoNombre2 = transformarNombre(nombre2);
        String nuevoNombre3 = transformarNombre(nombre3);

        // 3. Unir los 3 nuevos nombres con guion bajo
        String resultado = nuevoNombre1 + "_" + nuevoNombre2 + "_" + nuevoNombre3;

        // 4. Imrimir el resultado
        System.out.println("Resultado final: " + resultado);
    }

    // Funcion para transformar el nombre
    public static String transformarNombre (String nombre) {
        if(nombre.length() < 3) {
            return "Nombre Invalido";
        }

        char segundoChar = Character.toUpperCase(nombre.charAt(1));
        String ultimosDos = nombre.substring(nombre.length() - 2);
        return segundoChar + "." + ultimosDos;
    }
    
}
