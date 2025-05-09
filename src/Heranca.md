*AULA SOBRE HERANCA (Exemplo na AULA 06)

-tipo especial de associacao

-reutilizacao de codigo

-criar classe com base em uma ja existente



*SUPERCLASSE E SUBCLASSE:

-subclasse sao classes derivadas

-superclasse sao classes de origem

-a subclasse herdas das superclasses superiores, se professor e aluno precisa de cpf, n tem pq colocar cpf nos dois, cria uma superclasse pessoa com cpf pra usar em ambos

-se a info esta dupilicada(tem a mesma em duas classes diferentes) esta errado, criar uma superclasse

--public class pessoa
--public class aluno extends(pessoa)
--public class professor extends(pessoa)

--super() -> chama o construtor da superclasse

*OVERRIDE: 

-sobreescreve os dados de uma classe usando a superclasse

*POLIMORFISMO:

-capacidade de assumir varias formas de comportamento

-chama uma funcao e faz coisas diferentes

-Universal, Ad Hoc
--Vamos usar o 'Inclusao' do Universal

-Inclusao(quando existe Subtipo)

*instanceof --- terminar dps
--for (Pessoa p : lstpessoas){
    if(p isntanceoff : pessoa){
        sout
    }
}
