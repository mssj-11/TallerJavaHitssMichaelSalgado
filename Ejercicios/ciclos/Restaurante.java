package ciclos;
import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * Ejercicio 4:
 * Un restaurante necesita un programa que permita al cajero:
    Mostrar un menú de opciones:
    1. Registrar un pedido.
    2. Mostrar el total de ventas.
    3. Salir del sistema.
    
    Cada pedido se registra ingresando el precio.
    
    El programa debe seguir mostrando el menú hasta que el cajero elija Salir.
    
    Validar que el precio sea positivo antes de sumarlo a las ventas.
*/

public class Restaurante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        double totalVentas = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENU del Restaurante ---");
            System.out.println("1. Registrar un pedido");
            System.out.println("2. Mostrar el total de ventas.");
            System.out.println("3. Salir del sistema.");
            System.out.print("Seleccione una opcion: ");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el precio del pedido: ");
                    double precio = entrada.nextDouble();

                    if (precio > 0) {
                        totalVentas += precio;
                        System.out.println("Pedido registrado con exito.");
                    } else {
                        System.out.println("Error: El precio debe ser positivo.");
                    }
                    break;
                    case 2:
                        System.out.println("Total de ventas: $" + df.format(totalVentas));
                        break;
                    case 3:
                        System.out.println("Saliendo del sistema...");
                        salir = true;
                        break;
                default:
                    System.out.println("Opcion invalida, porfavor intente de nuevo.");
                    break;
            }
        }
        entrada.close();
    }
}
