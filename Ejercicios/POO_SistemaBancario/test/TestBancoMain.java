package POO_SistemaBancario.test;

import POO_SistemaBancario.Banco;
import POO_SistemaBancario.CuentaBancaria;

public class TestBancoMain {
    public static void main(String[] args) {
        Banco banco = new Banco(); // Instancia a Banco = new Objeto Banco

        // Crear Cuentas
        CuentaBancaria ana = banco.crearCuenta("Ana", 5000);
        CuentaBancaria luis = banco.crearCuenta("Luis", 10000);

        // Operaciones de Ana
        banco.depositar(ana, 2000);
        banco.retirar(ana, 1000);

        // Operaciones de Luis
        banco.retirar(luis, 3000);
        banco.depositar(luis, 1500);

        // Mostrar resultados de las Transacciones
        banco.mostrarCuentas();
        banco.mostrarTransacciones();

    }
}
