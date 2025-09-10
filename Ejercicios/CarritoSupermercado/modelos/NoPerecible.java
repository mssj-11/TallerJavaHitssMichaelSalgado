package CarritoSupermercado.modelos;

public record NoPerecible(String nombre, double precio, int contenido, int calorias) implements Producto {}