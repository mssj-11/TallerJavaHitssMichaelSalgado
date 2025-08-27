package sistemaPOS;

public class Producto {
    private final int id;
    private String nombre;
    private double precio;

    private static int contador; // Compartido por todos los objetos

    // Constructores
    public Producto() {
        this.id = contador++;
    }
    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }


    // Modificadores de Acceso
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        Producto.contador = contador;
    }

    // to String
    @Override
    public String toString() {
        return "Producto: [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
    }


}
