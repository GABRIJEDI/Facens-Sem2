package Cliente;

public class Cliente {
    private String cpf;
    private String nome;
    private String idade;
    String imprimir;

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIDade(String idade) {
        this.idade = idade;
    }

    public String imprimir() {
        return "CPF: " + cpf + "\nNome: " + nome + "\nIdade: " + idade;
    }
}