package Conjuntos.TorneoDeportivo.test;

import Conjuntos.TorneoDeportivo.model.Jugador;
import Conjuntos.TorneoDeportivo.service.TorneoService;
import Conjuntos.TorneoDeportivo.util.MenuUtil;

public class TorneoApp {
    public static void main(String[] args) {
        TorneoService service = new TorneoService();

        // Simulación inicial de jugadores
        service.registrarJugador("Futbol", new Jugador(1, "Carlos"));
        service.registrarJugador("Futbol", new Jugador(2, "Ana"));
        service.registrarJugador("Basquetbol", new Jugador(3, "Luis"));
        service.registrarJugador("Voleibol", new Jugador(4, "Marta"));
        service.registrarJugador("Basquetbol", new Jugador(2, "Ana")); // Ana también en básquetbol

        MenuUtil.mostrarMenu(service);
    }
}
