package Mapas.universidad.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Curso {
    private String nombre;
    private Profesor profesor;
    private LocalDate inicio;
    private LocalDate fin;
    private Set<Estudiante> estudiantes;

    public Curso(String nombre, Profesor profesor, LocalDate inicio, LocalDate fin) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.inicio = inicio;
        this.fin = fin;
        this.estudiantes = new HashSet<>();
    }

    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
    public LocalDate getInicio() { return inicio; }
    public LocalDate getFin() { return fin; }
    public Set<Estudiante> getEstudiantes() { return estudiantes; }

    public boolean agregarEstudiante(Estudiante e) {
        return estudiantes.add(e); // Set evita duplicados
    }

    public boolean retirarEstudiante(Estudiante e) {
        return estudiantes.remove(e);
    }

    public boolean estaActivoEn(LocalDate fecha) {
        return (fecha.isEqual(inicio) || fecha.isAfter(inicio)) &&
               (fecha.isEqual(fin) || fecha.isBefore(fin));
    }

    @Override
    public String toString() {
        return String.format("Curso: %s | Profesor: %s | %s a %s",
                nombre, profesor.getNombre(), inicio, fin);
    }
}
