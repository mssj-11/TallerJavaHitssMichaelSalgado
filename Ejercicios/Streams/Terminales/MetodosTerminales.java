package Streams.Terminales;

import java.util.List;

public class MetodosTerminales {
    public static void main(String[] args) {

        //forEach(Consumer) -> List, Set
        //forEach(BiConsumer) -> Map
        //Que hace: itera sobre cada elemento y ejecuta una acción
        //Devuelve: void

        //toArray()I
        //Que hace: convierte el stream a un array
        //Devuelve: Object[] o tipo especifico si se pasa un generador
        String[] letras = List.of("a", "b", "c", "d", "e").stream().toArray(String[]::new);

        for (String elemento : letras) {
            System.out.println(elemento + " ");
        }

        //reduce()
        //Que hace: conbina los elementos en un unico resultado (acumulación
        //Devuelve: un valor
        int suma = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            .stream()
            // (a, b) -> a + b ==> (a, b) -> Integer.sum(a, b)
            // Integer::sum
            .reduce(0, (a, b) -> Integer::sum);
        System.out.println("Suma: " + suma);

    }
}
