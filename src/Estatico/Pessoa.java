package Estatico;

public class Pessoa {
    private String nome;
    private static int contador;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setContador(int contador) {
        Pessoa.contador = contador;
    }

    public void mostrarTotalPessoas() {
        System.out.println("Total de pessoas: " + contador);
    }
}