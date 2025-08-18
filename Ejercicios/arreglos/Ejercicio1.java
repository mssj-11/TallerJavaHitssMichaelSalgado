package arreglos;
import java.util.Scanner;
/*
 * Ejercicio 1:
    Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos. 
    Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo, el
    segundo, el antepenúltimo, el tercero, y así sucesivamente.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Mostrar en el orden requerido: último, primero, penúltimo, segundo, antepenúltimo, tercero...
        System.out.println("\nNúmeros en orden solicitado:");
        int inicio = 0;
        int fin = numeros.length - 1;

        while (inicio <= fin) {
            if (fin >= inicio) {
                System.out.print(numeros[fin] + " "); // último, penúltimo, ...
            }
            if (inicio < fin) {
                System.out.print(numeros[inicio] + " "); // primero, segundo, ...
            }
            inicio++;
            fin--;
        }

    }
}
