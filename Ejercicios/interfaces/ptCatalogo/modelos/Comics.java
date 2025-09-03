package interfaces.ptCatalogo.modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Comics extends Libro {

    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String personaje;

    public Comics(int precio, LocalDate fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecio(); //return super.getPrecio() * 1.07; // +7%
    }

    public String getPersonaje() { return personaje; }

    @Override
    public String toString() {
        return String.format("Comic {Titulo=%s, Personaje=%s, Autor=%s, Fecha de Publicación=%s, Precio de Venta=$%.2f}",
                getTitulo(), 
                personaje, 
                getAutor(), 
                getFechaPublicacion().format(FORMATO_FECHA), 
                getPrecioVenta());
    }

}