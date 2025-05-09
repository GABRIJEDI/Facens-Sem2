package ExercicioAluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Funcoes aluno;
        aluno = new Funcoes();
        String nome, ra, curso;

        System.out.println("\nExercicio Aluno (Aula 02)");

        System.out.println("Insira o nome do aluno");
        nome = scn.nextLine();
        aluno.setNome(nome);

        System.out.println("Insira o RA do aluno:");
        ra = scn.nextLine();
        aluno.setRa(ra);

        System.out.println("Insira o curso do aluno:");
        curso = scn.nextLine();
        aluno.setCurso(curso);

        System.out.println("\nOs dados do aluno sao:");
        System.out.println(aluno.imprimir());

        scn.close();
    }
}