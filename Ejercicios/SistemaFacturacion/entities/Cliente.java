package SistemaFacturacion.entities;

import SistemaFacturacion.genericos.Idenificable;

public class Cliente implements Idenificable<String> {
    private String id;
    private String nombre;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente {id=" + id + ", nombre=" + nombre + "}";
    }

    
}
