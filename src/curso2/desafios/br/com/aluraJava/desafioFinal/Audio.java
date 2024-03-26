package curso2.desafios.br.com.aluraJava.desafioFinal;

public class Audio implements Avaliavel, Curtivel {
    private String titulo;
    private int duracaoEmSegundos;
    private int totalReproducoes;
    private boolean curtiu;
    private double avaliacoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracao) {
        this.duracaoEmSegundos = duracao;
    }

    private int totalAvaliacoes;

    public boolean getCurtiu() {
        return curtiu;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public double getAvaliacoes() {
        return avaliacoes;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração Em Minutos: " + duracaoEmSegundos / 60);
        System.out.println("Total De Reproduções: " + totalReproducoes);
        if (curtiu) {
            System.out.println("Você curtiu esse aúdio!");
        }
        System.out.println("Esse aúdio possui " + avaliacoes + " de nota. Com um total de " + totalAvaliacoes + " avaliações.");
    }

    @Override
    public void avaliar(double avaliacao) {
        totalAvaliacoes++;
        this.avaliacoes += avaliacao / totalAvaliacoes;
    }

    @Override
    public void curtir() {
        curtiu = true;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo agora: " + titulo + " 🎶🎶🎶🎶");
        totalReproducoes++;
    }
}
