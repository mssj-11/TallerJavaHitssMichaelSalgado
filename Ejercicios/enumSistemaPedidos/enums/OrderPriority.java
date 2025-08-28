package enumSistemaPedidos.enums;

// Enum para prioridad
public enum OrderPriority {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int nivel;

    // Constructor
    private OrderPriority(int nivel) {
        this.nivel = nivel;
    }

    // Modificador de Acceso GET
    public int getNivel() {
        return nivel;
    }

    
}
