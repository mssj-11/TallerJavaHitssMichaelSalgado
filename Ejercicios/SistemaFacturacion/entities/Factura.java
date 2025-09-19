package SistemaFacturacion.entities;

import java.util.List;

import SistemaFacturacion.genericos.Idenificable;

public class Factura implements Idenificable<Long> {
    private Long id;
    private Cliente cliente;
    private List<Producto> productos;

    public Factura(Long id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
    }

    @Override
    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    // Agregar un producto a la factura
    public void agregarProducto (Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado a la Factura: " + producto);
    }

    // Agregar un producto de la factura
    public boolean eliminarProducto(int idProducto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == idProducto) {
                Producto producto = productos.remove(i);
                System.out.println("Producto eliminado: " + idProducto);
                return true;
            }
        }
        System.out.println("No se encontro el Producto con el ID: " + idProducto);
        return false;
    }

    // Calcular total
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    //Construcción de factura
    public String generarFactura() {
        StringBuilder sb = new StringBuilder();
        sb.append("======== Factura #").append(id).append(" =========\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append("\n\n");
        sb.append("-----------------------------------------------------\n");

        for (Producto producto : productos) {
            sb.append(String.format("%-30s $%10.2f%n",
                    producto.getDescripcion(),
                    producto.getPrecio()));
        }

        sb.append("-----------------------------------------------------\n");
        sb.append(String.format("%-30s $%10.2f%n", "TOTAL:", calcularTotal()));
        sb.append("=====================================================\n");

        return sb.toString();
    }



    @Override
    public String toString() {
        return "Factura {id=" + id + ", cliente=" + cliente + ", productos=" + productos + "}";
    }
    
    
}
