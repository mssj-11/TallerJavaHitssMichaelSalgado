package encapsulamiento.calculadora.test;

import encapsulamiento.calculadora.Calculadora;

public class testMain {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        
        // Encapsulamiento: usando metodos publicos para acceder a variables privadas
        cal.setNumero1(10);
        cal.setNumero2(5);

        System.out.println("Suma: " + cal.suma());
        System.out.println("Resta: " + cal.resta());
        System.out.println("Devision: " + cal.division());
        System.out.println("Multiplicacion: " + cal.multiplicacion());
    }
}
