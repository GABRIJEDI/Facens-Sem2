package ExercicioPessoaFuncionario;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicioMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int escolha, numeroCracha, codigo;
        String nome, cpf, ra, setor, funcao, urlLattes;
        double salario = 0;
        Disciplina dis = null;
        Professor prof;
        Atendente aten;
        Aluno alu;
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        ArrayList<Disciplina> lstDisciplinas = new ArrayList<>();

        System.out.println("\nExercicio Pessoa/Funcionario");

        do {
            System.out.println("\nO que gostaria de fazer?");
            System.out.println("1 inserir disciplina");
            System.out.println("2 inserir professor");
            System.out.println("3 inserir atendente");
            System.out.println("4 inserir aluno");
            System.out.println("5 inserir disciplina ao professor");
            System.out.println("6 mostrar pessoas");
            System.out.println("7 mostrar disciplinas");
            System.out.println("8 aplicar bonificacao");
            System.out.println("9 sair");
            escolha = scn.nextInt();
            scn.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("qual o nome da disciplina?");
                    nome = scn.nextLine();
                    System.out.println("Qual o codigo da disciplina?");
                    codigo = scn.nextInt();
                    scn.nextLine();

                    dis = new Disciplina(codigo, nome);
                    lstDisciplinas.add(dis);
                    break;

                case 2:
                    System.out.println("qual o nome do professor?");
                    nome = scn.nextLine();
                    System.out.println("Qual o cpf do professor?");
                    cpf = scn.nextLine();
                    System.out.println("Qual o numero de cracha do professor?");
                    numeroCracha = scn.nextInt();
                    scn.nextLine();
                    System.out.println("Qual o salario?");
                    salario = scn.nextDouble();
                    scn.nextLine();
                    System.out.println("Qual o url Lattes?");
                    urlLattes = scn.nextLine();
                    prof = new Professor(nome, cpf, numeroCracha, salario, urlLattes);
                    lstPessoas.add(prof);
                    break;

                case 3:
                    System.out.println("qual o nome do atendente?");
                    nome = scn.nextLine();
                    System.out.println("Qual o cpf do atendente?");
                    cpf = scn.nextLine();
                    System.out.println("Qual o numero de cracha do atendente?");
                    numeroCracha = scn.nextInt();
                    scn.nextLine();
                    System.out.println("Qual o salario do atendente?");
                    salario = scn.nextDouble();
                    scn.nextLine();
                    System.out.println("qual o setor?");
                    setor = scn.nextLine();
                    System.out.println("qual a funcao?");
                    funcao = scn.nextLine();

                    aten = new Atendente(nome, cpf, numeroCracha, salario, setor, funcao);
                    lstPessoas.add(aten);
                    break;

                case 4:
                    System.out.println("qual o nome do aluno?");
                    nome = scn.nextLine();
                    System.out.println("Qual o cpf do aluno?");
                    cpf = scn.nextLine();
                    System.out.println("Qual o ra do aluno?");
                    ra = scn.nextLine();
                    System.out.println("Qual o codigo da disciplina do aluno?");
                    codigo = scn.nextInt();
                    scn.nextLine();

                    for (Disciplina disciplina : lstDisciplinas) {
                        if (disciplina.getCodigo() == codigo) {
                            dis = disciplina;

                            alu = new Aluno(nome, cpf, ra, dis);
                            lstPessoas.add(alu);
                        } else {
                            System.out.println("codigo invalido");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Qual o codigo da disciplina?");
                    codigo = scn.nextInt();
                    scn.nextLine();
                    System.out.println("Qual o cracha do professor? (num)");
                    numeroCracha = scn.nextInt();
                    scn.nextLine();

                    for (Disciplina disciplina : lstDisciplinas) {
                        if (disciplina.getCodigo() == codigo) {
                            dis = disciplina;
                        }
                    }

                    for (Pessoa pessoa : lstPessoas) {
                        if (pessoa instanceof Professor) {
                            Professor profTmp = ((Professor) pessoa);
                            if (profTmp.getNumeroCracha() == numeroCracha) {
                                profTmp.addDisciplina(dis);
                            }
                        }
                    }

                    break;

                case 6:
                    for (Pessoa p : lstPessoas) {
                        System.out.println(p.toString());
                    }
                    break;

                case 7:
                    for (Disciplina d : lstDisciplinas) {
                        System.out.println(d.toString());
                    }
                    break;

                case 8:
                    System.out.println("Qual o cracha do funcionario?");
                    numeroCracha = scn.nextInt();

                    for (Pessoa pessoa : lstPessoas) {
                        if (pessoa instanceof Professor) {
                            Professor profTmp = ((Professor) pessoa);
                            if (profTmp.getNumeroCracha() == numeroCracha) {
                                ((Professor) pessoa).bonificacao();
                            }
                        }

                        else if (pessoa instanceof Atendente) {
                            Atendente atentmp = ((Atendente) pessoa);
                            if (atentmp.getNumeroCracha() == numeroCracha) {
                                ((Atendente) pessoa).bonificacao();
                            }
                        }

                        else if (pessoa instanceof Funcionario) {
                            Funcionario functmp = ((Funcionario) pessoa);
                            if (functmp.getNumeroCracha() == numeroCracha) {
                                ((Funcionario) pessoa).bonificacao(numeroCracha, salario);
                                ;
                            }
                        }

                    }
                    break;

                case 9:
                    System.out.println("\nSaindo");
                    escolha = 9;
                    break;
            }
        } while (escolha != 9);

        scn.close();
    }
}
