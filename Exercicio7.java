import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double media, cod, aumento, valor;

        System.out.println("\nInsira o codigo do produto: ");
        cod = scn.nextDouble();

        while (cod > 0) {
            System.out.println("Insira o preco do produto: ");
            valor = scn.nextDouble();

            aumento = valor * 1.20;

            media = valor + aumento / 2;

            System.out.println("O produto com o codigo: " + cod + "Tem o antigo valor de: " + valor
                    + " Com o acrecimo de 20% e igual a: " + aumento
                    + " A media entre esses valores e igual a: " + media);

            System.out.println("\nInsira o codigo do produto: ");
            cod = scn.nextDouble();
        }
    }
}