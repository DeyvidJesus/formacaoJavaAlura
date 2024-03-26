package curso2.desafios.br.com.aluraJava.parte04.ConversaoDolarReal;

public class Teste {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();

        conversor.setCotacaoReal(5.2);
        System.out.println(conversor.converterDolarParaReal(10));

    }
}
