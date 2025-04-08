package exercicioRelacionamento;

import java.util.ArrayList;
import java.util.Scanner;

public class projetoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Membro> membros = new ArrayList<>();
        ArrayList<Projeto> projetos = new ArrayList<>();

        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Projetos!");

        // Criar membros da equipe
        System.out.print("Quantos membros deseja adicionar? ");
        int numMembros = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < numMembros; i++) {
            System.out.print("Digite o nome do membro " + (i + 1) + ": ");
            String nomeMembro = scanner.nextLine();
            membros.add(new Membro(nomeMembro, "Cargo " + (i + 1)));
        }

        // Criar projetos
        System.out.print("Quantos projetos deseja criar? ");
        int numProjetos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < numProjetos; i++) {
            System.out.print("Digite o nome do projeto " + (i + 1) + ": ");
            String nomeProjeto = scanner.nextLine();
            Projeto projeto = new Projeto(nomeProjeto, i + 1, new ArrayList<>());

            // Adicionar tarefas ao projeto
            System.out.print("Quantas tarefas deseja adicionar ao projeto '" + nomeProjeto + "'? ");
            int numTarefas = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            for (int j = 0; j < numTarefas; j++) {
                System.out.print("Digite o nome da tarefa " + (j + 1) + ": ");
                String nomeTarefa = scanner.nextLine();

                // Atribuir um membro à tarefa
                System.out.println("Escolha um membro para a tarefa:");
                for (int k = 0; k < membros.size(); k++) {
                    System.out.println((k + 1) + ". " + membros.get(k).getNome());
                }
                int membroEscolhido = scanner.nextInt() - 1;
                scanner.nextLine(); // Consumir a quebra de linha

                if (membroEscolhido >= 0 && membroEscolhido < membros.size()) {
                    Tarefa tarefa = new Tarefa(nomeTarefa, membros.get(membroEscolhido), nomeTarefa, membroEscolhido);
                    projeto.adicionarTarefa(tarefa);
                } else {
                    System.out.println("Membro inválido. Tarefa não atribuída.");
                }
            }

            projetos.add(projeto);
        }

        // Exibir os projetos e suas tarefas
        System.out.println("\nResumo dos Projetos:");
        for (Projeto projeto : projetos) {
            System.out.println("Projeto: " + projeto.getNomeProjeto() + " - ID: " + projeto.getId());
            for (Tarefa tarefa : projeto.getLstTarefas()) {
                System.out.println("  Tarefa: " + tarefa.getNome() + " - Responsável: " + tarefa.getMembroResponsavel() + " - Status: " + tarefa.getStatus());
            }
        }

        scanner.close();
    }
}