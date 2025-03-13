package Lista04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainApolice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Apolice pessoa = new Apolice();
        int numero, idade, escolha;
        String nome, sexoC;
        char sexo;
        double valorAutomovel;

        JOptionPane.showMessageDialog(null, "Exercicio Apolice Lista 04");

        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    "O que gostaria de fazer?\n(1) Criar apolice;\n(2) Ver dados da apolice;\n(3) Sair"));

            switch (escolha) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Insira os dados para criar a apolice");
                    sexoC = JOptionPane.showInputDialog("Digite o seu sexo (F) feminino ou (M)Masculino");
                    sexo = sexoC.toUpperCase().charAt(0);
                    pessoa.setSexo(sexo);
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
                    pessoa.setNumero(numero);
                    System.out.println("Nome: ");
                    nome = JOptionPane.showInputDialog("Digite o nome");
                    pessoa.setNome(nome);
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
                    pessoa.setIdade(idade);
                    valorAutomovel = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do automovel"));
                    pessoa.setValorAutomovel(valorAutomovel);

                    pessoa.calcularValor();
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, pessoa.imprimir());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Aperte OK para encerrar.");
                    escolha = 3;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Entrada invalida. Aperte OK para retornar");
                    break;
            }
        } while (escolha != 3);
        scn.close();
    }
}