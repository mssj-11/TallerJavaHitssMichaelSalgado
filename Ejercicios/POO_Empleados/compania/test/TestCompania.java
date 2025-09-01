package POO_Empleados.compania.test;
import POO_Empleados.compania.model.Gerente;

public class TestCompania {
    public static void main(String[] args) {
        // Crear un Gerente
        Gerente gerente = new Gerente("Laura", "Martínez", "12345678A", "Calle Falsa 123", 7500, 15000);

        // Aumentar remuneración en 10%
        gerente.aumentarRemuneracion(10);

        // Modificar presupuesto
        gerente.setPresupuesto(20000);

        // Imprimir todos los datos vía toString
        System.out.println(gerente);
    }

}
