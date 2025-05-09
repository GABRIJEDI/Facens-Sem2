package tarefaAnimal;

public class Cachorro extends Animal{
    private int velocidade;

    public Cachorro() {
    }

    public Cachorro(String nome, int idade, int velocidade) {
        super(nome, idade);
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String falar(){
        return "O cachorro "+super.getNome()+" faz Auau";
    }

    @Override
    public String imprimir(){
        String msg = super.imprimir()+"\nA velocidade do cachorro e: "+velocidade;
        return msg;
    }
}
