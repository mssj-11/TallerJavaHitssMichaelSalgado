package Mapas.Implementaciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapaHashMap {
    public static void main(String[] args) {
        // Map<K(clave), V(valor)> 
        Map<Integer, String> frutas = new HashMap<>();
        frutas.put(3, "Manzana");
        frutas.put(2, "Uva");
        frutas.put(6, "Melon");
        frutas.put(4, "Sandia");
        frutas.put(5, "Fresas");

        System.out.println("Frutas: " + frutas);

        frutas.put(3, "Mango"); // Remplaza el valor anterior y envia el nuevo
        System.out.println("Frutas: " + frutas);

        frutas.put(null, "Fruta desconocida");
        System.out.println("Frutas: " + frutas);

        frutas.put(8, null);
        frutas.put(10, null);
        System.out.println("Frutas: " + frutas);


        Set<Entry<Integer, String>> elementos = frutas.entrySet();
        // Recorrer un Mapa y Obtener clave valor
        for (Entry<Integer, String> elemento : elementos) {
            System.out.println();
            elemento.getValue();
        }
    }
}
