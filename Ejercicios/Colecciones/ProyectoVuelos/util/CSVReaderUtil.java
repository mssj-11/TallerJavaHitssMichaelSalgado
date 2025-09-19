package Colecciones.ProyectoVuelos.util;

import Colecciones.ProyectoVuelos.model.Vuelo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.Normalizer;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CSVReaderUtil {

    public static List<Vuelo> leerVuelos(String rutaArchivo) {
        List<Vuelo> vuelos = new ArrayList<>();

        // Locale español
        Locale locale = Locale.forLanguageTag("es-ES");
        DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("d MMM yyyy", locale);
        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm");

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(rutaArchivo), "UTF-8"))) {

            String linea;
            boolean primeraLinea = true;

            while ((linea = br.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false; // saltar encabezado
                    continue;
                }

                String[] fila = linea.split(",");

                String nombre = fila[0].trim();
                String origen = normalizarTexto(fila[1].trim());
                String destino = normalizarTexto(fila[2].trim());

                // Limpiar fecha (remover día de la semana)
                String fechaTexto = fila[3].trim()
                        .replaceAll("^(Lun|Mar|Mié|Jue|Vie|Sáb|Dom)\\s*", "")
                        .trim();

                // Convertir abreviatura del mes a minúscula para que DateTimeFormatter lo reconozca
                String[] partesFecha = fechaTexto.split(" ");
                if (partesFecha.length == 3) {
                    partesFecha[1] = partesFecha[1].toLowerCase(locale); // "Ago" -> "ago"
                    fechaTexto = String.join(" ", partesFecha);
                }

                LocalDate fecha = LocalDate.parse(fechaTexto, fechaFormatter);

                String horaTexto = fila[4].trim().replace("hrs", "").trim();
                LocalTime hora = LocalTime.parse(horaTexto, horaFormatter);

                int pasajeros = Integer.parseInt(fila[5].trim());

                vuelos.add(new Vuelo(nombre, origen, destino, fecha, hora, pasajeros));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return vuelos;
    }

    /**
     * Normaliza acentos y caracteres especiales automáticamente.
     * Convierte a NFC para asegurar que tildes y ñ se manejen correctamente.
     */
    private static String normalizarTexto(String texto) {
        if (texto == null || texto.isEmpty()) return texto;
        return Normalizer.normalize(texto, Normalizer.Form.NFC);
    }
}
