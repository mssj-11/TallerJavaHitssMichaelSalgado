package parametros;

public class ParametrosVariables {
    // Parametros variables: tipoDatos ... nombreParametro
    public static int sumar(int ... numeros) {
        int suma = 0;
        for (int n : numeros) {     suma += n;  }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Suma: " + sumar());
        System.out.println("Suma: " + sumar(3, 5, 10));
        System.out.println("Suma: " + sumar(54, 12, 43, 5, 65));
    }


}
