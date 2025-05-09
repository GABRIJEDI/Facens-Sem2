package Aula05;

//Exemplo relacao unaria
public class funcionarioMain{
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Fabio");
        Funcionario func2 = new Funcionario("Eliney");
        Funcionario func3 = new Funcionario("Joao");

        func2.addSubordinado(func1);
        func2.addSubordinado(func3);
    }
}