package CarritoSupermercado.test;

import CarritoSupermercado.modelos.*;
import CarritoSupermercado.util.Bolsa;

public class SupermercadoApp {
    public static void main(String[] args) {
        // Bolsa de frutas
        Bolsa<Fruta> frutas = new Bolsa<>();
        frutas.addProducto(new Fruta("Manzana", 2.5, 0.35, "Rojo"));
        frutas.addProducto(new Fruta("Pera", 2.0, 0.25, "Verde"));
        frutas.addProducto(new Fruta("Uva", 3.5, 0.10, "Morado"));
        frutas.addProducto(new Fruta("Sandía", 15.0, 5.0, "Verde"));
        frutas.addProducto(new Fruta("Banana", 1.8, 0.20, "Amarillo"));

        // Bolsa de lácteos
        Bolsa<Lacteo> lacteos = new Bolsa<>();
        lacteos.addProducto(new Lacteo("Leche", 15.0, 1000, 8));
        lacteos.addProducto(new Lacteo("Queso", 30.0, 500, 25));
        lacteos.addProducto(new Lacteo("Mantequilla", 20.0, 200, 1));
        lacteos.addProducto(new Lacteo("Crema", 18.0, 250, 3));
        lacteos.addProducto(new Lacteo("Yogurt", 12.5, 800, 5));

        // Bolsa de limpieza
        Bolsa<Limpieza> limpieza = new Bolsa<>();
        limpieza.addProducto(new Limpieza("Cloro", 20.0, "Hipoclorito", 1.0));
        limpieza.addProducto(new Limpieza("Jabón Líquido", 15.0, "Glicerina", 1.5));
        limpieza.addProducto(new Limpieza("Shampoo", 22.0, "Extracto Natural", 0.75));
        limpieza.addProducto(new Limpieza("Suavizante", 18.0, "Aroma Floral", 1.0));
        limpieza.addProducto(new Limpieza("Detergente", 25.0, "Químicos", 2.0));

        // Bolsa de no perecibles
        Bolsa<NoPerecible> noPerecibles = new Bolsa<>();
        noPerecibles.addProducto(new NoPerecible("Arroz", 18.0, 1000, 3500));
        noPerecibles.addProducto(new NoPerecible("Frijoles", 22.0, 800, 3000));
        noPerecibles.addProducto(new NoPerecible("Harina", 15.0, 1000, 3200));
        noPerecibles.addProducto(new NoPerecible("Lentejas", 20.0, 1000, 3400));
        noPerecibles.addProducto(new NoPerecible("Pasta", 16.0, 500, 1800));

        // Mostrar los contenidos
        System.out.println("=== Frutas ===");
        frutas.getProductos().forEach(System.out::println);

        System.out.println("\n=== Lácteos ===");
        lacteos.getProductos().forEach(System.out::println);

        System.out.println("\n=== Limpieza ===");
        limpieza.getProductos().forEach(System.out::println);

        System.out.println("\n=== No Perecibles ===");
        noPerecibles.getProductos().forEach(System.out::println);
    }
}