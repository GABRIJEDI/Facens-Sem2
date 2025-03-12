package Aula04;

public class Exemplo2Classe {
    private String nome;
    private int nota1;
    private int nota2;

    public Exemplo2Classe(String nome, int nota1, int nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter and Setter for nota1
    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    // Getter and Setter for nota2
    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public double calculaNota(){
        return this.nota1*0.30 + nota2*0.45;
    }

    public double calculaNota(int nota1){
        return nota1*0.30 + nota2*0.45;
    }

    public double calculaNota(int nota1, int nota2){
        return nota1 + nota2;
    }
}
