import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0, multiplic = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nInsira o numero:");
            numeros[i] = scn.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            soma += numeros[i];
            multiplic *= numeros[i];
        }
        System.out.println("Os numeros digitados sao: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("O resultado da soma desses numeros e: " + soma);
        System.out.println("O resultado da multiplicacao desses numeros e: " + multiplic);
    }
}