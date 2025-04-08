package Aula05;
//exemplo agregacao
public class frotaMain {
    public static void main(String[] args) {
        frota frota1 = new frota("Frota x");

        nave nav1 = new nave("appo");
        nave nav2 = new nave("XORR");

        frota1.addNave(nav1);
        frota1.addNave(nav2);
    }
}
