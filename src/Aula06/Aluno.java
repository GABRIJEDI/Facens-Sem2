package Aula06;

public class Aluno extends Pessoa {
    private String ra;
    private float nota1, nota2;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String ra) {
        super(nome, cpf);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float media(){
        return (nota1 + nota2)/2;
    }

    @Override
    public String imprimir(){
        String msg = super.imprimir()+"\nCPF: "+getCpf()+"\nRA: "+ra+"\nMedia: "+media();

        return msg;
    }
}
