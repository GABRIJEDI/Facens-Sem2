package aula03;

public class Produto {
    private String nome;
    private double valor;
    private int qtd;

    public Produto(String nome, double valor, int qtd){
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void setQtd(int qtd){
        this.qtd = qtd;
    }

    public String getNome(){
        return nome;
    }
    public double getValor(){
        return valor;
    }
    public int getQtd(){
        return qtd;
    }

    public String imprimir(){
        return "\nNome: "+this.nome+"\nO valor e: "+this.valor+"\nA quantidade e: "+this.qtd;
    }
}
