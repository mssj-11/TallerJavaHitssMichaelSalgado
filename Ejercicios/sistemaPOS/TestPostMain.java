package sistemaPOS;

public class TestPostMain {
    public static void main(String[] args) {
        Producto p1 = new Producto("Galletas gamesa", 12);
        Producto p2 = new Producto("Pan Tostado", 22);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("*************** Ventas ***************");
        Venta v1 = new Venta(p1, 2);
        Venta v2 = new Venta(p1, 3);
        System.out.println(v1);
        System.out.println(v2);
    }
}
