package ciclos;
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();

        for(int i =1; i<=10; i++){
            System.out.println(numero+" x "+i+" = "+numero * i);
        }
    }
}
