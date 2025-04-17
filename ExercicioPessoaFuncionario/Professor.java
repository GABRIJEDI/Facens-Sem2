package ExercicioPessoaFuncionario;

import java.util.ArrayList;

public class Professor extends Funcionario{
    private String urlLattes;
    private ArrayList<Disciplina> lstDisciplina = new ArrayList<>();
    
    public Professor() {
    }

    public Professor(String nome, String cpf, int numeroCracha, double salario, String urlLattes) {
        super(nome, cpf, numeroCracha, salario);
        this.urlLattes = urlLattes;
    }

    public String getUrlLattes() {
        return urlLattes;
    }

    public void setUrlLattes(String urlLattes) {
        this.urlLattes = urlLattes;
    }

    public ArrayList<Disciplina> getLstDisciplina() {
        return lstDisciplina;
    }

    public void setLstDisciplina(ArrayList<Disciplina> lstDisciplina) {
        this.lstDisciplina = lstDisciplina;
    }

    public void bonificacao(){
        setSalario(getSalario()*2);
    }

    public String toString(){
        return super.toString()+"\nNumero Cracha:"+getNumeroCracha()+"\nSalario:"+getSalario()+"\nUrl: "+urlLattes;
    }

    public void addDisciplina(Disciplina disciplina){
        addDisciplina(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina){
    }
    
}
