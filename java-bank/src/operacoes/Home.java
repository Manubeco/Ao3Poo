package src.operacoes;

import java.util.Scanner;

public class Home {

    public static void main(String[] args) {
     Conta Fabiano = new Conta(5122,2236500,2000.99);

        Scanner input = new Scanner(System.in);
        double saque = input.nextDouble();
        
        Fabiano.sacar(saque);
    };
}
