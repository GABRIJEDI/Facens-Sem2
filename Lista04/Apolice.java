package Lista04;

public class Apolice {
    private String nome;
    private int numero, idade;
    private char sexo;
    private double valorAutomovel;

    public Apolice() {

    }

    public Apolice(int numero, int idade, String nome, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public double calcularValor() {
        if (sexo == 'M' && idade <= 25) {
            return valorAutomovel * 10 / 100;
        } else if (sexo == 'M' && idade > 25) {
            return valorAutomovel * 5 / 100;
        } else {
            return valorAutomovel * 2 / 100;
        }
    }

    public String imprimir() {
        return "\nNumero: " + numero + "\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo
                + "\nValor Automovel: " + valorAutomovel + "\nValor do seguro: " + calcularValor();
    }
}