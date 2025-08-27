package POO_SistemaBancario;

public class CuentaBancaria {
    private static int contadorCuentas = 1;
    private int id;
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double depositoInicial) {
        this.id = contadorCuentas++;
        this.titular = titular;
        this.saldo = depositoInicial;
    }

    // Modificadores de Acceso
    public int getId() {    return id;  }
    public String getTitular() {    return titular; }
    public double getSaldo() {  return saldo;   }

    // Metodos Retirar & Depositar
    public void depositar(double monto) {
        this.saldo += monto;
    }
    
    public boolean retirar(double monto) {
        if (monto <= saldo) {
            this.saldo -= monto;
            return true;
        } else {
            return false;
        }
    }

    // toString
    @Override
    public String toString() {
        return "Cuenta ID: " + id + ", Titular: " + titular + ", Saldo: $" + saldo;
    }


}
