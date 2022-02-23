package aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        System.out.println(executarOperacao(soma, 1, 3));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calculo(a,b);
    }
}

interface Calculo{
    int calculo(int a, int b);
}
