package flujo;
import java.util.Scanner;
/*
 * Saber si un caracter dado por el usuario es:
 *  Una Letra (vocal o consonante)
 *  Un numero
 *  Un caracter especial
*/
public class Caracteress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un solo carácter: ");
        String input = scanner.nextLine();

        if (input.length() != 1) {
            System.out.println("Error: Debes ingresar solo un carácter.");
        } else {
            char caracter = input.charAt(0);
            String resultado = clasificarCaracter(caracter);
            System.out.println(resultado);
        }

        scanner.close();
    }

    /**
     * Clasifica el carácter como letra (vocal o consonante), número o carácter especial.
     * Utiliza switch moderno para las vocales.
     * 
     * @param c carácter a clasificar
     * @return mensaje descriptivo del tipo de carácter
     */
    public static String clasificarCaracter(char c) {
        if (Character.isLetter(c)) {
            return esVocal(c) ? "Es una vocal." : "Es una consonante."; // uso de operador ternario
        } else if (Character.isDigit(c)) {
            return "Es un número.";
        } else {
            return "Es un carácter especial.";
        }
    }

    /**
     * Determina si un carácter es una vocal usando switch moderno.
     * 
     * @param c carácter a evaluar
     * @return true si es vocal, false en caso contrario
     */
    public static boolean esVocal(char c) {
        return switch (Character.toLowerCase(c)) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

}