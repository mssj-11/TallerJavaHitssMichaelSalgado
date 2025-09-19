package Colecciones.ProyectoVuelos.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Vuelo {
    private String nombre, origen, destino;
    private LocalDate fechaLlegada;
    private LocalTime horaLlegada;
    private int numPasajeros;

    public Vuelo(String nombre, String origen, String destino, LocalDate fechaLlegada, LocalTime horaLlegada,
                 int numPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
        this.numPasajeros = numPasajeros;
    }

    public String getNombre() { return nombre; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public LocalDate getFechaLlegada() { return fechaLlegada; }
    public LocalTime getHoraLlegada() { return horaLlegada; }
    public int getNumPasajeros() { return numPasajeros; }

    private String capitalizar(String texto) {
        if (texto == null || texto.isEmpty()) return texto;
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }

    // ToString para la lista de vuelos, con alineación
    public String toString(int maxNombre, int maxOrigen, int maxDestino) {
        Locale locale = Locale.forLanguageTag("es-ES");
        String diaSemana = capitalizar(fechaLlegada.getDayOfWeek().getDisplayName(java.time.format.TextStyle.SHORT, locale));
        String mes = capitalizar(fechaLlegada.getMonth().getDisplayName(java.time.format.TextStyle.SHORT, locale));
        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        return String.format("%-" + maxNombre + "s: %-" + maxOrigen + "s -> %-" + maxDestino + "s, aterriza el %s %02d %s %d a las %s, con %d pasajeros",
                nombre,
                origen,
                destino,
                diaSemana,
                fechaLlegada.getDayOfMonth(),
                mes,
                fechaLlegada.getYear(),
                horaLlegada.format(horaFormatter),
                numPasajeros);
    }

    // ToString compacto para impresión individual (sin espacios extra)
    @Override
    public String toString() {
        Locale locale = Locale.forLanguageTag("es-ES");
        String diaSemana = capitalizar(fechaLlegada.getDayOfWeek().getDisplayName(java.time.format.TextStyle.SHORT, locale));
        String mes = capitalizar(fechaLlegada.getMonth().getDisplayName(java.time.format.TextStyle.SHORT, locale));
        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        return String.format("%s: %s -> %s, aterriza el %s %02d %s %d a las %s, con %d pasajeros",
                nombre,
                origen,
                destino,
                diaSemana,
                fechaLlegada.getDayOfMonth(),
                mes,
                fechaLlegada.getYear(),
                horaLlegada.format(horaFormatter),
                numPasajeros);
    }

}