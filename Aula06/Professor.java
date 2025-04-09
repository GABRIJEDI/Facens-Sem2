package Aula06;

public class Professor extends Pessoa{
    private String cracha;
    private char tipoVinculo;
    private float salario;

    public Professor() {
    }

    public Professor(String nome, String cpf, String cracha, char tipoVinculo, float salario) {
        super(nome, cpf);
        this.cracha = cracha;
        this.tipoVinculo = tipoVinculo;
        this.salario = salario;
    }

    @Override
    public String imprimir(){
        String msg = super.imprimir()+"\nCracha: "+cracha+"\nTipo de vinculo: "+tipoVinculo+"\nsalario: "+salario;

        return msg;
    }
}
