package Conjuntos.conjuntos;

import java.util.HashSet;
import java.util.Set;

import Conjuntos.conjuntos.Modelos.Alumno;

public class ConjuntoObjetos {
    public static void main(String[] args) {
        Set<Alumno> alumnos = new HashSet<>();

        alumnos.add(new Alumno(1, "Mario", 90));
        alumnos.add(new Alumno(2, "Andre", 80));
        alumnos.add(new Alumno(3, "Celeste", 85));
        alumnos.add(new Alumno(4, "Karina", 75));
        alumnos.add(new Alumno(1, "Mario", 90));

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
