package Funcionario;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class FuncionarioMain {
    public static void main(String[] args) {
        Object[] interacoes = { "Cadastrar", "Mostrar todas Infos", "Procurar Funcionario", "Encerrar" };
        ArrayList<Funcionario> lstFuncionarios = new ArrayList<Funcionario>();
        int codigo, escolha;
        double salario;
        String nome, setor, funcao;

        JOptionPane.showMessageDialog(null, "Exercicio Funcionario (Aula 05)");

        do {
            escolha = JOptionPane.showOptionDialog(null, "O que gostaria de fazer?", "Condigo Funcionario", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, interacoes, interacoes[0]);

            switch (escolha) {
                case 0:
                    Funcionario dados = new Funcionario();
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo do funcionario (Numero):"));
                    dados.setCodigo(codigo);

                    nome = JOptionPane.showInputDialog("Insira o nome:");
                    dados.setNome(nome);

                    setor = JOptionPane.showInputDialog("Insira o setor:");
                    dados.setSetor(setor);

                    funcao = JOptionPane.showInputDialog("Insira a funcao:");
                    dados.setFuncao(funcao);

                    salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salario do funcionario: "));
                    dados.setSalario(salario);

                    lstFuncionarios.add(dados);
                    break;

                case 1:
                    if (lstFuncionarios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Sem funcionarios cadastrados");
                        return;
                    } else {
                        for (Funcionario dado : lstFuncionarios) {
                            JOptionPane.showMessageDialog(null, dado.imprimir());
                        }
                    }

                    break;

                case 2:
                    if (lstFuncionarios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Sem funcionarios cadastrados");
                        return;
                    } else {
                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo do funcionario: "));
                        for (Funcionario dado : lstFuncionarios) {
                            if (dado.getCodigo() == codigo) {
                                JOptionPane.showMessageDialog(null, dado.imprimir());
                            }
                        }
                    }
                    break;

                case 3:
                JOptionPane.showMessageDialog(null, "Encerrando");
                    escolha = 3;
            }
        } while (escolha != 3);
    }
}
