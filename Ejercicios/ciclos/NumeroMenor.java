package ciclos;
import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad;

        // Pedir cantidad de numeros a comparar (>=10)
        do {
            System.out.print("Cantidad de numeros a comparar (mínimo 10): ");
            cantidad = entrada.nextInt();
            if (cantidad < 10) {
                System.out.println("Debe ingresar al menos 10 numeros.");
            }
        } while (cantidad < 10);
        
        int menor = Integer.MAX_VALUE;  // Inicializamos con el maximo valor entero

        // For para leer cada numero y calcular el menor
        for(int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el numero #"+i+": ");
            int numero = entrada.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }

        // Mostrar el numero menor
        System.out.println("\nEl numero menor es: " + menor);

        // Mostrar el mensaje segun condicion
        if (menor < 10) {
            System.out.println("El numero menor es menor que 10.");
        } else {
            System.out.println("El numero menor es igual o mayor que 10.");
        }

        entrada.close();
    }
}