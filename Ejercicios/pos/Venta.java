package pos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Venta {
    private String producto;
    private double precio;
    private LocalDate fechaVenta;

    // Constructors
    public Venta() { // Vacio
        this.fechaVenta = LocalDate.now();
    }
    public Venta(String producto, double precio) {
        this();
        this.producto = producto;
        this.precio = precio;
    }

    // Modificadores de Acceso
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public LocalDate getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    // Formatear Fechas y Horas: TEXT (dd/MM/yyyy)
    public String fechaTexto() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy hh:mm:a");
        String fechaTexto = fechaVenta.format(formato);
        return fechaTexto;
    }

    // Texto a Objeto
    public void textoAfecha(){
        String fechaTexto = "25.08.2025";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate fecha = LocalDate.parse(fechaTexto, formato);
        System.out.println("Fecha: " + fecha);
    }

    @Override
    public String toString() {
        return "Producto: " + producto + ", Precio: " + precio + ", Fecha: " + fechaVenta;
    }


}
