package ExercicioPessoaFuncionario;

import java.util.ArrayList;

public class Disciplina extends Pessoa{
    private int codigo;
    private String nome;
    private ArrayList<Aluno> lstAlunos = new ArrayList<>();
    
    public Disciplina() {
    }

    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getLstAlunos() {
        return lstAlunos;
    }

    public void setLstAlunos(ArrayList<Aluno> lstAlunos) {
        this.lstAlunos = lstAlunos;
    }

    public void addAluno(Aluno aluno){
        addAluno(aluno);
    }

    public void removeAluno(Aluno aluno){
    }

    public String toString(){
        return "\nCodigo: "+codigo+"\nNome: "+nome;
    }


}
