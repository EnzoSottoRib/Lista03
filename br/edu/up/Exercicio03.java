package edu.up;

import java.util.Scanner;

import classes.Funcionario;

public class Exercicio03{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome: ");
        funcionario.nome = leitor.nextLine();

        System.out.println("Digite o salário fixo: ");
        funcionario.sal = leitor.nextDouble(); 

        System.out.println("Digite o total de vendas: ");
        funcionario.totv = leitor.nextDouble(); 

        System.out.println("Nome: " + funcionario.nome);

        System.out.println("Salário fixo: R$" + funcionario.sal);

        System.out.println("Salário final do mês: R$" + (funcionario.sal + (funcionario.totv*0.15)));

        leitor.close();

    }
}



