package Aula04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade")); //Integer para converter a entrada, pq o JOption retorna String
        Double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor")); //Para double

        System.out.println("\nNome: "+nome);
        System.out.println("\nIdade: "+idade);
        System.out.println("\nValor: "+valor);
        scn.close();
    }
}