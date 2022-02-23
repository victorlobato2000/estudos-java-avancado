package aula2;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
        Supplier<Pessoa> pessoa = () -> new Pessoa();
        System.out.println(pessoa.get());
    }
}
class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Victor Lobato";
        idade = 21;
    }
    @Override
    public String toString(){
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}