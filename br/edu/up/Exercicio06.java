package edu.up;

import classes.Mercadoria;

import java.util.Scanner;

public class Exercicio06{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        Mercadoria mercadoria = new Mercadoria();

        System.out.println("Digite o custo do produto: ");
        mercadoria.custo = leitor.nextDouble();

        System.out.println("Digite o percentual de acréscimo: ");
        mercadoria.perc = leitor.nextDouble();

        mercadoria.valven = mercadoria.custo + mercadoria.custo*(mercadoria.perc/100);

        System.out.println("O valor de venda será de: R$" + mercadoria.valven);

        leitor.close();

    }
}



