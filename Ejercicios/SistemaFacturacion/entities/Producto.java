package SistemaFacturacion.entities;

import SistemaFacturacion.genericos.Idenificable;

public class Producto implements Idenificable<Integer> {
    private Integer id;
    private String descripcion;
    private Double precio;

    public Producto(Integer id, String descripcion, Double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }


    @Override
    public Integer getId() {
        return id;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public Double getPrecio() {
        return precio;
    }


    @Override
    public String toString() {
        return "Producto {id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + "}";
    }


}
