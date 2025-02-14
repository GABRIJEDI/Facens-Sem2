import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double[][] pesquisa = new double[1000][3];
        double idadeMulher = 0, alturaMulher = 0, qtdMulher = 0, idadeHomem = 0, qtdHomem = 0, pessoas18e35 = 0;
        double[] medias = new double[4];// mediaIdade[0], mediaAturaF[1], mediaIdadeH[2], porcentIDade[3]
        int sexo = 0;

        for (int i = 0; i < 1000; i++) {
            System.out.println("\nQual o sexo? (1)-Feminino ou (2)-Masculino");
            sexo = scn.nextInt();

            if (sexo == 1 || sexo == 2) {
                pesquisa[i][0] = sexo;

                System.out.println("Qual a idade?");
                pesquisa[i][1] = scn.nextDouble();

                System.out.println("Qual a altura?");
                pesquisa[i][2] = scn.nextDouble();

                if (pesquisa[i][0] == 1) {
                    idadeMulher += pesquisa[i][1];
                    alturaMulher += pesquisa[i][2];
                    qtdMulher++;
                } else if (pesquisa[i][0] == 2) {
                    idadeHomem += pesquisa[i][1];
                    qtdHomem++;
                } else {
                    System.out.println("Valor invalido");
                }

                if (pesquisa[i][1] >= 18 && pesquisa[i][1] <= 35) {
                    pessoas18e35++;
                }
            } else {
                System.out.println("valor invalido");
                i--;
            }
        }
        medias[0] = (idadeMulher + idadeHomem) / 1000;
        medias[1] = alturaMulher / qtdMulher;
        medias[2] = idadeHomem / qtdHomem;
        medias[3] = (pessoas18e35 / 1000) * 100;

        System.out.println("A media da idade do grupo e: " + medias[0]);
        System.out.println("A media de altura das mulheres e: " + medias[1]);
        System.out.println("A media de idade dos homens e: " + medias[2]);
        System.out.println("O percentual de pessoas entre 18 e 35 anos e: " + medias[3]);
    }
}