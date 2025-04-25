package com.robermejia.r_streams.a_crear_stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Crear_Stream {

    public static void main(String[] args) {

        // 1: crear un stream vacio
        Stream<String> streamVacio = Stream.empty();

        // 2: Crear un stream a partir de una coleccion
        Collection<String> collection1 = Arrays.asList("a", "b", "c");
        Stream<String> streamColeccion = collection1.stream();

        // 3: Crear un stream a partir de un array
        // forma 1
        Stream<String> stream1 = Stream.of("a", "b", "c");

        // forma 2
        String[] array1 = new String[] { "a", "b", "c", "d", "f" };
        Stream<String> stream2 = Arrays.stream(array1);

        // forma 3
        Stream<String> stream3 = Arrays.stream(array1, 1, 3);

        // 4: Crear un Stream con stream builder
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();

        // 5: Crear un stream generandolo (infinito) con "generate()"
        Stream<String> streamGenerado = Stream.generate(() -> "Hola").limit(10);

        // 6: Crear un Stream infinito con "iterate()"
        Stream<Integer> streamIterate = Stream.iterate(40, n -> n + 2).limit(10);

        // 7: Crear un Stream de primitivos
        // int
        IntStream intStream1 = IntStream.range(1, 3); // el ulitmo numero no stá incluido
        IntStream intStream2 = IntStream.rangeClosed(1, 3); // el ulitmo numero SI stá incluido
        // long
        LongStream longStream1 = LongStream.range(1, 3); // el ulitmo numero no stá incluido
        LongStream longStream2 = LongStream.rangeClosed(1, 3); // el ulitmo numero SI stá incluido

        

    }
}
