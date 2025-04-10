package tarefaAnimal;

public class Gato extends Animal{
    private int alturaSalto;

    public Gato() {
    }

    public Gato(String nome, int idade, int alturaSalto) {
        super(nome, idade);
        this.alturaSalto = alturaSalto;
    }

    public int getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(int alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    public String falar(){
        return "O gato "+super.getNome()+" faz Miau";
    }

    @Override
    public String imprimir(){
        String msg = super.imprimir()+"\nA altura que o gato pula e: "+alturaSalto;
        return msg;
    }
}
