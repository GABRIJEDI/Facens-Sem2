package Animal;

import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Sistema animal = new Sistema(null, null, 0, 100, 100);
        String nome, tipo;
        int escolha, idade;

        System.out.println("\nOla bem vindo");
        System.out.println("Vamos registar seu animal primeiro!");
        System.out.println("Qual o nome do seu animal?");
        nome = scn.nextLine();
        animal.setNome(nome);
        System.out.println("E qual o tipo do seu animal?");
        tipo = scn.nextLine();
        animal.setTipo(tipo);
        System.out.println("E por ultimo... Qual a idade de " + nome + "?");
        idade = scn.nextInt();
        animal.setIdade(idade);

        System.out.println("Otimo! Agora vamos começar a cuidar do seu animal!");

        do {
            System.out.println("\nO que gostaria de fazer com " + nome + "?");
            System.out.println("(1) Alimentar!");
            System.out.println("(2) Brincar!");
            System.out.println("(3) Dormir!");
            System.out.println("(4) Ver Status!");
            System.out.println("\n(0) Encerrar o programa.");
            escolha = scn.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Que legal! Vamos alimetar " + nome + " Com a comida favorita dele!!");
                    if (animal.getEnergia() >= 100) {
                        System.out
                                .println("\n" + nome + " ja esta cheio... tente alimeta lo depois de brincar com ele!");
                    } else {
                        animal.Alimentar();
                    }
                    break;
                case 2:
                    System.out.println("" + nome + " Vai amar brincar com vc! Mas ele pode ficar cansado!");
                    if (animal.getEnergia() <= 5) {
                        System.out.println("\n" + nome
                                + " Esta muito cansado para brincar... Alimente ele ou coloque ele para dormir!");
                    } else {
                        animal.Brincar();
                    }
                    break;
                case 3:
                    System.out
                            .println("Ja esta na hora de dormir? Tudo bem, vamos colocar " + nome + " Para descansar!");
                    animal.Dormir();
                    break;
                case 4:
                    System.out.println("Claro. Os status de " + nome + " sao:");
                    System.out.println(animal.mostrarStatus());
                    System.out.println("Digite algo para continuar");
                    scn.nextLine();
                    break;
                case 0:
                    escolha = 0;
                    break;
                default:
                    System.out.println("Ops... clicou errado? escolha outra opcao!");
                    break;
            }
        } while (escolha != 0);
        scn.close();
    }
}
