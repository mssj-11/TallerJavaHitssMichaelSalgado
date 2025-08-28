package enumSistemaPedidos.test;

import enumSistemaPedidos.clase.Order;
import enumSistemaPedidos.enums.OrderPriority;
import enumSistemaPedidos.enums.OrderStatus;
import enumSistemaPedidos.enums.PaymentMethod;

public class TestOrderMain {
    public static void main(String[] args) {
        // Crear pedidos
        Order pedido1 = new Order("Ana", OrderStatus.NEW, OrderPriority.HIGH, PaymentMethod.CARD);
        Order pedido2 = new Order("Luis", OrderStatus.SHIPPED, OrderPriority.MEDIUM, PaymentMethod.CASH);
        Order pedido3 = new Order("Marta", OrderStatus.DELIVERED, OrderPriority.LOW, PaymentMethod.TRANSFER);

        // Mostrar detalles
        pedido1.showDetails();
        pedido2.showDetails();
        pedido3.showDetails();
    }

}