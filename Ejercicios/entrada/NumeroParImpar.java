package entrada;

import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero " +numero+ " es Par");
        } else {
            System.out.println("El numero " +numero+ " es Impar");
        }
        entrada.close();
    }
}
