import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] numeros = new int[2];
        int calculo, media = 0, total;

        numeros[0] = 0;
        numeros[1] = 0;
        do {
            System.out.println("\nInsira o numero: ");
            numeros[0] = scn.nextInt();
            media++;
            calculo = numeros[0] + numeros[1];
            total = calculo / media;

            System.out.println("A soma de: " + numeros[0] + " e: " + numeros[1] + " e igual a: " + calculo);
            System.out.println("A media e: " + total);

            System.out.println("Insira o proximo numero: ");
            numeros[1] = scn.nextInt();
            calculo = numeros[0] + numeros[1];
            media++;
            total = calculo / media;

            System.out.println("A soma de: " + numeros[0] + " e: " + numeros[1] + " e igual a: " + calculo);
            System.out.println("A media e: " + total);
        } while (total > 0);

        scn.close();
    }

}