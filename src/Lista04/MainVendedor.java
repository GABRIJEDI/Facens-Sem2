package Lista04;

import javax.swing.JOptionPane;

public class MainVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        int codigo, escolha;
        double percentual, venda, desconto;
        String nome;

        JOptionPane.showMessageDialog(null,"Exercicio Lista 04, vendedor");

        do{
            escolha = Integer.parseInt(JOptionPane.showInputDialog("O que gostaria de fazer?\n(1) Cadastrar o vendedor\n(2)Calcular venda\n(3)Sair"));
            
            switch(escolha){
                case 1:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual o codigo do Funcionario?"));
                    vendedor.setCodigo(codigo);
                    nome = JOptionPane.showInputDialog("Qual o nome do Funcionario?");
                    vendedor.setNome(nome);
                    percentual = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual de comissao do funcionario?"));
                    vendedor.setPercentualComissao(percentual);

                    break;
                
                case 2:
                    venda = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da venda?"));
                    desconto = Double.parseDouble(JOptionPane.showInputDialog("Qual o desconto da venda?"));

                    if(desconto == 0){
                        vendedor.pagamentoComissao(venda);
                        JOptionPane.showMessageDialog(null, vendedor.imprimir(venda));
                    } else{
                        vendedor.pagamentoComissao(venda);
                        vendedor.pagamentoComissao(venda, desconto);
                        JOptionPane.showMessageDialog(null, vendedor.imprimir(venda, desconto));
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null,"Aperte OK para encerrar");
                    escolha = 3;
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Valor Invalido. Aperte OK para retornar");
                    break;
            }
        }while(escolha != 3);
    }
}