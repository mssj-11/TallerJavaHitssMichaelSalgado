package Funcional.supermercado.test;

import Funcional.supermercado.model.*;
import Funcional.supermercado.service.SupermercadoService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SupermercadoService service = new SupermercadoService();

        // Productos
        Producto p1 = new Producto(1, "Arroz", 50, 10);
        Producto p2 = new Producto(2, "Aceite", 130, 3);
        Producto p3 = new Producto(3, "Carne", 500, 8);
        Producto p4 = new Producto(4, "Pavo", 500, 8);

        // Cliente y empleado
        Cliente c1 = new Cliente(1, "Carlos", "VIP");
        Empleado e1 = new Empleado(1, "Ana", "Cajera");

        // Venta
        List<Producto> productos = Arrays.asList(p1, p2, p3, p4);
        Venta v1 = new Venta(101, c1, e1, productos);

        // 1. Filtrar stock bajo
        System.out.println("\n_________________________________________________________");
        System.out.println("1. Productos con stock bajo:");
        productos.stream().filter(service.stockBajo).forEach(System.out::println);

        // 2. Calcular total
        System.out.println("\n_________________________________________________________");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println("\n2. Total calculado: $" + service.calcularTotal.apply(productos));

        // 3. Imprimir detalles
        System.out.println("\n_________________________________________________________");
        System.out.println("3. Detalles de Venta");
        service.imprimirVenta.accept(v1);

        // 4. Producto demo
        System.out.println("\n_________________________________________________________");
        System.out.println("4. Producto de prueba: " + service.productoDemo.get());

        // 5. Aplicar descuento
        System.out.println("\n_________________________________________________________");
        service.aplicarDescuento.apply(p1);
        System.out.println("5. Producto con descuento: " + p1);

        // 6. Producto más caro
        System.out.println("\n_________________________________________________________");
        System.out.println("6. Producto más caro: " + service.productoMasCaro.apply(p2, p3));

        // 7. Cliente con descuento
        System.out.println("\n_________________________________________________________");
        System.out.println(c1);
        System.out.println("Venta Total: $" + v1.getTotal());
        System.out.println("7. ¿Cliente con descuento? " + service.clienteConDescuento.test(c1, v1.getTotal()));
        // aplicar y mostrar el precio despues de el descuento del 10% si es true(si se rebasa los $1000)
        double totalVenta = v1.getTotal();
        if (service.clienteConDescuento.test(c1, totalVenta)) {
            double totalConDescuento = totalVenta * 0.9; // Aplica 10% de descuento
            v1.setTotal(totalConDescuento); // actualizamos el total en la venta
            System.out.println("Cliente VIP con descuento aplicado. \nNuevo total: $" + totalConDescuento);
        } else {
            System.out.println("\nCliente sin descuento.");
        }

        // 8. Generar ticket
        System.out.println("\n_________________________________________________________");
        service.generarTicket.accept(c1, v1);

        // 9. Notificar cliente
        System.out.println("\n_________________________________________________________");
        service.notificarCliente.accept(c1, e1);
    }

}
