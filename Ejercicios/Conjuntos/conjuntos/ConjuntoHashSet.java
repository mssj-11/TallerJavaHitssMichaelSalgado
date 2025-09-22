package Conjuntos.conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConjuntoHashSet {
    public static void main(String[] args) {
        Set<String> colores = new HashSet<>();
        colores.add("Blanco");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Amarillo");
        colores.add("Rojo"); // Duplicado, se ignora
        colores.add("Rosa");

        System.out.println("Colores: " + colores);
        //System.out.println("Esta vacio de colores: " + colores.isEmpty()); // FALSE
        System.out.println("Verificar: " + colores.contains("Negro")); // FALSE

        for (String color : colores) {
            System.out.println("Color: " + color);
        }
/*
        for (String color : colores) {
            if (color.equals("Rosa")) {
                colores.remove("Rosa");
            }
        }*/ // NO SE PUEDE
        //System.out.println("Colores: " + colores);
        System.out.println("\n===== Iterator =====");
        Iterator<String> iterator = colores.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println("Color: " + color);
            if (color.equals("Rosa")) {
                iterator.remove();
            }
        }
        System.out.println("Colores: " + colores);


    }
}
