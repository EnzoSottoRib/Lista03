package edu.up;
import classes.Aumentos;

import java.util.Scanner;

public class Exercicio16{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Aumentos aum = new Aumentos();

        for(int i=0; i<584; i++){
            System.out.println("Digite o nome: ");
            aum.nomes[i] = leitor.nextLine();

            System.out.println("Digite o salário: ");
            aum.sal[i] = leitor.nextDouble();
            leitor.nextLine();

            if(aum.sal[i] < 1412*3){
                System.out.println("O novo salário de " + aum.nomes[i] + " será de R$" + (aum.sal[i] + (aum.sal[i]*0.5)));
            } else if(aum.sal[i] >= 1412*3 && aum.sal[i] < 1412*10){
                System.out.println("O novo salário de " + aum.nomes[i] + " será de R$" + (aum.sal[i] + (aum.sal[i]*0.2)));
            } else if(aum.sal[i] >= 1412*10 && aum.sal[i] < 1412*20){
                System.out.println("O novo salário de " + aum.nomes[i] + " será de R$" + (aum.sal[i] + (aum.sal[i]*0.15)));
            } else{
                System.out.println("O novo salário de " + aum.nomes[i] + " será de R$" + (aum.sal[i] + (aum.sal[i]*0.1)));
            }
        }
        leitor.close();
    }
}



