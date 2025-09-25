package Mapas.Map_TiendaDeportes.Util;

import java.util.*;

import Mapas.Map_TiendaDeportes.model.Producto;

public class Inventario {
    private Map<String, Producto> productosPorSku;   // Acceso O(1)
    private Map<String, Producto> productosPorOrden; // Orden de inserción
    private TreeMap<String, Producto> productosPorNombre; // Orden alfabético

    public Inventario() {
        productosPorSku = new HashMap<>();
        productosPorOrden = new LinkedHashMap<>();
        productosPorNombre = new TreeMap<>();
    }

    // Registrar producto
    public void registrarProducto(Producto p) {
        productosPorSku.put(p.getSku(), p);
        productosPorOrden.put(p.getSku(), p);
        productosPorNombre.put(p.getNombre(), p);
    }

    // Consultar producto en O(1) por SKU
    public Producto consultarPorSku(String sku) {
        return productosPorSku.get(sku);
    }

    // Reporte por orden de inserción
    public void reportePorOrden() {
        System.out.println("\n-------------- Reporte por orden de inserción ----------------");
        for (Producto p : productosPorOrden.values()) {
            System.out.println(p);
        }
    }

    // Reporte por orden alfabético
    public void reportePorNombre() {
        System.out.println("\n-------------- Reporte ordenado alfabéticamente --------------");
        for (Producto p : productosPorNombre.values()) {
            System.out.println(p);
        }
    }

    // Actualizar stock
    public void actualizarStock(String sku, int cantidad) {
        Producto p = productosPorSku.get(sku);
        if (p != null) {
            p.setStock(p.getStock() + cantidad);
        }
    }
}
