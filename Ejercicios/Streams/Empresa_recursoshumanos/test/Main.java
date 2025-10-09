package Streams.Empresa_recursoshumanos.test;

import Streams.Empresa_recursoshumanos.model.Empleado;
import Streams.Empresa_recursoshumanos.report.ReporteUtil;
import Streams.Empresa_recursoshumanos.service.RecursosHumanosService;
import Streams.Empresa_recursoshumanos.util.DatosEjemplo;

import java.util.*;

public class Main {

    // Colores ANSI
    private static final String RESET = "\u001B[0m";
    private static final String CYAN = "\u001B[36m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RecursosHumanosService servicio = new RecursosHumanosService();
        List<Empleado> empleados = DatosEjemplo.generarEmpleados();

        System.out.println(CYAN + "\n============================================================");
        System.out.println("  .:: SISTEMA DE RECURSOS HUMANOS Y EVALUACIÓN DE DESEMPEÑO ::.");
        System.out.println("============================================================" + RESET);

        int opcion = 0;
        do {
            mostrarMenu();
            System.out.print(GREEN + "\nSeleccione una opción (1-8) o 0 para salir: " + RESET);
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(RED + "Entrada inválida. Intente de nuevo." + RESET);
                continue;
            }

            switch (opcion) {
                case 1 -> {
                    String titulo = "Empleados del departamento IT";
                    ReporteUtil.imprimirEncabezado(titulo);
                    var lista = servicio.listarPorDepartamento(empleados, "IT");
                    lista.forEach(System.out::println);
                    preguntarExportar(scanner, titulo, lista, null);
                }
                case 2 -> {
                    String titulo = "Salario promedio por departamento";
                    ReporteUtil.imprimirEncabezado(titulo);
                    var mapa = servicio.salarioPromedioPorDepartamento(empleados);
                    mapa.forEach((d, s) -> System.out.println(d + ": $" + String.format("%.2f", s)));
                    preguntarExportar(scanner, titulo, null, mapa);
                }
                case 3 -> {
                    String titulo = "Empleado con mayor salario";
                    ReporteUtil.imprimirEncabezado(titulo);
                    var emp = servicio.empleadoMayorSalario(empleados);
                    emp.ifPresent(System.out::println);
                    preguntarExportar(scanner, titulo, emp.stream().toList(), null);
                }
                case 4 -> {
                    String titulo = "Empleados con mas de 5 años exp y salario mayor a 50,000";
                    ReporteUtil.imprimirEncabezado(titulo);
                    var lista = servicio.empleadosFiltrados(empleados);
                    lista.forEach(System.out::println);
                    preguntarExportar(scanner, titulo, lista, null);
                }
                case 5 -> {
                    String titulo = "Top 3 puntajes última evaluación";
                    ReporteUtil.imprimirEncabezado(titulo);
                    var lista = servicio.top3UltimaEvaluacion(empleados);
                    lista.forEach(System.out::println);
                    preguntarExportar(scanner, titulo, lista, null);
                }
                case 6 -> {
                    String titulo = "Empleados con evaluaciones mayores a 90 ptos";
                    ReporteUtil.imprimirEncabezado(titulo);
                    long cantidad = servicio.contarEvaluacionesAltas(empleados);
                    System.out.println("Cantidad: " + cantidad);
                    preguntarExportar(scanner, titulo, List.of(), Map.of("Cantidad", (double) cantidad));
                }
                case 7 -> {
                    String titulo = "Ranking promedio de puntajes";
                    ReporteUtil.imprimirEncabezado(titulo);
                    Map<String, Double> ranking = servicio.rankingPromedioPuntajes(empleados);
                    ranking.forEach((n, p) ->
                            System.out.println(n + " ==> Promedio: " + String.format("%.2f", p)));
                    preguntarExportar(scanner, titulo, empleados, ranking);
                }
                case 8 -> {
                    System.out.println(YELLOW + "\nGenerando reporte completo..." + RESET);
                    String todo = ReporteUtil.generarReporteCompleto(empleados, servicio);
                    ReporteUtil.exportarTextoPlano("reporte_todo_en_uno.txt", todo);
                    System.out.println(GREEN + "\nReporte completo generado: reporte_todo_en_uno.txt" + RESET);
                }
                case 0 -> System.out.println(GREEN + "\nSaliendo del sistema. ¡Hasta luego!" + RESET);
                default -> System.out.println(RED + "Opción no válida. Intente nuevamente." + RESET);
            }

            if (opcion != 0) {
                System.out.print(YELLOW + "\nPresione ENTER para continuar..." + RESET);
                scanner.nextLine();
            }

        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println(CYAN + "\n================= MENÚ DE REPORTES =================" + RESET);
        System.out.println("1. Empleados del departamento IT");
        System.out.println("2. Salario promedio por departamento");
        System.out.println("3. Empleado con mayor salario");
        System.out.println("4. Empleados con >5 años de experiencia y salario >50,000");
        System.out.println("5. Top 3 empleados con mejor puntaje (última evaluación)");
        System.out.println("6. Cantidad de empleados con evaluaciones >90 puntos");
        System.out.println("7. Ranking promedio de puntajes");
        System.out.println("8. Generar TODO EN UNO (TXT con todos los reportes)");
        System.out.println("0. Salir");
        System.out.println(CYAN + "====================================================" + RESET);
    }

    private static void preguntarExportar(Scanner scanner, String titulo, List<Empleado> empleados, Map<String, Double> datos) {
        System.out.print(YELLOW + "\n¿Desea exportar este reporte a un archivo TXT? (s/n): " + RESET);
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            String nombreArchivo = "reporte_" + titulo.replaceAll("\\s+", "_").toLowerCase() + ".txt";
            ReporteUtil.exportarReporteTxt(nombreArchivo, titulo, empleados, datos);
        }
    }
}
