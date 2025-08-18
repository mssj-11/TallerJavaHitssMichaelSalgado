package arreglos;
import java.util.Arrays;

public class MetodosEnArrays {
    public static void main(String[] args) {
        final int N = 10;
        int[] edades = {34, 32, 16, 65, 45, 31, 25, 20, 10, 50};
        int[] precios = new int[N];
        //int valores;

        for (int edad : edades) {
            System.out.println("Eddaes: " + edad);
        }

        // Convertir un Array a String (Metodo: .toString())
        System.out.println(Arrays.toString(edades)); // [34, 32, 16, 65, 45, 31, 25, 20, 10, 50]

        // Busqueda Binaria de forma Dsordenada (Metodo: .binarySearch( valor, clave))
        System.out.println("Indice: " + Arrays.binarySearch(edades, 34));

        // Ordenaiento de un Array: De Menor a Mayor (Metodo: .sort())
        Arrays.sort(edades);                        //  [10, 16, 20, 25, 31, 32, 34, 45, 50, 65]
        System.out.println(Arrays.toString(edades));

        // Busqueda Binaria de forma Ordenada (Metodo: .binarySearch( valor, clave))
        System.out.println("Indice: " + Arrays.binarySearch(edades, 34)); // Indice: 6

        // Rellenar con un mismo valor el Arreglo
        System.out.println("Antes de usar Fill: ");
        for (int precio : precios) {
            System.out.println(precio);
        }
        System.out.println("Despues de usar Fill: ");
        Arrays.fill(precios, 10);
        for (int precio : precios) {
            System.out.println(precio);
        }


        Arrays.fill(precios, 0, 5, 5);
        System.out.println("Fill con Rango: ");
        for (int precio : precios) {
            System.out.println(precio);
        }
    }
}