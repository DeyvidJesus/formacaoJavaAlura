package br.com.aluraJava.desafios.desafioFinal;

public class Teste {
    public static void main(String[] args) {
        Musica everyNight = new Musica();
        everyNight.setTitulo("Every Night Every Morning.");
        everyNight.setDuracaoEmSegundos(200);
        everyNight.avaliar(8);
        everyNight.curtir();
        everyNight.reproduzir();

        Podcast flow = new Podcast();
        flow.setAoVivo();

    }
}
