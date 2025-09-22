package Conjuntos.conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoTreeSet {
    public static void main(String[] args) {
        Set<String> nombres = new TreeSet<>();
        nombres.add("Mike");
        nombres.add("Angelica");
        nombres.add("Maria");
        nombres.add("Miguel");
        nombres.add("Angel");
        nombres.add("Ana");
        nombres.add("Maria"); // Duplicado, se ignoras
        System.out.println("Nombres: " + nombres);
    }
}
