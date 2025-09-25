package Mapas.Map_TiendaDeportes.test;

import Mapas.Map_TiendaDeportes.model.Producto;
import Mapas.Map_TiendaDeportes.Util.Inventario;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.registrarProducto(new Producto("B456", "Camiseta", "Running", 30));
        inventario.registrarProducto(new Producto("C789", "Tenis", "Baloncesto", 20));
        inventario.registrarProducto(new Producto("A123", "Balón", "Fútbol", 50));

        // Consulta rápida
        System.out.println("Consulta SKU A123:");
        System.out.println(inventario.consultarPorSku("A123"));

        // Reportes
        inventario.reportePorOrden();
        inventario.reportePorNombre();

        // Actualización de stock
        inventario.actualizarStock("A123", -5);
        System.out.println("\nStock actualizado:");
        System.out.println(inventario.consultarPorSku("A123"));
    }
}
