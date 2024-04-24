package edu.up;
import classes.Pessoas;

import java.util.Scanner;

public class Exercicio23{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Pessoas pessoa = new Pessoas();

        System.out.println("Digite o nome: ");
        pessoa.nome = leitor.nextLine();

        System.out.println("Digite o sexo (M/F): ");
        pessoa.sexop = leitor.nextLine();

        System.out.println("Digite a altura: ");
        pessoa.altura = leitor.nextDouble();

        System.out.println("Nome: " + pessoa.nome);

        if(pessoa.sexop.equalsIgnoreCase("f")){
            if(pessoa.altura > 1.50){
                System.out.println("Peso ideal: " + ((62.1*pessoa.altura) - 44.7));
            } else {
                if(pessoa.idade < 35){
                    System.out.println("Peso ideal: " + ((62.1*pessoa.altura) - 49));
                } else{
                    System.out.println("Peso ideal: " + ((62.1*pessoa.altura) - 45));
                }
            }
        } else{
            if(pessoa.altura > 1.70){
                if(pessoa.idade <= 20){
                    System.out.println("Peso ideal: " + ((72.7*pessoa.altura) - 58));
                } else if(pessoa.idade >= 21 && pessoa.idade <= 39){
                    System.out.println("Peso ideal: " + ((72.7*pessoa.altura) - 53));
                } else{
                    System.out.println("Peso ideal: " + ((72.7*pessoa.altura) - 45));
                }
            } else{
                if(pessoa.idade <= 40){
                    System.out.println("Peso ideal: " + ((72.7*pessoa.altura) - 50));
                } else{
                    System.out.println("Peso ideal: " + ((72.7*pessoa.altura) - 58));
                }
            }
        }

        leitor.close();
    }
}




