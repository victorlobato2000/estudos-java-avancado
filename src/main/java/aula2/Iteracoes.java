package aula2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Victor","Lobato","Silva","Victor"};
        imprimirNomesFiltrados();

    }

    public static void imprimirNomesFiltrados(String... nomes){

        String nomesParaImprimir= "";
        for (int i = 0; i < nomes.length; i++){
            if(nomes[i].equals("Lobato")){
                nomesParaImprimir =""+nomes[i];
            }
            System.out.println("Nomes do For"+ nomesParaImprimir);

            String nomesImprimirStream = Stream.of(nomes)
                    .filter(nome -> nome.equals("Victor"))
                    .collect(Collectors.joining()); // String

            System.out.println("Nomes do Stream"+ nomesImprimirStream);
        }
    }
}
