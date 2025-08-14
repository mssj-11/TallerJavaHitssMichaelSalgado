package ciclos;
import java.util.Scanner;
/*
 * Ejercicio 1: bucle for
 * Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, 
    pero sin usar el símbolo de multiplicación (*).
 * Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, 
    donde menos por menos es positivo.
*/
public class MultiplicacionConFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Segundo numero: ");
        int num2 = entrada.nextInt();

        // Determinar el signo del resultado
        boolean esPositivo = (num1 >= 0 && num2 >= 0) || (num1 < 0 && num2 < 0);

        // Convertir a valores absolutos (su valor sin signo)
        int a = Math.abs(num1);
        int b = Math.abs(num2);

        // Multiplicacion mediante sumas sucesivas(n veces segun el segundo numero)
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        // Aplicar signo
        if (!esPositivo) {
            resultado = -resultado;
        }

        System.out.println("El resultado de la multiplicación es: " + resultado);

        entrada.close();
    }
}