package parametros;

public class ConcatenarCadenasTexto {
    // Concatenar cadenas de texto (+) , StringBuilder
    public static String concatenar(String titulo, int valor, String ... cadenas) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Titulo: " + titulo);
        System.out.println("Valor: " + valor);
        for (String cadena : cadenas) {     sb.append(cadena).append(" ");  }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(concatenar("Un elemento en el parametro variable", 10, "Hola"));
        System.out.println(concatenar("Seis elemento en el parametro variable", 15, "Mundo", "desde", "Java", "21,", "Empezamos ya!").length());
        System.out.println(concatenar("Ningunn elemento en el parametro variable", 20));
    }

}
