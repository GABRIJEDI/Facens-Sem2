import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double[][] pessoas = new double[7][2];
        int acima90 = 0, idade = 0;

        for(int i=0; i<7; i++){
            System.out.println("\nInsira a idade da pessoa: ");
            pessoas[i][0] = scn.nextDouble();

            System.out.println("Insira o peso da pessoa: ");
            pessoas[i][1] = scn.nextDouble();
        }

        for(int i=0; i<7; i++){
            if(pessoas[i][1] > 90){
                acima90++;
            }
            idade += pessoas[i][0];
        }
        idade = idade / 7;

        System.out.println("O total de pessoas acima de 90kgs e: "+acima90);
        System.out.println("A media de idade das pessoas e: "+idade);
    }
}