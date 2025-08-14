package entrada;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) 
            System.out.println("El numero " +numero+ " es Multiplo de 3 y 5.");
        else if (numero % 3 == 0)
            System.out.println("El numero " +numero+ " es Multiplo de 3.");
        else if (numero % 5 == 0)
            System.out.println("El numero " +numero+ " es Multiplo de 5.");
        else 
            System.out.println("El numero " + numero + " no es multiplo de 3 ni de 5.");
        
        entrada.close();
    }

}