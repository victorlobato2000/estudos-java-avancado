package aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA = (a, b) -> a + b;
        Calculo SUBTRACAO = (a, b) -> a - b;
        Calculo DIVISAO = (a, b) -> a / b;
        Calculo MULTIPLICACAO = (a, b) -> a * b;

        System.out.println(executarOperacao(SOMA, 4, 2));
        System.out.println(executarOperacao(SUBTRACAO, 4, 2));
        System.out.println(executarOperacao(DIVISAO, 4, 2));
        System.out.println(executarOperacao(MULTIPLICACAO, 4, 2));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calculo(a,b);
    }
}

interface Calculo{
    int calculo(int a, int b);
}
