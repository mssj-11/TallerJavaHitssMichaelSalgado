package POO_SistemaBancario;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<CuentaBancaria> cuentas = new ArrayList<>();
    private List<Transaccion> transacciones = new ArrayList<>();

    public CuentaBancaria crearCuenta(String titular, double depositoInicial) {
        CuentaBancaria cuenta = new CuentaBancaria(titular, depositoInicial);
        cuentas.add(cuenta);
        return cuenta;
    }

    public void depositar(CuentaBancaria cuenta, double monto){
        cuenta.depositar(monto);
        transacciones.add(new Transaccion("Deposito", monto, cuenta));
    }

    public void retirar(CuentaBancaria cuenta, double monto){
        if (cuenta.retirar(monto)) {
            transacciones.add(new Transaccion("Retiro", monto, cuenta));
        } else {
            System.out.println("Saldo insuficiente en la cuenta de " + cuenta.getTitular());
        }
    }

    public void mostrarCuentas() {
        System.out.println("=== Cuentas Bancarias ===");
        for (CuentaBancaria c : cuentas) {
            System.out.println(c);
        }
    }

    public void mostrarTransacciones() {
        System.out.println("\n=== Historial de Transacciones ===");
        for (Transaccion t : transacciones) {
            System.out.println(t);
        }
    }

}
