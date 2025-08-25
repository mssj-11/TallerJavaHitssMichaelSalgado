package fechashoras;
import java.time.LocalDate;
// Manejo de Fechas
public class Fechas {
    public static void main(String[] args) {
        // ***** Manejo de Fechas *****
        LocalDate hoy = LocalDate.now(); // Fecha Actual
        System.out.println("Fecha actual: " + hoy);

        // Obtener partes de la Fecha
        System.out.println("\nAño actual: " + hoy.getYear());
        System.out.println("Mes actual: " + hoy.getMonth());
        System.out.println("Dia actual: " + hoy.getMonthValue());
        System.out.println("Numero del Dia del Año actual: " + hoy.getDayOfYear());
        System.out.println("Numero del Dia del Mes actual: " + hoy.getDayOfMonth());
        System.out.println("Dia de la semana(nombre): " + hoy.getDayOfWeek());
        
        LocalDate fecha = LocalDate.of(2025, 7, 20); // Fecha Especifica
        System.out.println("\nFecha: " + fecha);

        // Formateo: Desde Texto ISO ("yyyy-MM-dd")
        LocalDate fechaParseada = LocalDate.parse("2025-09-16");
        System.out.println("\nFecha parseada: " + fechaParseada);

        /*  Operaciones con fechas: */
        //  Sumar (Dias, Semanas, Meses, Años)
        System.out.println("\nProximo Lunes: " + hoy.plusDays(7));
        System.out.println("Proximo Semana: " + hoy.plusWeeks(2));
        System.out.println("Proximo Mes: " + hoy.plusMonths(2));
        System.out.println("Proximo Año: " + hoy.plusYears(2));

        // Restar (Dias, Semanas, Meses, Años)
        System.out.println("\nProximo Lunes: " + hoy.minusDays(7));
        System.out.println("Proximo Semana: " + hoy.minusWeeks(2));
        System.out.println("Proximo Mes: " + hoy.minusMonths(2));
        System.out.println("Proximo Año: " + hoy.minusYears(2));


        //Comparación de fechas
        System.out.println("fecha es anterior a fecha parseada? " + fecha. isBefore(fechaParseada));
        System.out.println("fecha actual es posterior a fecha? " + hoy.isAfter(fecha));
        System.out.println("Fecha actual es igual a fecha parseada? " + hoy.isEqual(fechaParseada));

    }
}
