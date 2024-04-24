package edu.up;
import classes.Mercadoria;

import java.util.Scanner;

public class Exercicio14{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Mercadoria mcd = new Mercadoria();

        for(int i=0; i<3; i++){
            System.out.println("Digite o custo: ");
            mcd.custo = leitor.nextDouble();
            mcd.mediac += mcd.custo;

            System.out.println("Digite o preço de venda: ");
            mcd.venda = leitor.nextDouble();
            mcd.mediav += mcd.venda;

            mcd.res[i] = (mcd.venda - mcd.custo);
        }

        for(int i=0; i<3; i++){
            if(mcd.res[i] < 0){
                System.out.println("O produto " + (i + 1) + " deu prejuízo!");
            } else if(mcd.res[i] == 0){
                System.out.println("O produto " + (i + 1) + " deu empate!");
            } else{
                System.out.println("O produto " + (i + 1) + " deu lucro!");
            }
        }

        System.out.printf("Média do preço de custo: %.2f", mcd.mediac/3);
        System.out.printf("\nMédia do preço de venda: %.2f", mcd.mediav/3);

        leitor.close();

    }
}



