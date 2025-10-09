package Streams.Intermedios;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MetodosIntermedios {
    public static void main(String[] args) {
        //Métodos intermedios
        //filter(Predicate<T> predicate)
        //Que hace: selecciona solo los elementos que cumplen una condición
        //Devuelve: un nuevo Stream con los elementos filtrados

        List<Integer> enteros = List.of(1, 3, 6, 34, 3, 76, 5, 2, 5, 3, 3, 1, 5);
        System.out.println(enteros);
        //Stream<Integer> flujo = enteros.stream(); //Forma 1:
        //Predicate<Integer>  impar = n -> n % 2 != 0; //Numeros Impares
        //enteros.stream().filter(impar);
        System.out.println("\nNumeros Impares: ");
        enteros.stream()
                .filter(n -> n % 2 != 0) // Metodo Intermedio
                // n -> System.out.println(n) -> System.out::println
                .forEach(n -> System.out.println(n)); //Metodo Terminal
        System.out.println("\nNumeros Pares: ");
        enteros.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

        System.out.println("\n============ map() ============");
        //map(Function<T, R> mapper)
        //Que hace: Transforma cada elemento en otro tipo o valor
        //Devuelve: un Stream<R>
        List.of("mike", "stream", "curso", "taller", "java")
            .stream()
            .filter(s -> s.length() > 5)
            // s -> s.toUpperCase() -> String::toUpperCase
            .map(String::toUpperCase) //Operacion Intemedia
            .forEach(System.out::println); //Operacion Terminal
        
        // Complejidad en tiempo ==> O(n * k)
        // Complejidad en espacio ==> O(1), O(n long n)

        System.out.println("\n============ flatMap() ============");
        // flatMap(Function<T, Stream<R>> mapper)
        //Que hace: aplana multiples streams en uno solo
        //Devuelve: Un Stream<R> con todos los elementos unidos
        List<List<String>> datos = List.of(
            List.of("A", "B", "C", "D", "E"), 
            List.of("F", "G", "H", "I"),
            List.of("W", "X", "Y", "Z")
        );
        System.out.println(datos); // [[A, B, C, D, E], [F, G, H, I], [W, X, Y, Z]]
        
        //datos.stream().flatMap(l -> l.stream()).forEach(System.out::println);// Imprime de A - Z
        List<String> aplanar = datos.stream()
        // l -> l.stream() -> List::stream
        .flatMap(List::stream)
        //s -> s.toLowerCase() -> String :: toLowerCase
        .map(String :: toLowerCase)
        .collect(Collectors.toList());
        //.forEach(System. out::println);
        System.out.println(aplanar);


        System.out.println("\n============ distinct() ============");
        //distinct()
        //Que hace: elimina elementos duplicados (usa equals() y hasCode())
        //Devuelve: un flujo sin los elementos duplicados
        enteros.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n============ sorted() ============");
        //sorted() / sorted(Comparator)
        //Que hace: ordena los elementos en orden natural (o con un Comparator)
        List<Integer> unicos = enteros.stream().distinct().collect(Collectors.toList());
        unicos.stream()
                .sorted()
                .forEach(System.out::println);
        
        
        System.out.println("\n============ sorted(Comparator) ============");
        unicos.stream()
                .filter(n -> n % 2 == 0)
                .sorted(Comparator.reverseOrder()) //Orden de forma inversa
                .forEach(System.out::println);
        
        
        System.out.println("\n============ peek() ============");
        //peek(Consumer<T> action)
        //Que hace: permite realizar una accion intermedia(debug/log)
        //No modifica el stream
        enteros.stream()
                .distinct()
                //.peek(n -> System.out.println("Unico: " + n))
                .filter(n -> n % 2 == 0) //Pares
                //.peek(n -> System.out.println("Par: " + n))
                .sorted() //Ordenar
                .forEach(System.out::println);

        
        System.out.println("\n============ limit() ============");
        //limit(long maxsize)
        //que hace: toma solo os primeros n elementos
        //limit(long)
        enteros.stream()
            .limit(5)
            .distinct()
            .forEach(System. out::println);

        
        System.out.println("\n============ skip(long) ============");
        //skip(long n)
        //que hace: Omite los primeros n elementos
        enteros.stream()
                .skip(5)
                .distinct()
                .forEach(System.out::println);


        System.out.println("\n============ mapToInt() ============");
        //mapToInt, mapToLong, mapToDouble
        //que hacen: transforman elementos a streams primitivos(IntStream, LongStream, DoubleStream)
        List.of("5", "54", "4", "12", "32").stream()
            .mapToInt(s -> Integer.parseInt(s))
            .filter(n -> n % 2 != 0)
            .forEach(System.out::println);

        
        System.out.println("\n============ flatMapToInt() ============");
        //flatMapToInt, flatMapToLong, flatMapToDouble
        //Que hace: versión primitiva de flatMap
        //se usa cuando cada elemento produce un stream de primitivos
        Stream<String> flujos = Stream.of("3 4 2 1 5", "5 4 2 9", "6 10 13 20 7");
        flujos.flatMapToInt(s -> Arrays.stream(s.split(" "))
                                        .mapToInt(s -> Integer.parseInt(s))
        )

    }
}
