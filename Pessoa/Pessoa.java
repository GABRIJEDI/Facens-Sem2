package Pessoa;

public class Pessoa {
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;

    public String getCPF() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String imprimir() {
        return "\nO CPF de " + nome + " e: " + cpf + "\nO sexo: " + sexo + "\nE a idade: " + idade;
    }
}