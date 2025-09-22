package Conjuntos.conjuntos;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new LinkedHashSet<>();
        numeros.add(34);
        numeros.add(60);
        numeros.add(23);
        numeros.add(34);
        numeros.add(100);

        System.out.println("Numeros: " + numeros);
        numeros.clear();

        
        
    }
}
