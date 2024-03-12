package br.com.aluraJava.desafios.parte03.banco;

public class ContaCorrente extends ContaBancaria {
    public void cobrarTarifaMensal() {
        this.saldo -= 10;
    }
}
