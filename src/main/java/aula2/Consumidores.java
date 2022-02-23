package aula2;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        //Method Reference

       // Consumer<String> imprimirFrase = System.out::println;
        Consumer<String> imprimirFrase = frase -> System.out.println(frase);
        imprimirFrase.accept("Hello World!!!");
    }
}
