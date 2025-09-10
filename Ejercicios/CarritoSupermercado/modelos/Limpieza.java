package CarritoSupermercado.modelos;

public record Limpieza(String nombre, double precio, String componentes, double litros) implements Producto {}