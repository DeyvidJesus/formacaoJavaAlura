package curso2.desafios.br.com.aluraJava.parte03.banco;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public void sacar(double saque) {
        saldo -= saque;
    }

    public double consultarSaldo() {
        return saldo;
    }
}