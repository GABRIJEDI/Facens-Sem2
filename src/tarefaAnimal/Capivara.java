package tarefaAnimal;

public class Capivara extends Animal {
    private int peso;

    public Capivara() {
    }

    public Capivara(String nome, int idade, int peso) {
        super(nome, idade);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String falar(){
        return "A capivara "+super.getNome()+" faz Tralalero Tralala";
    }

    @Override
    public String imprimir(){
        String msg = super.imprimir()+"\nO peso da capivara e: "+peso;
        return msg;
    }
}
