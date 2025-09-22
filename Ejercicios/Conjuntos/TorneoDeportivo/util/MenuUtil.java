package Conjuntos.TorneoDeportivo.util;

import java.util.Scanner;

import Conjuntos.TorneoDeportivo.model.Jugador;
import Conjuntos.TorneoDeportivo.service.TorneoService;

public class MenuUtil {
    private static final Scanner sc = new Scanner(System.in);

    public static void mostrarMenu(TorneoService service) {
        int opcion;
        do {
            System.out.println("\n=== Menú Torneo Deportivo ===");
            System.out.println("1. Mostrar jugadores por deporte");
            System.out.println("2. Contar jugadores en cada disciplina");
            System.out.println("3. Fusionar equipos");
            System.out.println("4. Ver jugadores en común");
            System.out.println("5. Transferir jugador");
            System.out.println("6. Mostrar jugadores ordenados por nombre");
            System.out.println("7. Ranking por ID");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Disciplina: ");
                    String d = sc.nextLine();
                    service.mostrarJugadores(d);
                }
                case 2 -> service.contarJugadores();
                case 3 -> {
                    System.out.print("Disciplina 1: ");
                    String d1 = sc.nextLine();
                    System.out.print("Disciplina 2: ");
                    String d2 = sc.nextLine();
                    System.out.println(service.fusionarEquipos(d1, d2));
                }
                case 4 -> {
                    System.out.print("Disciplina 1: ");
                    String dd1 = sc.nextLine();
                    System.out.print("Disciplina 2: ");
                    String dd2 = sc.nextLine();
                    System.out.println(service.jugadoresComunes(dd1, dd2));
                }
                case 5 -> {
                    System.out.print("Origen: ");
                    String o = sc.nextLine();
                    System.out.print("Destino: ");
                    String dest = sc.nextLine();
                    System.out.print("ID jugador: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre jugador: ");
                    String nombre = sc.nextLine();
                    service.transferirJugador(o, dest, new Jugador(id, nombre));
                }
                case 6 -> System.out.println(service.jugadoresOrdenadosPorNombre());
                case 7 -> System.out.println(service.jugadoresOrdenadosPorId());
            }
        } while (opcion != 8);
    }

}
