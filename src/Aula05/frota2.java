package Aula05;

import java.util.ArrayList;

//exemplo agregacao
//e fraco, pode apagar o principal mas o objeto relacionado continua vivo
public class frota2 {
    private String nome;
    private ArrayList<nave> lstnaves;

    public frota2(String nome) {
        this.nome = nome;
        lstnaves = new ArrayList<>();
    }
    //sem get e set pra ser mais pratico
    public void addNave(String nome){
        nave2 tmp = new nave2(nome);
    }

}
