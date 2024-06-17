package s13poo;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class S13POO {

    public static void main(String[] args) {
        // Clases anonimas
        //                                 EXPRESIONES LAMBDA
        // Boxin
        // Con Interface MiBiConsumirdor.java
        // MiBiConsumidor<String, Integer> imprimir = (String s, Integer i) -> {
        // System.out.println("String: " + s);
        // System.out.println("Integer: " + i);
        // };
        // imprimir.aceptar("Hola Mundo!", 42);

        // BiConsumer framework de java ( importa el: import java.util.function.BiConsumer;)
//        System.out.println("Con una sola");
//        BiConsumer<String, Integer> imprimirConEdad
//                = (nombre, edad) -> System.out.println(nombre + " tiene " + edad + " años");
//        // imprimirConEdad.accept("Juan", 30); // Imprime "Juan tiene 30 años“
//        // andThen concatena 2 expresiones lambda
//        System.out.println("Con andThen");
//        BiConsumer<String, Integer> imprimirConEdadYSaludo
//                = imprimirConEdad.andThen((nombre, edad) -> System.out.println("¡Saludos, " + nombre + "!"));
//        imprimirConEdadYSaludo.accept("Juan", 30);
        // Suppliter del framework -> Retorna un valor 
//        Supplier<String> proveedorDeSaludo = () -> "Hola,mundo!";
//        System.out.println(proveedorDeSaludo.get()); // "Hola, mundo!"
//        Funcion<String, Integer> longitudDeCadena = (String s) -> s.length();
//        String texto = "Hola, mundo!";
//        Integer longitud = longitudDeCadena.aplicar(texto);
//        System.out.println("La longitud de '" + texto + "' es: " + longitud);

        // Funcin retorna un valor
//        Funcion<String, Integer> longitudDeCadena = (String s) -> s.length();
//        String texto = "Hola, mundo!";
//        Integer longitud = longitudDeCadena.aplicar(texto);
//        System.out.println("La longitud de '" + texto + "' es: " + longitud);

        // Function del framework de java ( importa el: import java.util.function.Function;)
//        Function<String, Integer> longitudDeCadena = s -> s.length();
//        String texto = "Hola, mundo!";
//        Integer longitud = longitudDeCadena. apply(texto);
//        System.out.println("La longitud de '" + texto + "' es: " + longitud);
        // Function -> Retorna 
        //
        
        
    }

}
