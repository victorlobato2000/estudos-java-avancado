package aula3;

public class ThreadExemplo {
    public static void main(String[] args) {
        GerarPDF gerarPDF = new GerarPDF();
        TelaDeCarregamento carregarTela = new TelaDeCarregamento(gerarPDF);

        gerarPDF.start();
        carregarTela.start();

        System.out.println("O nome : "+ gerarPDF.getName());
        System.out.println("O nome : "+ carregarTela.getName());
    }
}

class GerarPDF extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gerou PDF");
    }
}

class TelaDeCarregamento extends Thread {
    private Thread imprimirgeradorPDF;

    public TelaDeCarregamento(Thread imprimirgeradorPDF){
        this.imprimirgeradorPDF = imprimirgeradorPDF;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(500);

                if(imprimirgeradorPDF.isAlive()){
                    System.out.println("Carregando...");
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
