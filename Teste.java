import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {

        Object[] options = { "Opção 1", "Opção 2", "Cancelar" };
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Título da Caixa",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        switch (escolha) {
            case 0:
                JOptionPane.showMessageDialog(null, "Você escolheu Opção 1");
                break;

            case 1:
                System.out.println("2");
                break;
        }
    }
}