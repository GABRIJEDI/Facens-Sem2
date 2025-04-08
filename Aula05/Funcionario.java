package Aula05;

import java.util.ArrayList;

//Exemplo relacao unaria
public class Funcionario{
    private String nome;
    private ArrayList<Funcionario> lstsubordinado;

    public Funcionario(String nome) {
        this.nome = nome;

        lstsubordinado = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addSubordinado(Funcionario func){
        lstsubordinado.add(func);
    }
    
}