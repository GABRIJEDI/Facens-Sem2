package ExercicioAluno;

public class Funcoes {
    private String ra;
    private String nome;
    private String curso;
    String imprimir;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String imprimir() {
        return "RA: " + ra + "\nNome: " + nome + "\nCurso: " + curso;
    }
}