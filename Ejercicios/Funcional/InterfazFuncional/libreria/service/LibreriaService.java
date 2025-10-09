package Funcional.InterfazFuncional.libreria.service;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

import Funcional.InterfazFuncional.libreria.model.Cliente;
import Funcional.InterfazFuncional.libreria.model.Libro;
import Funcional.InterfazFuncional.libreria.model.Venta;

public class LibreriaService {
    private List<Libro> libros;
    private List<Cliente> clientes;
    private List<Venta> ventas;

    public LibreriaService() {
        this.libros = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    // ====== OPERACIONES CRUD ======
    public void registrarLibro(Libro libro) { libros.add(libro); }
    public void registrarCliente(Cliente cliente) { clientes.add(cliente); }

    // ====== VENTAS ======
    public void realizarVenta(Cliente cliente, Libro libro) {
        Venta venta = new Venta(libro, cliente);
        cliente.agregarCompra(venta);
        ventas.add(venta);
        System.out.println("✅ " + venta);
    }

    // ====== PROGRAMACIÓN FUNCIONAL ======
    // Transformación: resumen de libro
    public Function<Libro, String> resumenLibro = 
        l -> l.getTitulo() + " - " + l.getAutor() + " ($" + l.getPrecio() + ")";

    // Cálculo: libro más caro
    public Optional<Libro> libroMasCaro() {
        return libros.stream().max(Comparator.comparingDouble(Libro::getPrecio));
    }

    // Cálculo: libro más barato
    public Optional<Libro> libroMasBarato() {
        return libros.stream().min(Comparator.comparingDouble(Libro::getPrecio));
    }

    // Promedio de precios
    public double promedioPrecios() {
        return libros.stream().mapToDouble(Libro::getPrecio).average().orElse(0.0);
    }

    // Reporte de clientes y sus compras
    public void reporteClientes() {
        clientes.forEach(c -> {
            System.out.println("Cliente: " + c);
            c.getHistorialCompras().forEach(v -> System.out.println("   - " + v));
        });
    }

    // Listar libros ordenados alfabéticamente
    public List<Libro> listarLibrosOrdenados() {
        return libros.stream()
                .sorted(Comparator.comparing(Libro::getTitulo))
                .collect(Collectors.toList());
    }

    // Aplicar descuento a todos los libros de un autor
    public void aplicarDescuento(String autor, double porcentaje) {
        libros.stream()
                .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                .forEach(l -> {
                    double nuevoPrecio = l.getPrecio() * (1 - porcentaje / 100);
                    System.out.printf("Descuento aplicado a %s: Nuevo precio $%.2f%n",
                            l.getTitulo(), nuevoPrecio);
                });
    }

}