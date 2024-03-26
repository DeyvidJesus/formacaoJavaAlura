package curso2.desafios.br.com.aluraJava.desafioFinal;

public class Musica extends Audio {
    private String cantor;
    private String banda;
    private String letra;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração Em Minutos: " + getDuracaoEmSegundos() / 60);
        System.out.println("Cantor: " + cantor);
        if (!banda.isEmpty()) {
            System.out.println("Banda: " + banda);
        }
        System.out.println("Total De Reproduções: " + getTotalReproducoes());
        if (getCurtiu()) {
            System.out.println("Você curtiu essa música!");
        }
        if (!letra.isEmpty()) {
            System.out.println("Letra da música: " + letra);
        }
        System.out.println("Essa música possui " + getAvaliacoes() + " de nota. Com um total de " + getTotalAvaliacoes() + " avaliações.");
    }
}
