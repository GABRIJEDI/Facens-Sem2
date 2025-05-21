package Estatico;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João");
        Pessoa pessoa2 = new Pessoa("Maria");

        System.out.println("Nome da pessoa 1: " + pessoa1.getNome());
        System.out.println("Nome da pessoa 2: " + pessoa2.getNome());

        pessoa1.setContador(2);

        pessoa1.mostrarTotalPessoas();
    }
}
