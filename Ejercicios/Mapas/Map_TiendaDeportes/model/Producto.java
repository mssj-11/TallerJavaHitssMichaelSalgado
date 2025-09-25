package Mapas.Map_TiendaDeportes.model;

public class Producto {
    private String sku;          // Código único
    private String nombre;       // Nombre del producto
    private String categoria;    // Categoría (fútbol, baloncesto, etc.)
    private int stock;           // Stock disponible

    public Producto(String sku, String nombre, String categoria, int stock) {
        this.sku = sku;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }

    // Getters y Setters
    public String getSku() { return sku; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return String.format("SKU: %s | Nombre: %s | Categoría: %s | Stock: %d",
                sku, nombre, categoria, stock);
    }
}
