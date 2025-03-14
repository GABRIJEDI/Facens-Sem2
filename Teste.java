import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {

        Object[] options = {"banana", "Opção 2", "Cancelar"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha uma opção:",
            "Título da Caixa",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );
    }
}