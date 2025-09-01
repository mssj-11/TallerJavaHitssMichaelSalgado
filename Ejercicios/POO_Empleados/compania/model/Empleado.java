package POO_Empleados.compania.model;

public class Empleado extends Persona {
    private static int contadorId = 1;
    private int empleadoId;
    private double remuneracion;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleadoId = contadorId++;
        this.remuneracion = remuneracion;
    }

    // Getters
    public int getEmpleadoId() { return empleadoId; }
    public double getRemuneracion() { return remuneracion; }

    // Método para aumentar remuneración
    public void aumentarRemuneracion(double porcentaje) {
        if (porcentaje > 0) {
            remuneracion += remuneracion * porcentaje / 100;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
               ", EmpleadoID: " + empleadoId +
               ", Remuneración: $" + String.format("%.2f", remuneracion);
    }

}