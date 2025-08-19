package arreglos;
import java.util.Scanner;

/*
 * Ejercicio 2:
    Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba
    un programa que imprima el número que tiene más ocurrencias en el arreglo y también
    imprimir la cantidad de veces que aparece en el arreglo.
    Por ejemplo, para el arreglo: [1, 2, 3, 3, 4, 5, 5, 5, 6, 7]
    Como resultado debería imprimir lo siguiente:
    1. La mayor ocurrencias es: 3
    2. El elemento que mas se repite es: 5
    En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una
    ocurrencia de 3 veces.
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10]; // Declaracion e Inicializacion del Array

        // Leer los 10 números
        System.out.println("****************** Ingrese 10 numeros enteros ******************");
        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Mostrar en el orden solicitado
        System.out.println("\nOrden:");
        for (int i = 0; i < numeros.length / 2; i++) {
            System.out.print(numeros[numeros.length - 1 - i] + " "); //Ultimo, penultimo
            System.out.print(numeros[i] + " "); // Primero, segundo
        }

        // Contar ocurrencias
        int mayorOcurrencia = 0;
        int elementoMasRepetido = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }
            // Verificamos si este numero tiene más repeticiones que el maximo actual
            if (contador > mayorOcurrencia) {
                mayorOcurrencia = contador;
                elementoMasRepetido = numeros[i];
            }
        }

        System.out.println("\n\n1. La mayor ocurrencia es: " + mayorOcurrencia);
        System.out.println("2. El elemento que más se repite es: " + elementoMasRepetido);

    }
}
