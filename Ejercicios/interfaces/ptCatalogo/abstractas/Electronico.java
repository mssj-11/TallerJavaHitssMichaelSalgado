package interfaces.ptCatalogo.abstractas;

import interfaces.ptCatalogo.interfaces.IElectronico;
import interfaces.ptCatalogo.interfaces.IProducto;


public abstract class Electronico implements IElectronico, IProducto {
    protected String fabricante;
    protected int precio;

    public Electronico(int precio, String fabricante) {
        this.precio = precio;
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}