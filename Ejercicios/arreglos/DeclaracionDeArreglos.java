package arreglos;
// Declaracion de Arreglos en Java
public class DeclaracionDeArreglos {
    public static void main(String[] args) {
        final int N = 10;
        // OP1: Declaracion: Tipo[] nombreArreglo;
        int[] numeros;
        numeros = new int[N]; // Inicializacion reserva el espacio en memoria 
        //System.out.println("Direccion de memoria para numeros: " + numeros);
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[4] = 50;
        numeros[numeros.length - 1] = 100;

        // RECORRER LOS DATOS con for
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + (i + 1) + ": " + numeros[i]);
        }
        // RECORRER LOS DATOS con foreach
        for (int numero : numeros) {
            if (numero == 50)
                break;
            System.out.println("Numero: " + numero);
        }

        // OP2: Declaracion e Inicializacion
        String[] nombres = new String[N];
        
        // RECORRER LOS DATOS
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Elemento: " + (i + 1) + ": " + nombres[i]);
        }


        // OP3: Inicializacion Directa
        char[] letras = {'a','b','c','d','e'};
        String descripcion = "Hola Mundo";
        System.out.println("Longitud de descripcion: " + descripcion.length());
        System.out.println("Tamaño del arreglo Lenghts: " + letras.length);
        
        // RECORRER LOS DATOS
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Elemento: " + (i + 1) + ": " + letras[i]);
        }


        // OP4: 
        int edades[] = new int[N - 5];
    }
    
}