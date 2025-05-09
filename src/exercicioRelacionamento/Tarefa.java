package exercicioRelacionamento;

public class Tarefa {
    private String descricao, membroResponsavel, status;

    private int id;

    public Tarefa(String descricao, Membro membroResponsavel, String status, int id) {
        this.descricao = descricao;
        this.membroResponsavel = membroResponsavel.getNome();
        this.status = status;
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getMembroResponsavel() {
        return membroResponsavel;
    }


    public void setMembroResponsavel(String membroResponsavel) {
        this.membroResponsavel = membroResponsavel;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String imprimir(){
        return "/nDescricao da atividade: "+descricao+"/nNome do responsavel: "+membroResponsavel+"/Status da tarefa: "+status;
    }

    public String getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
}
