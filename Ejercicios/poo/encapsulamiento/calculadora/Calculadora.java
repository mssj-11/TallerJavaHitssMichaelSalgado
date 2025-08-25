package encapsulamiento.calculadora;

public class Calculadora {
    // Atributos
    private double numero1;
    private double numero2;
    // Acceso tipoRetorno nombreMetodo(tipoParametro1 parametro1, tipoParametro2 parametro2, ...)
    public double suma(){   return numero1 + numero2;   }
    public double resta(){   return numero1 - numero2;   }
    public double multiplicacion(){   return numero1 * numero2;   }
    public double division(){
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("No se puede dividir entre cero.");
            return 0;
        }
    }

    // Metodos publicos para acceder a los atributos
    public double getNumero1() {
        return numero1;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public double getNumero2() {
        return numero2;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }


}
