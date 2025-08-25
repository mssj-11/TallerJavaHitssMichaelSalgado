package fechashoras;
import java.time.LocalTime;
// Manejo de Horas
public class Horas {
    public static void main(String[] args) {
        LocalTime horaActual = LocalTime.now(); // Hora Actual
        System.out.println("Hora Actual: " + horaActual);

        LocalTime horaEspecifica = LocalTime.of(10, 30); // Hora Especifica
        System.out.println("Hora Especifica: " + horaEspecifica);

        // Hora en texto
        LocalTime horaParseada = LocalTime.parse("12:53");
        System.out.println("Hora parseada: " + horaParseada);

        // Sumar / Restar (horas, minutos, segundos)
        System.out.println("Sumar horas y minutos: " + horaActual.plusHours(1).plusMinutes(10));
        System.out.println("Restar horas y minutos: " + horaActual.minusMinutes(-120));
    }
}
