package POO_Empleados.compania.model;

public class Cliente extends Persona {
    private static int contadorCliente = 1;
    private int clienteId;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = contadorCliente++;
    }

    public int getClienteId() { return clienteId; }

    @Override
    public String toString() {
        return super.toString() + ", ClienteID: " + clienteId;
    }
}
