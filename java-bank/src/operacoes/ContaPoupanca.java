package src.operacoes;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero, double saldo) {
        super(agencia, numero, saldo);
    }

    @Override
    public void deposita(double valor) {
        setSaldo(getSaldo() + valor);
    }

}


