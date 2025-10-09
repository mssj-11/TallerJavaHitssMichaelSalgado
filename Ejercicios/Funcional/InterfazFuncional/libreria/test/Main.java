package Funcional.InterfazFuncional.libreria.test;

import Funcional.InterfazFuncional.libreria.model.*;
import Funcional.InterfazFuncional.libreria.service.LibreriaService;

public class Main {
    public static void main(String[] args) {
        LibreriaService libreria = new LibreriaService();

        // Crear libros
        Libro l1 = new Libro("Java Avanzado", "Autor A", 2015, 50.0);
        Libro l2 = new Libro("Patrones de Diseño", "Autor B", 2018, 70.0);
        Libro l3 = new Libro("Introducción a Algoritmos", "Autor C", 2020, 90.0);

        // Crear clientes
        Cliente c1 = new Cliente("Carlos", 22);
        Cliente c2 = new Cliente("Ana", 19);

        // Registrar
        libreria.registrarLibro(l1);
        libreria.registrarLibro(l2);
        libreria.registrarLibro(l3);

        libreria.registrarCliente(c1);
        libreria.registrarCliente(c2);

        // Ventas
        libreria.realizarVenta(c1, l1);
        libreria.realizarVenta(c2, l3);

        // Funcional
        System.out.println("📖 Libro más caro: " + libreria.libroMasCaro().get());
        System.out.println("📖 Libro más barato: " + libreria.libroMasBarato().get());
        System.out.println("📊 Promedio precios: $" + libreria.promedioPrecios());

        System.out.println("\n📚 Libros ordenados:");
        libreria.listarLibrosOrdenados().forEach(System.out::println);

        System.out.println("\n👥 Reporte de clientes:");
        libreria.reporteClientes();

        System.out.println("\n🎯 Descuento del 10% a Autor B:");
        libreria.aplicarDescuento("Autor B", 10);
    }
}
