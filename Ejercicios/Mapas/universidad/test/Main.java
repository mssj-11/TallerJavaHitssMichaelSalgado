package Mapas.universidad.test;

import Mapas.universidad.model.*;
import Mapas.universidad.service.UniversidadService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        UniversidadService uni = new UniversidadService();

        Profesor prof1 = new Profesor("Dr. García");
        Profesor prof2 = new Profesor("Ing. López");

        Estudiante e1 = new Estudiante("E01", "Alan");
        Estudiante e2 = new Estudiante("E02", "Maria");

        Curso c1 = new Curso("Matemáticas", prof1, LocalDate.of(2025, 3, 1), LocalDate.of(2025, 6, 30));
        Curso c2 = new Curso("Programación", prof2, LocalDate.of(2025, 5, 15), LocalDate.of(2025, 8, 15));
        Curso c3 = new Curso("Historia", prof1, LocalDate.of(2025, 9, 1), LocalDate.of(2025, 12, 15));

        uni.registrarCurso(c1);
        uni.registrarCurso(c2);
        uni.registrarCurso(c3);

        // Pruebas
        uni.inscribirEstudiante("Matemáticas", e1);  // OK
        uni.inscribirEstudiante("Programación", e1); // Conflicto de fechas
        uni.inscribirEstudiante("Historia", e1);     // OK

        uni.inscribirEstudiante("Programación", e2); // OK

        // Listar
        uni.listarCursosDeEstudiante(e1);
        uni.listarCursosDeProfesor(prof1);
        uni.listarCursosActivos(LocalDate.of(2025, 6, 1));

        // Retirar estudiante
        uni.retirarEstudiante("Matemáticas", e1);
        uni.listarCursosDeEstudiante(e1);
    }
}
