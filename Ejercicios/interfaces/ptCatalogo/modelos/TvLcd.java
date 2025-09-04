package interfaces.ptCatalogo.modelos;
import interfaces.ptCatalogo.abstractas.Electronico;


public class TvLcd extends Electronico {
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return precio * 1.15; // +15%
    }

    public int getPulgada() { return pulgada; }

    @Override
    public String toString() {
        return String.format("TvLcd {%d pulgadas, Fabricante=%s, Precio de Venta=$%.2f}",
                pulgada, fabricante, getPrecioVenta());
    }
}