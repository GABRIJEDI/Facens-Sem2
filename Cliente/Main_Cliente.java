package Cliente;

import java.util.Scanner;

public class Main_Cliente {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String nome, cpf, idade;
        int clientes;

        System.out.println("\nExercicio cliente (Aula 02)");
        System.out.println("Quantos clientes serao cadastrados?");
        clientes = scn.nextInt();
        scn.nextLine();
        Cliente[] cliente = new Cliente[clientes];

        for (int i = 0; i < clientes; i++) {
            cliente[i] = new Cliente();

            System.out.println("\nInsira o nome do cliente: ");
            nome = scn.nextLine();
            cliente[i].setNome(nome);

            System.out.println("Insira o CPF do cliente: ");
            cpf = scn.nextLine();
            cliente[i].setCPF(cpf);

            System.out.println("Insira a idade do cliente: ");
            idade = scn.nextLine();
            cliente[i].setIDade(idade);
        }

        System.out.println("Insira o CPF do cliente que deseja visualizar: ");
        cpf = scn.nextLine();
        for (int i = 0; i < clientes; i++) {
            if (cliente[i].getCPF().equals(cpf)) {
                System.out.println("\nOs dados do cliente sao:");
                System.out.println(cliente[i].imprimir());
            }
        }
        scn.close();
    }
}