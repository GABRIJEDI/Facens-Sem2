package aula03;

public class Aluno {
    private String cpf;
    private String nome;
    private int idade;

    public Aluno(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public String setCPF(String cpf) {
        return this.cpf = cpf;
    }

    public String getCPF() {
        return this.cpf;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int setIdade(int idade) {
        return this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public String Imprimir() {
        return "\nCPF: " + this.cpf + "\nNome: " + this.nome + "\nIdade: " + this.idade;
    }
    
}
