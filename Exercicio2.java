import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] candidatos = new int[6];
        int escolha;

        do {
            System.out.println("\nEleicao");
            System.out.println("Selecione o candidato:");
            System.out.println("(1)Joao; (2)Ana; (3)Jose; (4)Carlos; (5)Nulo e (6)Em branco");
            System.out.println("Finalizar votos: pressione (0)");
            escolha = scn.nextInt();

            switch (escolha) {

                case 1:
                    System.out.println("Voto no candidato Joao");
                    candidatos[0]++;
                    break;

                case 2:
                    System.out.println("Voto na candidata Ana");
                    candidatos[1]++;
                    break;

                case 3:
                    System.out.println("Voto na candidata Jose");
                    candidatos[2]++;
                    break;

                case 4:
                    System.out.println("Voto na candidata Carlos");
                    candidatos[3]++;
                    break;

                case 5:
                    System.out.println("Voto Nulo");
                    candidatos[4]++;
                    break;

                case 6:
                    System.out.println("Voto em branco");
                    candidatos[5]++;
                    break;

                default:
                    System.out.println("erro");
                    break;
            }
        } while (escolha != 0);

        System.out.println("O resultado foi o seguinte:");
        System.out.println("O Total de votos em Joao foi: " + candidatos[0]);
        System.out.println("O Total de votos em Ana foi: " + candidatos[1]);
        System.out.println("O Total de votos em Jose foi: " + candidatos[2]);
        System.out.println("O Total de votos em Carlos foi: " + candidatos[3]);
        System.out.println("O Total de votos nulos foi: " + candidatos[4]);
        System.out.println("O Total de votos em branco foi: " + candidatos[5]);

        scn.close();
    }
}
