package curso2.desafios.br.com.aluraJava.parte04.TabuadaMultiplicacao;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostratTabuada(int numero) {
        for (int i = 0; i <= 15; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
    }
}
