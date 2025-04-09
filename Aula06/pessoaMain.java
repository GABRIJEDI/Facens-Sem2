package Aula06;

import java.util.ArrayList;

public class pessoaMain {
    public static void main(String[] args) {
        Aluno alu = new Aluno("Jao", "1552", "22222");
        Aluno alu1 = new Aluno("Bia", "1452", "2242");
        Aluno alu2 = new Aluno("Gabriel", "1852", "223322");
        Professor prof = new Professor("Pedro", "44545", "5555j", 'C', 1500);

        ArrayList<Pessoa> lstPessoas = new ArrayList<>();

        lstPessoas.add(alu); //alu foi adicionado no array do Pessoas, entao os dados de alu estao salvos. Num for iria adicionar todas as infos como alu
        lstPessoas.add(alu);
        lstPessoas.add(alu1);
        lstPessoas.add(alu2);
        lstPessoas.add(prof);

        for(Pessoa p : lstPessoas){ //p vai virar alu e prof que estao salvos no array Pessoas. tem que ter a funcao imprimir na classe aluno e na professor
            if(p instanceof Professor){ //vai mostrar so o professor
                System.out.println(p.imprimir());
            }
        }
    }
}
