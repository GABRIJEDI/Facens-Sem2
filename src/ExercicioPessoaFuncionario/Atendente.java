package ExercicioPessoaFuncionario;

public class Atendente extends Funcionario{
    private String setor, funcao;

    public Atendente() {
    }

    public Atendente(String nome, String cpf, int numeroCracha, double salario, String setor, String funcao) {
        super(nome, cpf, numeroCracha, salario);
        this.setor = setor;
        this.funcao = funcao;
    }

    public void bonificacao(){
        setSalario(getSalario()*0.15);
    }

    public String toString(){
        return super.toString()+"\nNumero Cracha:"+getNumeroCracha()+"\nSalario:"+getSalario()+"\nSetor: "+setor+"\nFuncao: "+funcao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    
}
