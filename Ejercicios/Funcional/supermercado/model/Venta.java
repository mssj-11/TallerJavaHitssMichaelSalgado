package Funcional.supermercado.model;

import java.util.List;

public class Venta {
    private int id;
    private Cliente cliente;
    private Empleado empleado;
    private List<Producto> productos;
    private double total;

    public Venta(int id, Cliente cliente, Empleado empleado, List<Producto> productos) {
        this.id = id;
        this.cliente = cliente;
        this.empleado = empleado;
        this.productos = productos;
        this.total = productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public Empleado getEmpleado() { return empleado; }
    public List<Producto> getProductos() { return productos; }
    public double getTotal() { return total; }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return String.format("Venta[%d] Cliente: %s, Empleado: %s, Total: $%.2f", 
                id, cliente.getNombre(), empleado.getNombre(), total);
    }

}
