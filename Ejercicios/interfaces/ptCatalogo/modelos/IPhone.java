package interfaces.ptCatalogo.modelos;

import interfaces.ptCatalogo.abstractas.Electronico;


public class IPhone extends Electronico {
    private String modelo;
    private String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public double getPrecioVenta() {
        return precio * 1.10; // +10%
    }

    public String getModelo() { return modelo; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return String.format("iPhone {Modelo=%s, Color=%s, Fabricante=%s, Precio de Venta=%.2f}",
                modelo, color, fabricante, getPrecioVenta());
    }

}