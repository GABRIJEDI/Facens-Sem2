package Animal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Sistema animal = new Sistema(null, null, 0, 100, 100);
        String nome, tipo;
        int escolha, idade;

        JOptionPane.showMessageDialog(null, "Bem Vindo.\nVamos registar seu animal primeiro!");
        nome = JOptionPane.showInputDialog("Qual o nome do seu animal?");
        animal.setNome(nome);
        tipo = JOptionPane.showInputDialog("E qual o tipo do seu animal?");
        animal.setTipo(tipo);
        idade = Integer.parseInt(JOptionPane.showInputDialog("E por ultimo... Qual a idade de " + nome + "?"));
        animal.setIdade(idade);

        JOptionPane.showMessageDialog(null, "Otimo! Agora vamos começar a cuidar do seu animal!");

        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("O que gostaria de fazer com " + nome + "?" +
                    "\n(1) Alimentar!" +
                    "\n(2) Brincar!" +
                    "\n(3) Dormir!" +
                    "\n(4) Ver Status!" +
                    "\n\n(0) Encerrar o programa."));

            switch (escolha) {
                case 1:
                    JOptionPane.showMessageDialog(null,
                            "Que legal! Vamos alimentar " + nome + " com a comida favorita dele!!");
                    if (animal.getEnergia() >= 100) {
                        JOptionPane.showMessageDialog(null,
                                "\n" + nome + " ja esta cheio... tente alimeta lo depois de brincar com ele!");
                    } else {
                        animal.Alimentar();
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,
                            "" + nome + " vai amar brincar com vc! Mas ele pode ficar cansado!");
                    if (animal.getEnergia() <= 5) {
                        JOptionPane.showMessageDialog(null, "\n" + nome
                                + " esta muito cansado para brincar... Alimente ele ou coloque ele para dormir!");
                    } else {
                        animal.Brincar();
                    }
                    break;
                case 3:
                    if (animal.getEnergia() == 100) {
                        JOptionPane.showMessageDialog(null,
                                "" + nome + " esta cheio de energia! canse ele antes de dormir!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ja esta na hora de dormir? Tudo bem, vamos colocar " + nome
                                + " Para descansar!");
                        animal.Dormir();
                        JOptionPane.showMessageDialog(null, ""+nome+" esta descansado e pronto para brincar mais!");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, animal.mostrarStatus());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa!");
                    escolha = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ops... clicou errado? escolha outra opcao!");
                    break;
            }
        } while (escolha != 0);
        scn.close();
    }
}
