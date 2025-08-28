package enumSistemaPedidos.enums;

// Enum para métodos de pago
public enum PaymentMethod {
    CASH("Efectivo"),
    CARD("Tarjeta de crédito/débito"),
    TRANSFER("Transferencia bancaria");

    private final String descripcion;

    // Constructor
    private PaymentMethod(String descripcion) {
        this.descripcion = descripcion;
    }

    // Modificador de Acceso GET
    public String getDescripcion() {
        return descripcion;
    }


}
