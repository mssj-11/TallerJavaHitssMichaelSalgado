package ciclos;
import java.util.Scanner;
/*
 * Ejercicio 2: Bucle for
    Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:
    Calcular el menor número e imprimir el valor.
    Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual o mayor que 10!".
*/
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