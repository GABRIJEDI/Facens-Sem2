package Aula05;

//exemplo binaria (parece com agregacao tbm)
public class socioMain {
    public static void main(String[] args) {
        Socio soc1 = new Socio("Fabio");

        Dependente dep1 = new Dependente("Joao");
        Dependente dep2 = new Dependente("Maria");
        Dependente dep3 = new Dependente("Jose");

        soc1.addDependente(dep1);
        soc1.addDependente(dep2);
        soc1.addDependente(dep3);


    }
}
