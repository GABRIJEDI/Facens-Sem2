package Aula02;

public class Ex1 {
    private String id = "Gabriel";
    private double saldo;
    double sacar, valor;

    public double getSaldo() {
        System.out.println("O seu saldo e: " + saldo);
        return saldo;
    }

    public String getId() {
        System.out.println(id);
        return id;
    }

    public void Sacar(double sacar) {
        if (sacar <= saldo) {
            this.saldo -= sacar;
        } else {
            System.out.println("Nao tem saldo suficiente");
        }
    }

    public void Valor(double valor) {
        this.saldo += valor;
    }
}
