package tarefaAnimal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class animalMain {
    public static void main(String[] args) {
        ArrayList<Animal> lstAnimais = new ArrayList<>();
        Cachorro cao;
        Gato gato = new Gato(null, 0, 0);
        Capivara cap = new Capivara(null, 0, 0);
        int escolha, escolha2, idade, velocidade, alturaSalto, peso;
        Object[] interacoes = { "Cadastrar", "Mostrar dados", "Animal falando", "Encerrar" };
        Object[] interacoes2 = { "Cachorro", "Gato", "Capivara" };
        String nome;

        JOptionPane.showMessageDialog(null, "\"Tarefa Animal (Aula 06)\"");

        do {
            escolha = JOptionPane.showOptionDialog(null, "O que gostaria de fazer?", "Painel de escolha",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, interacoes, interacoes[0]);

            switch (escolha) {

                case 0:
                    escolha2 = JOptionPane.showOptionDialog(null, "Qual o animal que gostaria de cadastrar?",
                            "Painel de escolha do animal",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, interacoes2,
                            interacoes2[0]);

                    nome = JOptionPane.showInputDialog("Qual o nome do animal?");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do animal?"));

                    switch (escolha2) {
                        case 0:
                            velocidade = Integer
                                    .parseInt(JOptionPane.showInputDialog("Qual a velocidade do cachorro?"));

                            cao = new Cachorro(nome, idade, velocidade);
                            lstAnimais.add(cao);
                            break;

                        case 1:
                            alturaSalto = Integer
                                    .parseInt(JOptionPane.showInputDialog("Qual a altura que o gato pula?"));

                            gato = new Gato(nome, idade, alturaSalto);
                            lstAnimais.add(gato);
                            break;

                        case 2:
                            peso = Integer.parseInt(JOptionPane.showInputDialog("Qual o peso da capivara?"));

                            cap = new Capivara(nome, idade, peso);
                            lstAnimais.add(cap);
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Opcao Invalida");
                            break;
                    }
                    break;

                case 1:
                    for (Animal p : lstAnimais) {
                        JOptionPane.showMessageDialog(null, p.imprimir(), p.getNome(),
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 2:
                    for (Animal p : lstAnimais) {
                        JOptionPane.showMessageDialog(null, p.falar(), p.getNome(),
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Encerrando");
                    escolha = 4;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida");
                    break;
            }
        } while (escolha != 4);
    }
}
