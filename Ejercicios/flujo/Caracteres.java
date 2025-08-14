package flujo;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
/*
 * Saber si un caracter dado por el usuario es:
 *  Una Letra (vocal o consonante)
 *  Un numero
 *  Un caracter especial
*/
public class Caracteres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char caracter;
        System.out.println("Caracter: ");
        caracter = entrada.next().charAt(0);
        if(Character.isLetter(caracter)){
            char c = Character.toLowerCase(caracter);

            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println("El caracter: "+caracter+" es una vocal.");
                default -> System.out.println("El caracter: "+caracter+" es una consonante.");
            }
        } else if (Character.isDigit(caracter)){
            System.out.println("El caracter: "+caracter+" es un numero.");
        } else {
            System.out.println("El caracter: "+caracter+" es un caracter especial.");
        }

    }
}