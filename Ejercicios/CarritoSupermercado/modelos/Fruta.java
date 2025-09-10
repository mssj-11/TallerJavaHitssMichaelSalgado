package CarritoSupermercado.modelos;

public record Fruta(String nombre, double precio, double peso, String color) implements Producto {}