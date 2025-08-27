package sistemaPOS;

public class Venta {
    private final int id;
    private Producto producto;
    private int cantidad;

    private static int contador;

    // Constructores
    public Venta() {
        this.id = ++contador;
    }
    public Venta(Producto producto, int cantidad) {
        this();
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Modificadores de Acceso
    public int getId() {
        return id;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        Venta.contador = contador;
    }



    public double subTotal() {
        return producto.getPrecio() * cantidad;
    }
    @Override
    public String toString() {
        return "Venta: [id=" + id + ", producto=" + producto + ", cantidad=" + cantidad + ", Subtotal: "+ subTotal() + "]";
    }
    
    
}
