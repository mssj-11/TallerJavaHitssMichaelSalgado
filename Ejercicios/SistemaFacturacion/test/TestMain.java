package SistemaFacturacion.test;

import java.util.ArrayList;
import java.util.Arrays;

import SistemaFacturacion.entities.Cliente;
import SistemaFacturacion.entities.Factura;
import SistemaFacturacion.entities.Producto;
import SistemaFacturacion.genericos.ServicioGenerico;
import SistemaFacturacion.util.Archivos;

public class TestMain {
    public static void main(String[] args) {
        ServicioGenerico<Cliente, String> clienteServicio = new ServicioGenerico<>();
        ServicioGenerico<Producto, Integer> productoServicio = new ServicioGenerico<>();
        ServicioGenerico<Factura, Long> facturaServicio = new ServicioGenerico<>();

        // ==== CLIENTES ====
        Cliente c1 = new Cliente("C001", "Michael");
        Cliente c2 = new Cliente("C002", "Ana");
        Cliente c3 = new Cliente("C003", "Karol");

        clienteServicio.agregar(c1);
        clienteServicio.agregar(c2);
        clienteServicio.agregar(c3);

        // ==== PRODUCTOS ====
        Producto p1 = new Producto(1, "Laptop Toshiba", 23000.0);
        Producto p2 = new Producto(2, "Mouse", 245.5);
        Producto p3 = new Producto(3, "Teclado LED", 1200.0);
        Producto p4 = new Producto(4, "Pantalla LCD", 4500.0);

        productoServicio.agregar(p1);
        productoServicio.agregar(p2);
        productoServicio.agregar(p3);
        productoServicio.agregar(p4);

        // ==== FACTURAS ====
        Factura f1 = new Factura(1001L, c1, new ArrayList<>(Arrays.asList(p1, p2)));
        Factura f2 = new Factura(1002L, c3, new ArrayList<>(Arrays.asList(p1, p2, p3)));

        facturaServicio.agregar(f1);
        facturaServicio.agregar(f2);

        // ==== MODIFICAR FACTURA ====
        System.out.println("Modificando factura, en la lista de productos.");
        f2.agregarProducto(p4);   // agrega Pantalla LCD
        f2.eliminarProducto(3);   // elimina Teclado LED

        // ==== MOSTRAR FACTURA ====
        System.out.println(f2.generarFactura());

        // ==== ARCHIVOS ====
        Archivos.guardarFactura(f2);       // guarda la factura en archivo
        Archivos.leerFactura(1002L);       // lee el archivo en consola
        Archivos.listarFacturas();         // lista todas las facturas en carpeta
    }
}
