package aula2;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        //retorna booleano
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Victor"));
    }
}
