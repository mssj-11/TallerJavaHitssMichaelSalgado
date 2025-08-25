package fechashoras;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
// Manejo de Horas & Fechas
public class FechaHora {
    public static void main(String[] args) {
        LocalDateTime fechaHoraActual = LocalDateTime.now(); // Fecha y Hora actual
        System.out.println("Fecha y Hora Actual: " + fechaHoraActual);

        // Fecha y hora Especifica
        LocalDateTime fechaHoraEspecifica = LocalDateTime.of(2025, 6, 19, 10, 30, 15);
        System.out.println("Fecha y Hora Especifica: " + fechaHoraEspecifica);

        // SUMAR
        System.out.println("Sumar dias: " + fechaHoraActual.plusDays(5));
        System.out.println("Sumar horas: " + fechaHoraActual.plusHours(30));

        // Fecha
        LocalDate fecha = LocalDate.of(2025, 6, 23);
        LocalTime hora = LocalTime.of(10, 10, 10);
        LocalDateTime horaFecha = LocalDateTime.of(fecha, hora);
        System.out.println("Fecha y Hora: " + horaFecha);

    }
}
