package br.com.aluraJava.desafios.parte04.ConversaoDolarReal;

public class ConversorMoeda implements ConversaoFinanceira{
    private double cotacaoReal = 4.75;
    public double getCotacaoReal() {
        return cotacaoReal;
    }

    public void setCotacaoReal(double cotacaoReal) {
        this.cotacaoReal = cotacaoReal;
    }
    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * cotacaoReal;
    }
}
