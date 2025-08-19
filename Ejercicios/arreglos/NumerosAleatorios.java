package arreglos;
import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        /*  Clase Math  */
        // Numeros Aleatorios
        //double numero = Math.random() * 100;
        for (int i=0; i < 10; i++) {
            int numero = (int) (Math.random() * 9) + 1;
            System.out.println(numero);
        }

        /*   Clase Random    */
        System.out.println("\nNumeros Aleatorios de la Clase Random: ");
        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(10);
        System.out.println(numero);

        double numero2 = aleatorio.nextDouble();
        System.out.println(numero2);

        boolean numero3 = aleatorio.nextBoolean();
        System.out.println(numero3);

    }
}
