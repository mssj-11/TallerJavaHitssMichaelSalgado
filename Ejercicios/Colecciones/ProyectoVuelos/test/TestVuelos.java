package Colecciones.ProyectoVuelos.test;

import java.util.Comparator;
import java.util.List;

import Colecciones.ProyectoVuelos.model.Vuelo;
import Colecciones.ProyectoVuelos.util.CSVReaderUtil;

public class TestVuelos {
    public static void main(String[] args) {
        String ruta = "vuelos.csv";
        List<Vuelo> vuelos = CSVReaderUtil.leerVuelos(ruta);

        // Ordenar por fecha + hora
        vuelos.sort(Comparator.comparing(Vuelo::getFechaLlegada)
                .thenComparing(Vuelo::getHoraLlegada));

        // Calcular longitudes máximas para la lista
        int maxNombre = vuelos.stream().mapToInt(v -> v.getNombre().length()).max().orElse(0);
        int maxOrigen = vuelos.stream().mapToInt(v -> v.getOrigen().length()).max().orElse(0);
        int maxDestino = vuelos.stream().mapToInt(v -> v.getDestino().length()).max().orElse(0);

        System.out.println("==================================== Vuelos ordenados por llegada ====================================");
        vuelos.forEach(v -> System.out.println(v.toString(maxNombre, maxOrigen, maxDestino)));
        System.out.println("======================================================================================================");

        // Último vuelo en llegar (compacto)
        Vuelo ultimo = vuelos.get(vuelos.size() - 1);
        System.out.println("\nÚltimo vuelo en llegar: " + ultimo);

        // Vuelo con menor número de pasajeros (compacto)
        Vuelo menorPasajeros = vuelos.stream()
                .min(Comparator.comparingInt(Vuelo::getNumPasajeros))
                .orElse(null);
        System.out.println("\nVuelo con menor número de pasajeros: " + menorPasajeros);
    }
}