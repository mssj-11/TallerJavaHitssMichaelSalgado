package Funcional.InterfazFuncional.libreria.model;

import java.util.UUID;

public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private double precio;

    public Libro(String titulo, String autor, int anioPublicacion, double precio) {
        if (anioPublicacion < 1900) {
            throw new IllegalArgumentException("El año de publicación debe ser posterior a 1900.");
        }
        this.id = UUID.randomUUID().toString();
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
    }

    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return String.format("%s (%d) - %s | $%.2f", titulo, anioPublicacion, autor, precio);
    }
}
