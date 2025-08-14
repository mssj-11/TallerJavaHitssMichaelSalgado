package ciclos;
import java.util.Scanner;

public class SumarNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0, total = 0; // Acumulador, contadores , banderas
        double promedio;

        System.out.print("Numero: ");
        numero = entrada.nextInt();

        while (numero != 0) {
            suma += numero;
            System.out.print("Numero: ");
            numero = entrada.nextInt();
        }
        System.out.println("\nSuma: " + suma);
    }
}
