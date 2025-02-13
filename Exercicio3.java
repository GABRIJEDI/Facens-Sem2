import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double[] notas = new double[4];
        int codigo;
        double resultado;

        notas[3] = 0;
        do {
            System.out.println("\nInsira o codigo do aluno: ");
            System.out.println("Ou insira 0 para sair.");
            codigo = scn.nextInt();

            if (codigo != 0) {
                System.out.println("Insira a primeira nota: ");
                notas[0] = scn.nextDouble();
                System.out.println("Insira a segunda nota: ");
                notas[1] = scn.nextDouble();
                System.out.println("Insira a terceira nota: ");
                notas[2] = scn.nextDouble();

                for (int i = 0; i < 3; i++) {
                    notas[3] += notas[i];
                }

                resultado = notas[3]/3;

                System.out.println("A media do aluno e: "+resultado);

            } else {
                System.out.println("Saindo...");
            }
        } while (codigo != 0);
    }
}