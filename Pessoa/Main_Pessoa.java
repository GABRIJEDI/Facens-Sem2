package Pessoa;

import java.util.Scanner;

public class Main_Pessoa {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String cpf, nome;
        char sexo;
        int idade, escolha;
        Pessoa pessoa = null;

        System.out.println("\nAtividade pessoa (aula 03)");

        do {
            System.out.println("O que gostaria de fazer?");
            System.out.println("(1) Criar pessoa");
            System.out.println("(2) Mostrar dados da pessoa");
            System.out.println("(3) Sair");
            escolha = scn.nextInt();
            scn.nextLine();

            switch (escolha) {
                case 1:
                    pessoa = new Pessoa();
                    System.out.println("Qual o CPF da pessoa?");
                    cpf = scn.nextLine();
                    pessoa.setCPF(cpf);
                    System.out.println("Qual o nome da pessoa?");
                    nome = scn.nextLine();
                    pessoa.setNome(nome);
                    System.out.println("Qual o sexo da pessoa? (F) para feminino e (M) para masculino");
                    sexo = scn.next().charAt(0); // Eu ia fazer um vetor com loop pra salvar todas as letras, mas fiquei
                                                 // com preguiça :/
                    pessoa.setSexo(sexo);
                    System.out.println("Qual a idade da pessoa?");
                    idade = scn.nextInt();
                    pessoa.setIdade(idade);
                    break;
                case 2:
                    System.out.println(pessoa.imprimir());
                    break;
                case 3:
                    System.out.println("Saindo...");
                    escolha = 3;
                    break;
                default:
                    System.out.println("Escolha invalida");
                    break;
            }
        } while (escolha != 3);
        scn.close();
        ;
    }
}
