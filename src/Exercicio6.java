import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] numerosPar = new int[10];
        int[] numerosImpar = new int[10];
        int teste = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o numero: ");
            teste = scn.nextInt();
            numeros[i] = teste;

            if (teste % 2 == 0) {
                numerosPar[i] = teste;
            } else if (teste % 2 != 0) {
                numerosImpar[i] = teste;
            } else {
                System.out.println("valor invalido");
            }
        }

        System.out.println("Os numeros sao: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("Os numeros pares sao: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(numerosPar[i]);
        }

        System.out.println("Os numeros impar sao: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(numerosImpar[i]);
        }
        scn.close();
    }
}