package interfaces.ptCatalogo.modelos;

import java.time.LocalDate;

import interfaces.ptCatalogo.abstractas.Producto;
import interfaces.ptCatalogo.interfaces.ILibro;


public class Libro extends Producto implements ILibro {
    private LocalDate fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, LocalDate fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public double getPrecioVenta() {
        return precio * 1.05; // +5%
    }

    @Override
    public LocalDate getFechaPublicacion() { return fechaPublicacion; }
    @Override
    public String getAutor() { return autor; }
    @Override
    public String getTitulo() { return titulo; }
    @Override
    public String getEditorial() { return editorial; }

    @Override
    public String toString() {
        return String.format("Libro {Titulo=%s, Autor=%s, Editorial=%s, Precio de Venta=%.2f}",
                titulo, autor, editorial, getPrecioVenta());
    }

}