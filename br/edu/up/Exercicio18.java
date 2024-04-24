package edu.up;
import classes.Pessoas;

import java.util.Scanner;

public class Exercicio18{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Pessoas pessoa = new Pessoas();

            System.out.println("Digite o nome: ");
            pessoa.nome = leitor.nextLine();
            
            System.out.println("Digite a idade: ");
            pessoa.idade = leitor.nextInt();
            leitor.nextLine();

            System.out.println("Digite o sexo (M/F): ");
            pessoa.sexop = leitor.nextLine();

            System.out.println("Digite o salário: ");
            pessoa.sal = leitor.nextDouble();

            System.out.println("Funcionário(a): " + pessoa.nome);

            if(pessoa.sexop.equalsIgnoreCase("m")){
                if(pessoa.idade < 30){
                    System.out.println("Salário acrescido do abono: R$" + (pessoa.sal + 50));
                } else {
                    System.out.println("Salário acrescido do abono: R$" + (pessoa.sal + 100));
                }
                
            } else{
                if(pessoa.idade < 30){
                    System.out.println("Salário acrescido do abono: R$" + (pessoa.sal + 80));
                } else{
                    System.out.println("Salário acrescido do abono: R$" + (pessoa.sal + 200));
                }
            }
        leitor.close();
    }
}



