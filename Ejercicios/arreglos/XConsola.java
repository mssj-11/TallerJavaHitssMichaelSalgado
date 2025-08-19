package arreglos;
import java.util.Scanner;

public class XConsola {
    /*
     * Ejercicio 3:
    Escribir un programa que imprima una X construida a base de la letra X en las diagonales de la matriz 
    y utilizar el carácter guion bajo como relleno.
    El tamaño de la X se basa en una variable n que indicara el tamano de la letra para imprimir en una matriz de n x n.
    El carácter "X" en mayúscula y el guion bajo "_" para los espacios.

    Si n es igual a cero imprimir "ERROR" y finalizar la ejecucion del programa.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de n: ");
        int n = entrada.nextInt();

        if (n <= 0) {
            System.out.println("ERROR");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == (n - 1 - i)) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

    }
}
