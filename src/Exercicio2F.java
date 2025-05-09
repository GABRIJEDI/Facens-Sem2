import java.util.Scanner;

public class Exercicio2F {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double num = 0, conta = 0;

        System.out.println("\nInsira o numero");
        num = scn.nextDouble();

        Par(conta, num);

        scn.close();
    }

    public static void Par(Double conta, double num) {
        conta = num % 2;

        if (conta == 0) {
            System.out.println("\nPAR");
        } else {
            System.out.println("\nIMPAR");
        }
    }
}