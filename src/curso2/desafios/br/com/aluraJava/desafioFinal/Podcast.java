package curso2.desafios.br.com.aluraJava.desafioFinal;

public class Podcast extends Audio{
    private String apresentador;
    private String descricao;
    private boolean aoVivo;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAoVivo() {
        return aoVivo;
    }

    public void setAoVivo() {
        System.out.println("Podcast ao vivo!");
        this.aoVivo = true;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Descrição: " + descricao);
        System.out.println("Duração Em Minutos: " + getDuracaoEmSegundos() / 60);
        System.out.println("Apresentador: " + apresentador);
        if (aoVivo) {
            System.out.println("Esse podcast está rolando agora!");
        }
        System.out.println("Total De Reproduções: " + getTotalReproducoes());
        if (getCurtiu()) {
            System.out.println("Você curtiu essa música!");
        }
        System.out.println("Essa música possui " + getAvaliacoes() + " de nota. Com um total de " + getTotalAvaliacoes() + " avaliações.");
    }
}
