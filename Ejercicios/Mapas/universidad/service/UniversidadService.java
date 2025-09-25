package Mapas.universidad.service;

import Mapas.universidad.model.*;

import java.time.LocalDate;
import java.util.*;

public class UniversidadService {

    private Map<String, Curso> cursos; // clave: nombre del curso

    public UniversidadService() {
        this.cursos = new HashMap<>();
    }

    // Registrar un curso
    public void registrarCurso(Curso curso) {
        cursos.put(curso.getNombre(), curso);
    }

    // Inscribir estudiante si no hay conflicto
    public boolean inscribirEstudiante(String nombreCurso, Estudiante estudiante) {
        Curso curso = cursos.get(nombreCurso);
        if (curso == null) {
            System.out.println("Curso no encontrado.");
            return false;
        }

        // Verificar solapamientos
        for (Curso c : cursos.values()) {
            if (c.getEstudiantes().contains(estudiante)) {
                if (hayConflicto(c, curso)) {
                    System.out.println("Conflicto de fechas: " + c.getNombre() + " y " + curso.getNombre());
                    return false;
                }
            }
        }

        curso.agregarEstudiante(estudiante);
        System.out.println("Estudiante inscrito en " + curso.getNombre());
        return true;
    }

    // Retirar estudiante
    public boolean retirarEstudiante(String nombreCurso, Estudiante estudiante) {
        Curso curso = cursos.get(nombreCurso);
        if (curso != null) {
            return curso.retirarEstudiante(estudiante);
        }
        return false;
    }

    // Listar cursos de un estudiante
    public void listarCursosDeEstudiante(Estudiante estudiante) {
        System.out.println("Cursos de " + estudiante.getNombre() + ":");
        cursos.values().stream()
                .filter(c -> c.getEstudiantes().contains(estudiante))
                .forEach(System.out::println);
    }

    // Listar cursos de un profesor
    public void listarCursosDeProfesor(Profesor profesor) {
        System.out.println("Cursos impartidos por " + profesor.getNombre() + ":");
        cursos.values().stream()
                .filter(c -> c.getProfesor().equals(profesor))
                .forEach(System.out::println);
    }

    // Listar cursos activos en una fecha
    public void listarCursosActivos(LocalDate fecha) {
        System.out.println("Cursos activos el " + fecha + ":");
        cursos.values().stream()
                .filter(c -> c.estaActivoEn(fecha))
                .forEach(System.out::println);
    }

    // Verificar solapamiento de fechas
    private boolean hayConflicto(Curso c1, Curso c2) {
        return !(c1.getFin().isBefore(c2.getInicio()) || c2.getFin().isBefore(c1.getInicio()));
    }
}
