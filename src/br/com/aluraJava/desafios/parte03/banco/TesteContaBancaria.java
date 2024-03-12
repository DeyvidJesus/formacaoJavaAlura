package br.com.aluraJava.desafios.parte03.banco;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();

        cc.depositar(100);
        cc.sacar(40);
        cc.cobrarTarifaMensal();
        System.out.println(cc.consultarSaldo());
    }
}
