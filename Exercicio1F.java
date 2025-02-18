import java.util.Scanner;

public class Exercicio1F {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double resultado = 0, num1 = 0, num2 = 0;
        int operador = 0;

        System.out.println("\nInsira o primeiro numero: ");
        num1 = scn.nextDouble();
        System.out.println("Insira o segundo numero: ");
        num2 = scn.nextDouble();
        System.out.println("Insira a operacao desejada: ");
        System.out.println("(1) soma; (2) subtracao; (3) multiplicacao; (4) divisao");
        operador = scn.nextInt();

        conta(num1, num2, resultado, operador);
    }

    public static void conta(double num1, double num2, double resultado, int operador) {

        switch (operador) {

            case 1:
                resultado = num1 + num2;
                break;

            case 2:
                resultado = num1 - num2;
                break;

            case 3:
                resultado = num1 * num2;
                break;

            case 4:
                resultado = num1 / num2;
                break;

            default:
                System.out.println("Valor invalido");
                break;
        }
        System.out.println("O resultado e: " + resultado);
    }
}