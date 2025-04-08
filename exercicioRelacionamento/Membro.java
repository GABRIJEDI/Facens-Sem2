package exercicioRelacionamento;

public class Membro {
    private String nome, cargo;

    public Membro(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String imprimir(){
        return "/nO nome do funcionario e: "+nome+"/nE o cargo e: "+cargo;
    }
}
