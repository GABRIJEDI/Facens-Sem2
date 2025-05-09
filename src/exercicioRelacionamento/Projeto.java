package exercicioRelacionamento;

import java.util.ArrayList;

public class Projeto {
    private String nomeProjeto;
    private int id;
    private ArrayList<Tarefa> lstTarefas;

    public Projeto(String nomeProjeto, int id, ArrayList<Tarefa> lstTarefas) {
        this.nomeProjeto = nomeProjeto;
        this.id = id;
        this.lstTarefas = lstTarefas;
        lstTarefas = new ArrayList<>();
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Tarefa> getLstTarefas() {
        return lstTarefas;
    }

    public void setLstTarefas(ArrayList<Tarefa> lstTarefas) {
        this.lstTarefas = lstTarefas;
    }

    public void addTarefa(String descricao, Membro membro, String status){
        addTarefa(descricao, membro, status);
    }

    public void removerTarefa(int indice){
        if (indice >= 0 && indice < lstTarefas.size()) {
            lstTarefas.remove(indice);
            System.out.println("Tarefa removida com sucesso.");
        } else {
            System.out.println("Índice inválido. Nenhuma tarefa foi removida.");
        }
    }

    public void listarTarefas(){
        if (lstTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada para o projeto: " + nomeProjeto);
        } else {
            System.out.println("Tarefas do projeto: " + nomeProjeto);
            for (int i = 0; i < lstTarefas.size(); i++) {
                System.out.println(i + ": " + lstTarefas.get(i));
            }
        }
    }

    public String imprimir(){
        return "/nNome do projeto: "+nomeProjeto+"/nID do projeto: "+id+"/nLista de tarefas: "+lstTarefas;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarTarefa'");
    }
}
