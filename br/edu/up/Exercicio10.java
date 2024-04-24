package edu.up;
import classes.Idades;

import java.util.Scanner;

public class Exercicio10{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Idades idade = new Idades();

        for(int i=0; i<5; i++){
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            idade.idades[i] = leitor.nextInt();
        }
        
        for(int i=0; i<5; i++){
            if(idade.idades[i] >= 18){
                System.out.println("Pessoa " + (i + 1) + " é maior de idade!");
            } else{
                System.out.println("Pessoa " + (i + 1) + " é menor de idade!");
            }
        }

        leitor.close();

    }
}



