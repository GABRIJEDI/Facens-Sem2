package Funcionario;

public class Funcionario{
    private int codigo;
    private double salario;
    private String nome, setor, funcao;
    
    public Funcionario(int codigo, double salario, String nome, String setor, String funcao) {
        this.codigo = codigo;
        this.salario = salario;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
    }

    public Funcionario() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String imprimir(){
        return "\nO codigo do funcionario e: "+codigo+"\nO nome e: "+nome+"\nO setor e: "+setor+"\nA funcao e: "+funcao+"\nO salario e: "+salario;
    }
}