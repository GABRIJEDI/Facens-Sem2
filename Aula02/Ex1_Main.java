package Aula02;

import java.util.Scanner;

public class Ex1_Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int selecionar;
        Ex1 conta;
        double depositar, sacar;
        conta = new Ex1();

        System.out.println("\nBem vindo " + conta.getId());
        System.out.println("Qual acao deseja fazer?");

        do {
            System.out.println("(1)Ver saldo; (2)Depositar; (3)Sacar ou (0) para encerrar");
            selecionar = scn.nextInt();
            switch (selecionar) {
                case 1:
                    System.out.println(conta.getSaldo());
                    break;

                case 2:
                    System.out.println("Quanto gostaria de adicionar?");
                    depositar = scn.nextDouble();
                    conta.Valor(depositar);
                    break;

                case 3:
                    System.out.println("Quanto gostaria de sacar?");
                    sacar = scn.nextDouble();
                    conta.Sacar(sacar);
                    break;

                default:
                    selecionar = 0;
                    break;
            }
        } while (selecionar != 0);
        scn.close();
    }
}
