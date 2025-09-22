package Conjuntos.TorneoDeportivo.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Disciplina {
    private String nombre;
    private Set<Jugador> jugadores;

    public Disciplina(String nombre) {
        this.nombre = nombre;
        this.jugadores = new HashSet<>();
    }

    public String getNombre() { return nombre; }
    public Set<Jugador> getJugadores() { return jugadores; }

    public boolean agregarJugador(Jugador jugador) {
        return jugadores.add(jugador);
    }

    public boolean eliminarJugador(Jugador jugador) {
        return jugadores.remove(jugador);
    }

    public boolean estaInscrito(Jugador jugador) {
        return jugadores.contains(jugador);
    }

    // Distintas vistas
    public Set<Jugador> getJugadoresHashSet() {
        return new HashSet<>(jugadores);
    }

    public Set<Jugador> getJugadoresLinkedHashSet() {
        return new LinkedHashSet<>(jugadores);
    }

    public Set<Jugador> getJugadoresTreeSetPorNombre() {
        return new TreeSet<>((a, b) -> a.getNombre().compareToIgnoreCase(b.getNombre()));
    }
}
