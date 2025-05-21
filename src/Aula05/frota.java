package Aula05;

import java.util.ArrayList;

//exemplo agregacao
//e fraco, pode apagar o principal mas o objeto relacionado continua vivo
public class frota {
    private String nome = ;
    private ArrayList<nave> lstnaves;

    public frota(String nome) {
        this.nome = nome;
        lstnaves = new ArrayList<>();
    }
    //sem get e set pra ser mais pratico
    public void addNave(nave nave){
        addNave(nave);
    }

}
