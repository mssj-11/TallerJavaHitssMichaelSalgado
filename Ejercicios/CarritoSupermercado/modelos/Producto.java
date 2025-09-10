package CarritoSupermercado.modelos;

// Interfaz sellada para asegurar que solo nuestras entidades la implementen
public sealed interface Producto permits Fruta, Lacteo, Limpieza, NoPerecible {
    String nombre();
    double precio();
}