package Streams.Empresa_recursoshumanos.test;

import Streams.Empresa_recursoshumanos.model.Empleado;
import Streams.Empresa_recursoshumanos.service.RecursosHumanosService;
import Streams.Empresa_recursoshumanos.util.DatosEjemplo;

import java.util.List;
import java.util.Map;

public class Mainn {
    public static void main(String[] args) {

        List<Empleado> empleados = DatosEjemplo.generarEmpleados();
        RecursosHumanosService servicio = new RecursosHumanosService();

        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("\n .:: Sistema de Recursos Humanos y Evaluación de Desempeño ::. \n");

        System.out.println("==== 1. Empleados del departamento IT ====");
        servicio.listarPorDepartamento(empleados, "IT").forEach(System.out::println);

        System.out.println("\n==== 2. Salario promedio por departamento ====");
        servicio.salarioPromedioPorDepartamento(empleados)
                .forEach((d, s) -> System.out.println(d + ": $" + String.format("%.2f", s)));

        System.out.println("\n==== 3. Empleado con mayor salario ====");
        servicio.empleadoMayorSalario(empleados)
                .ifPresent(System.out::println);

        System.out.println("\n==== 4. Empleados con >5 años exp y salario >50,000 ====");
        servicio.empleadosFiltrados(empleados).forEach(System.out::println);

        System.out.println("\n==== 5. Top 3 puntajes última evaluación ====");
        servicio.top3UltimaEvaluacion(empleados).forEach(System.out::println);

        System.out.println("\n==== 6. Empleados con evaluaciones >90 ptos ====");
        System.out.println("Cantidad: " + servicio.contarEvaluacionesAltas(empleados));

        System.out.println("\n==== 7. Ranking promedio de puntajes ====");
        Map<String, Double> ranking = servicio.rankingPromedioPuntajes(empleados);
        ranking.forEach((n, p) -> System.out.println(n + " ==> Promedio: " + String.format("%.2f", p)));
        System.out.println("\n-----------------------------------------------------------------");
    }
}
