package flujo;
import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = entrada.nextInt();

        // Operador ternario para determinar par o impar
        String resultado = (numero % 2 == 0) 
                            ? "El número " + numero + " es Par" 
                            : "El número " + numero + " es Impar";

        System.out.println(resultado);

        entrada.close();
    }
}