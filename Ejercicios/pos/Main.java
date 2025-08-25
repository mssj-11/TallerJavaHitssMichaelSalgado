package pos;

public class Main {
    public static void main(String[] args) {
        Venta v1 = new Venta("Leche Santa Clara", 30.45);
        System.out.println("Venta: " + v1);
        System.out.println("Fecha Formateada: " + v1.fechaTexto());

        Venta v2 = new Venta();
        v2.setProducto("Galletas Maria 20g");
        v2.setPrecio(12.54);
        System.out.println("Venta: " + v2);
        System.out.println("Fecha Formateada: " + v2.fechaTexto());
        //System.out.println("Fecha: " + v2.textoAfecha());
    }
}
