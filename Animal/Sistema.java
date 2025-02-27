package Animal;

public class Sistema {
    private String nome;
    private String tipo;
    private int idade;
    private int energia;
    private int felicidade;

    public Sistema(String nome, String tipo, int idade, int energia, int felicidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.energia = energia;
        this.felicidade = felicidade;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdade() {
        return idade;
    }

    public int getEnergia() {
        return energia;
    }

    public int getFelicidade() {
        return felicidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }

    public void Alimentar() {
        energia += 10;
    }

    public void Brincar() {
        energia -= 5;
        felicidade += 10;
    }

    public void Dormir() {
        energia = 100;
    }

    public String mostrarStatus() {

        return "\nOs status de " + nome + " Sao:" + "\nTipo: " + tipo + "\nEnergia: " + energia + "\nFelicidade: "
                + felicidade;
    }
}
