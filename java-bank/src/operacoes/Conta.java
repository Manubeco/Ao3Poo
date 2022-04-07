package src.operacoes;

import src.pessoas.Cliente;

import java.util.Scanner;

public abstract class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        System.out.println("Nova conta criada " + this.numero+"\n");
    }

        public void sacar(double saque) {
            try {
                saldo -= saque;
                if (saldo < 0) {
                    throw new NumberFormatException("Saldo negativo");
                }
                System.out.println("Voce sacou: " + saque + "reais");
                System.out.printf("Seu novo saldo e: " + saldo + " reais");
            } catch (NumberFormatException e){

                System.out.println("Saldo insuficiente");
                }
        };


    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saca(valor)) {
        		destino.deposita(valor);
        		return true;
        } else {
        		return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("O valor deve ser maior do que zero");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("O valor deve ser maior do que zero");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
