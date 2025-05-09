package ExercicioAlunoPlus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String nome, ra, curso;
        int alunos;

        System.out.println("\nExercicio Aluno melhorado (Aula 02)");
        System.out.println("Quantos alunos serao cadastrados?");
        alunos = scn.nextInt();
        scn.nextLine();
        Funcao[] aluno = new Funcao[alunos];

        for (int i = 0; i < alunos; i++) {
            aluno[i] = new Funcao();

            System.out.println("\nInsira o nome do aluno");
            nome = scn.nextLine();
            aluno[i].setNome(nome);

            System.out.println("Insira o RA do aluno:");
            ra = scn.nextLine();
            aluno[i].setRa(ra);

            System.out.println("Insira o curso do aluno:");
            curso = scn.nextLine();
            aluno[i].setCurso(curso);
        }

        System.out.println("Insira o RA do aluno que deseja visualizar");
        ra = scn.nextLine();
        for (int i = 0; i < alunos; i++) {
            if (aluno[i].getRa().equals(ra)) {
                System.out.println("\nOs dados dos alunos sao:");
                System.out.println(aluno[i].imprimir());
            }
        }
        scn.close();
    }
}