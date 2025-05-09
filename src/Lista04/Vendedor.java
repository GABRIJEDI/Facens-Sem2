package Lista04;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;
    double valorVenda, desconto;

    public Vendedor(){

    }
    public Vendedor(int codigo,String nome,double percentualComissao){
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
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
    public double getPercentualComissao() {
        return percentualComissao;
    }
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public double pagamentoComissao(double valorVenda){
        return valorVenda * percentualComissao / 100;
    }
    public double pagamentoComissao(double valorVenda, double desconto){
        return pagamentoComissao(valorVenda) - desconto;
    }

    public String imprimir(){
        return "\nCodigo: "+codigo+"\nNome: "+nome+"\nPercentual de comissao: "+percentualComissao;
    }

    public String imprimir(double valorVenda){
        return "\nCodigo: "+codigo+"\nNome: "+nome+"\nValor da venda: "+valorVenda+"\nPercentual de comissao: "+percentualComissao+"\nValor a pagar: "+pagamentoComissao(valorVenda);
    }

    public String imprimir(double valorVenda, double desconto){
        return "\nCodigo: "+codigo+"\nNome: "+nome+"\nValor da venda: "+valorVenda+"\nPercentual de comissao: "+percentualComissao+"\nDesconto: "+desconto+"\nValor a pagar: "+pagamentoComissao(valorVenda);
    }
}
