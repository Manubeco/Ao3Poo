package src.operacoes;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero, double saldo) {
        super(agencia, numero, saldo);
    }
    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.setSaldo(super.getSaldo() + valor);
    }



}
