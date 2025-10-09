package Streams.Empresa_recursoshumanos.service;

import Streams.Empresa_recursoshumanos.model.Empleado;
import Streams.Empresa_recursoshumanos.model.Evaluacion;

import java.util.*;
import java.util.stream.Collectors;

public class RecursosHumanosService {

    // 1. Listar empleados de un departamento específico, ordenados alfabéticamente
    public List<Empleado> listarPorDepartamento(List<Empleado> empleados, String departamento) {
        return empleados.stream()
                .filter(e -> e.getDepartamento().equalsIgnoreCase(departamento))
                .sorted(Comparator.comparing(Empleado::getNombre))
                .toList();
    }

    // 2. Calcular salario promedio por departamento
    public Map<String, Double> salarioPromedioPorDepartamento(List<Empleado> empleados) {
        return empleados.stream()
                .collect(Collectors.groupingBy(
                        Empleado::getDepartamento,
                        Collectors.averagingDouble(Empleado::getSalario)
                ));
    }

    // 3. Obtener el empleado con mayor salario
    public Optional<Empleado> empleadoMayorSalario(List<Empleado> empleados) {
        return empleados.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario));
    }

    // 4. Listar empleados con más de 5 años de experiencia y salario > 50,000
    public List<Empleado> empleadosFiltrados(List<Empleado> empleados) {
        return empleados.stream()
                .filter(e -> e.getAniosExperiencia() > 5 && e.getSalario() > 50000)
                .toList();
    }

    // 5. Top 3 empleados con mejor puntaje en la última evaluación
    public List<Empleado> top3UltimaEvaluacion(List<Empleado> empleados) {
        return empleados.stream()
                .sorted((e1, e2) -> {
                    int ultimo1 = e1.getEvaluaciones().stream()
                            .max(Comparator.comparingInt(Evaluacion::getAnio))
                            .map(Evaluacion::getPuntaje)
                            .orElse(0);

                    int ultimo2 = e2.getEvaluaciones().stream()
                            .max(Comparator.comparingInt(Evaluacion::getAnio))
                            .map(Evaluacion::getPuntaje)
                            .orElse(0);

                    return Integer.compare(ultimo2, ultimo1);
                })
                .limit(3)
                .toList();
    }

    // 6. Contar empleados con al menos una evaluación > 90
    public long contarEvaluacionesAltas(List<Empleado> empleados) {
        return empleados.stream()
                .filter(e -> e.getEvaluaciones().stream()
                        .anyMatch(ev -> ev.getPuntaje() > 90))
                .count();
    }

    // 7. Ranking promedio de puntajes por empleado
    public Map<String, Double> rankingPromedioPuntajes(List<Empleado> empleados) {
        return empleados.stream()
                .collect(Collectors.toMap(
                        Empleado::getNombre,
                        e -> e.getEvaluaciones().stream()
                                .mapToInt(Evaluacion::getPuntaje)
                                .average()
                                .orElse(0.0)
                ));
    }
}