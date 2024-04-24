package edu.up;

import classes.Exercito;

import java.util.Scanner;

public class Exercicio13{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Exercito exct = new Exercito();

        int n = 0;

        System.out.println("Quantidade de pessoas: ");
        n = leitor.nextInt();

        String nomes[] = new String[n];

        String sexo[] = new String[n];

        int idades[] = new int[n];

        String saude[] = new String[n];

        leitor.nextLine();

        for(int i=0; i<n; i++){
            System.out.println("Digite o nome: ");
            nomes[i] = leitor.nextLine();

            System.out.println("Digite o sexo (M/F): ");
            sexo[i] = leitor.nextLine();

            System.out.println("Digite a idade: ");
            idades[i] = leitor.nextInt();

            leitor.nextLine();

            System.out.println("Digite o estado de saúde (bom/ruim): ");
            saude[i] = leitor.nextLine();
        }

        for(int i=0; i<n; i++){
            if(sexo[i].equalsIgnoreCase("f") || idades[i] < 18 || idades[i] > 45 || saude[i].equalsIgnoreCase("ruim")){
                System.out.println( nomes[i] + " é inapto(a) para cumprir o serviço militar obrigatório!");
                exct.inaptos++;
            } else{
                System.out.println( nomes[i] + " é apto para cumprir o serviço militar obrigatório!");
                exct.aptos++;
            }
        }

        System.out.println("Total de pessoas: " + n);
        System.out.println("Total de aptos: " + exct.aptos);
        System.out.println("Total de inaptos: " + exct.inaptos);

        leitor.close();
    }
}



