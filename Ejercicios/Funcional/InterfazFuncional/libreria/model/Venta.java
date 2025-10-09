package Funcional.InterfazFuncional.libreria.model;

import java.time.LocalDate;
import java.util.UUID;

public class Venta {
    private String codigo;
    private Libro libro;
    private Cliente cliente;
    private LocalDate fecha;

    public Venta(Libro libro, Cliente cliente) {
        this.codigo = UUID.randomUUID().toString();
        this.libro = libro;
        this.cliente = cliente;
        this.fecha = LocalDate.now();
    }

    public String getCodigo() { return codigo; }
    public Libro getLibro() { return libro; }
    public Cliente getCliente() { return cliente; }
    public LocalDate getFecha() { return fecha; }

    @Override
    public String toString() {
        return String.format("Venta[%s]: %s compró '%s' el %s",
                codigo, cliente.getNombre(), libro.getTitulo(), fecha);
    }
}
