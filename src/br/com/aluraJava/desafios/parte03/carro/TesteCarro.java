package br.com.aluraJava.desafios.parte03.carro;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro monza = new ModeloCarro();

        monza.setModelo("Monza");
        monza.definirPrecos(16000, 13000, 9000);
        monza.exibirInformacoes();
    }
}
