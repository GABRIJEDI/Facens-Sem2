import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] numeros = new int[2];
        int calculo = 0, media = 0, total = 0, teste = 0;

        numeros[0] = 0;
        numeros[1] = 0;
        do {
            System.out.println("\nInsira o numero: ");
            teste = scn.nextInt();
            if (teste % 2 == 0) {
                numeros[0] = teste;
                System.out.println("Par");
                media++;
                calculo = numeros[0] + numeros[1];
                total = calculo / media;
            } else {
                System.out.println("Impar");
            }
            System.out.println("A soma de: " + numeros[0] + " e: " + numeros[1] + " e igual a: " + calculo);
            System.out.println("A media e: " + total);
            System.out.println("Insira o proximo numero: ");
            teste = scn.nextInt();
            if (teste % 2 == 0) {
                numeros[1] = teste;
                System.out.println("Par");
                calculo = numeros[0] + numeros[1];
                media++;
                total = calculo / media;
            } else {
                System.out.println("Impar");
            }
            System.out.println("A soma de: " + numeros[0] + " e: " + numeros[1] + " e igual a: " + calculo);
            System.out.println("A media e: " + total);
        } while (total > 0);
    }
}