package src.operacoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Conta> ListaPoupanca = new ArrayList<>();
        ArrayList <Conta> ListaCorrentes = new ArrayList<>();

        System.out.println("Selecione o tipo de conta que deseja abrir: ");
        System.out.println("Ditie 1 para conta corrente"+"\n"+"Ditite 2 para conta poupanca");
        int tipoConta=input.nextInt();

        System.out.println("Ditie o numero da agencia: ");
        int agencia = input.nextInt();

        System.out.println("Ditie o numero da conta: ");
        int numero = input.nextInt();

        System.out.println("Ditie o saldo da conta: ");
        double saldo = input.nextDouble();


        if (tipoConta == 1){Conta conta1 = new ContaCorrente(agencia,numero,saldo);
            ListaCorrentes.add (conta1);
            System.out.println(ListaCorrentes);


            System.out.println("Deseja sacar?"+"\n"+"Digite 1 para sim e 2 para nao.");
            int respostaSaque = input.nextInt();

            if (respostaSaque == 1) {
                System.out.println("Digite quanto deseja sacar: ");
                double saque = input.nextDouble();

                conta1.sacar(saque);
            } else {
                System.out.println("Fim da operacao");}}

        else if (tipoConta == 2){Conta conta1 = new ContaCorrente(agencia,numero,saldo);
            ListaPoupanca.add(conta1);
            System.out.println(ListaPoupanca);

            System.out.println("Deseja sacar?"+"\n"+"Digite 1 para sim e 2 para nao.");
            int respostaSaque = input.nextInt();

            if (respostaSaque == 1) {
                System.out.println("Digite quanto deseja sacar: ");
                double saque = input.nextDouble();

                conta1.sacar(saque);
            } else {
                System.out.println("Fim da operacao");}
        }

    }

}

