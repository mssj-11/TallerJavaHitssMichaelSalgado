package ciclos;
import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * Ejercicio 3:
    Pedir 20 notas finales de alumnos en una escala de 1 a 10, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores o iguales a 6, promedio de notas inferiores a 6 y la cantidad de notas iguales a 1, además mostrar el promedio total.
    Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).
    Opcional: si una de las notas ingresadas es menor que 1.0 o mayor que 10.0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
*/
public class NotasPromedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double sumaMayoresIgual6 = 0;
        double sumaMenores6 = 0;
        double sumaTotal = 0;

        int contadorMayoresIgual6 = 0;
        int contadorMenores6 = 0;
        int contadorNotas1 = 0;

        boolean error = false;

        for(int i = 1; i<= 20; i++) {
            System.out.print("Ingresa la nota #" + i + "(1-10): ");
            double nota = entrada.nextDouble();

            // Rango
            if (nota < 1.0 || nota > 10.0) {
                System.out.println("Error: La nota debe de estar entre 1-10. \nPrograma finalizado.");
                error = true;
                break;
            }

            // Clasificacion
            if (nota >= 6.0) {
                sumaMayoresIgual6 += nota;
                contadorMayoresIgual6++;
            } else {
                sumaMenores6 += nota;
                contadorMenores6++;
            }

            if (nota == 1.0) {
                contadorNotas1++;
            }

            sumaTotal += nota;
        }


        // Resultados
        if (!error) {
            double promedioMayoresIgual6 = contadorMayoresIgual6 > 0 ? sumaMayoresIgual6 / contadorMayoresIgual6 : 0;
            double promedioMenores6 = contadorMenores6 > 0 ? sumaMenores6 / contadorMenores6 : 0;
            double promedioTotal = (contadorMayoresIgual6 + contadorMenores6) > 0 ? sumaTotal / (contadorMayoresIgual6 + contadorMenores6) : 0;

            System.out.println("\nResultados:");
            System.out.println("Promedio de notas >= 6: " + df.format(promedioMayoresIgual6));
            System.out.println("Promedio de notas < 6: " + df.format(promedioMenores6));
            System.out.println("Cantidad de notas iguales a 1: " + contadorNotas1);
            System.out.println("Promedio total: " + df.format(promedioTotal));
        }

        entrada.close();
    }
}
