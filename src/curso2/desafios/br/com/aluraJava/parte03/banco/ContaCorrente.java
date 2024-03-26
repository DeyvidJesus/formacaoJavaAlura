package curso2.desafios.br.com.aluraJava.parte03.banco;

public class ContaCorrente extends ContaBancaria {
    public void cobrarTarifaMensal() {
        this.saldo -= 10;
    }
}
