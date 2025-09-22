package Conjuntos.TorneoDeportivo.service;

import java.util.*;

import Conjuntos.TorneoDeportivo.model.Disciplina;
import Conjuntos.TorneoDeportivo.model.Jugador;

public class TorneoService {
    private Map<String, Disciplina> disciplinas = new HashMap<>();

    public void registrarDisciplina(String nombre) {
        disciplinas.putIfAbsent(nombre, new Disciplina(nombre));
    }

    public void registrarJugador(String disciplina, Jugador jugador) {
        registrarDisciplina(disciplina);
        disciplinas.get(disciplina).agregarJugador(jugador);
    }

    public void eliminarJugador(String disciplina, Jugador jugador) {
        if (disciplinas.containsKey(disciplina)) {
            disciplinas.get(disciplina).eliminarJugador(jugador);
        }
    }

    public boolean buscarJugador(String disciplina, Jugador jugador) {
        return disciplinas.containsKey(disciplina) &&
                disciplinas.get(disciplina).estaInscrito(jugador);
    }

    public void mostrarJugadores(String disciplina) {
        if (!disciplinas.containsKey(disciplina)) {
            System.out.println("Disciplina no encontrada");
            return;
        }
        System.out.println("Jugadores en " + disciplina + ": " + disciplinas.get(disciplina).getJugadores());
    }

    public void contarJugadores() {
        disciplinas.forEach((d, obj) -> {
            System.out.println(d + ": " + obj.getJugadores().size() + " jugadores");
        });
    }

    public Set<Jugador> fusionarEquipos(String d1, String d2) {
        Set<Jugador> union = new HashSet<>();
        union.addAll(disciplinas.getOrDefault(d1, new Disciplina(d1)).getJugadores());
        union.addAll(disciplinas.getOrDefault(d2, new Disciplina(d2)).getJugadores());
        return union;
    }

    public Set<Jugador> jugadoresComunes(String d1, String d2) {
        Set<Jugador> interseccion = new HashSet<>(disciplinas.getOrDefault(d1, new Disciplina(d1)).getJugadores());
        interseccion.retainAll(disciplinas.getOrDefault(d2, new Disciplina(d2)).getJugadores());
        return interseccion;
    }

    public void transferirJugador(String origen, String destino, Jugador jugador) {
        eliminarJugador(origen, jugador);
        registrarJugador(destino, jugador);
    }

    public Set<Jugador> jugadoresOrdenadosPorNombre() {
        Set<Jugador> todos = new TreeSet<>((a, b) -> a.getNombre().compareToIgnoreCase(b.getNombre()));
        disciplinas.values().forEach(d -> todos.addAll(d.getJugadores()));
        return todos;
    }

    public Set<Jugador> jugadoresOrdenadosPorId() {
        Set<Jugador> ranking = new TreeSet<>();
        disciplinas.values().forEach(d -> ranking.addAll(d.getJugadores()));
        return ranking;
    }
}
