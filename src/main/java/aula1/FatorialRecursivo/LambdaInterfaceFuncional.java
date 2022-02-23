package aula1.FatorialRecursivo;

public class LambdaInterfaceFuncional {
    public static void main(String[] args) {
        /** NO JAVA 8 SERIA:
        aula1.FatorialRecursivo.Funcao colocarPrefixoSenhorNaString = new aula1.FatorialRecursivo.Funcao() {
            @Override
            public String gerar(String valor) {
                return "Sr. "+ valor;
            }
        };
        System.out.println(colocarPrefixoSenhorNaString.gerar("Victor Lobato"));
         **/
        Funcao colocarPrefixoSenhorNaString = valor -> "Sr. "+ valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("Victor Lobato"));
    }

}

@FunctionalInterface // não é obrigatorio
interface Funcao{
    String gerar(String valor);
}