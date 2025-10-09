package Streams.Empresa_recursoshumanos.report;

import Streams.Empresa_recursoshumanos.model.Empleado;
import Streams.Empresa_recursoshumanos.service.RecursosHumanosService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class ReporteUtil {

    private static final String RESET = "\u001B[0m";
    private static final String CYAN = "\u001B[36m";
    private static final String YELLOW = "\u001B[33m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";
    private static final String RED = "\u001B[31m";

    public static void imprimirEncabezado(String titulo) {
        String fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(CYAN + "=========================================");
        System.out.println("   REPORTE: " + titulo);
        System.out.println("   FECHA: " + fecha);
        System.out.println("=========================================" + RESET);
    }

    public static void exportarReporteTxt(String nombreArchivo, String titulo, List<Empleado> empleados, Map<String, Double> datos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            String fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            writer.write("=========================================\n");
            writer.write("REPORTE: " + titulo + "\n");
            writer.write("FECHA: " + fecha + "\n");
            writer.write("=========================================\n\n");

            if (empleados != null && !empleados.isEmpty()) {
                writer.write(String.format("%-20s | %-18s | %-10s | %-8s%n",
                        "Nombre", "Departamento", "Salario", "Años"));
                writer.write("---------------------------------------------------------------\n");
                for (Empleado e : empleados) {
                    writer.write(String.format("%-20s | %-18s | $%-9.2f | %-8d%n",
                            e.getNombre(), e.getDepartamento(), e.getSalario(), e.getAniosExperiencia()));
                }
                writer.write("---------------------------------------------------------------\n");
            }

            if (datos != null && !datos.isEmpty()) {
                for (var entry : datos.entrySet()) {
                    writer.write(entry.getKey() + ": " + String.format("%.2f", entry.getValue()) + "\n");
                }
            }

            System.out.println(GREEN + "\nReporte exportado exitosamente a: " + nombreArchivo + RESET);

        } catch (IOException e) {
            System.out.println(RED + "Error al exportar el reporte: " + e.getMessage() + RESET);
        }
    }

    public static void exportarTextoPlano(String nombreArchivo, String contenido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
        } catch (IOException e) {
            System.out.println(RED + "Error al guardar el reporte: " + e.getMessage() + RESET);
        }
    }

    public static String generarReporteCompleto(List<Empleado> empleados, RecursosHumanosService servicio) {
        StringBuilder sb = new StringBuilder();
        String fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        sb.append("============================================================\n");
        sb.append("   REPORTE COMPLETO DE RECURSOS HUMANOS\n");
        sb.append("   FECHA: ").append(fecha).append("\n");
        sb.append("============================================================\n\n");

        sb.append(generarSeccion("1. Empleados del departamento IT",
                servicio.listarPorDepartamento(empleados, "IT"), null));

        sb.append(generarSeccion("2. Salario promedio por departamento",
                null, servicio.salarioPromedioPorDepartamento(empleados)));

        sb.append(generarSeccion("3. Empleado con mayor salario",
                servicio.empleadoMayorSalario(empleados).stream().toList(), null));

        sb.append(generarSeccion("4. Empleados con >5 años exp y salario >50,000",
                servicio.empleadosFiltrados(empleados), null));

        sb.append(generarSeccion("5. Top 3 puntajes última evaluación",
                servicio.top3UltimaEvaluacion(empleados), null));

        sb.append(generarSeccion("6. Empleados con evaluaciones >90 ptos",
                List.of(), Map.of("Cantidad", (double) servicio.contarEvaluacionesAltas(empleados))));

        sb.append(generarSeccion("7. Ranking promedio de puntajes",
                empleados, servicio.rankingPromedioPuntajes(empleados)));

        return sb.toString();
    }

    private static String generarSeccion(String titulo, List<Empleado> empleados, Map<String, Double> datos) {
        StringBuilder sb = new StringBuilder();
        sb.append("=========================================\n");
        sb.append("REPORTE: ").append(titulo).append("\n");
        sb.append("FECHA: ").append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))).append("\n");
        sb.append("=========================================\n");

        if (empleados != null && !empleados.isEmpty()) {
            sb.append(String.format("%-20s | %-18s | %-10s | %-8s%n",
                    "Nombre", "Departamento", "Salario", "Años"));
            sb.append("---------------------------------------------------------------\n");
            for (Empleado e : empleados) {
                sb.append(String.format("%-20s | %-18s | $%-9.2f | %-8d%n",
                        e.getNombre(), e.getDepartamento(), e.getSalario(), e.getAniosExperiencia()));
            }
            sb.append("---------------------------------------------------------------\n");
        }

        if (datos != null && !datos.isEmpty()) {
            for (var entry : datos.entrySet()) {
                sb.append(entry.getKey()).append(": ").append(String.format("%.2f", entry.getValue())).append("\n");
            }
        }

        sb.append("\n");
        return sb.toString();
    }
}
