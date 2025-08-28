package enumSistemaPedidos.enums;

// Enum para estados del pedido
public enum OrderStatus {
    NEW("Pedido creado"),
    PROCESSING("Pedido en proceso"),
    SHIPPED("Pedido enviado"),
    DELIVERED("Pedido entregado"),
    CANCELLED("Pedido cancelado");

    private final String mensaje;

    // Constructor
    private OrderStatus(String mensaje) {
        this.mensaje = mensaje;
    }

    // Modificador de Acceso GET
    public String getMensaje() {
        return mensaje;
    }


}
