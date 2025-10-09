package Funcional.supermercado.service;

import Funcional.supermercado.model.*;

import java.util.List;
import java.util.function.*;

public class SupermercadoService {

        // 1. Filtrar productos con stock bajo
        public Predicate<Producto> stockBajo = p -> p.getStock() < 5;

        // 2. Calcular total de una venta
        public Function<List<Producto>, Double> calcularTotal = productos -> productos.stream()
                        .mapToDouble(Producto::getPrecio).sum();

        // 3. Imprimir detalles de una venta
        public Consumer<Venta> imprimirVenta = v -> {
                System.out.println("\n=========== Ticket de Venta ===========");
                v.getProductos().forEach(System.out::println);
                System.out.printf("\nTotal: $%.2f%n", v.getTotal());
                System.out.println("=======================================");
        };

        // 4. Generar producto de muestra
        public Supplier<Producto> productoDemo = () -> new Producto(111, "Producto de Muestra", 10.0, 10);

        // 5. Aplicar descuento del 10%
        public UnaryOperator<Producto> aplicarDescuento = p -> {
                p.setPrecio(p.getPrecio() * 0.9);
                return p;
        };

        // 6. Comparar dos productos y devolver el más caro
        public BinaryOperator<Producto> productoMasCaro = (p1, p2) -> p1.getPrecio() >= p2.getPrecio() ? p1 : p2;

        // 7. Verificar si cliente accede a descuento
        public BiPredicate<Cliente, Double> clienteConDescuento = (c, total) -> c.getTipo().equalsIgnoreCase("VIP")
                        && total > 1000;

        // 8. Generar ticket de venta
        public BiConsumer<Cliente, Venta> generarTicket = (c, v) -> {
                System.out.println("\n--------- TICKET ---------");
                System.out.println("Cliente: " + c);
                v.getProductos().forEach(p -> System.out.println("- " + p));
                System.out.printf("TOTAL: $%.2f%n", v.getTotal());
        };

        // 9. Notificar cliente
        public BiConsumer<Cliente, Empleado> notificarCliente = (c, e) -> System.out
                        .println("Estimado " + c.getNombre() +
                                        ", su compra fue procesada por " + e.getNombre());

}
