package Aula04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Exemplo2Classe alu = new Exemplo2Classe("fabio", 9, 8);
        
        JOptionPane.showMessageDialog(null, "Nota:"+alu.calculaNota());
        JOptionPane.showMessageDialog(null, "Nota:"+alu.calculaNota(10));
        JOptionPane.showMessageDialog(null, "Nota:"+alu.calculaNota(10,8));
        scn.close();
    }
}