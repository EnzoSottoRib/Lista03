import classes.Custo;

import java.util.Scanner;

public class Exercicio07{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Custo custo = new Custo();

        System.out.println("Digite o custo de fábrica do carro: ");
        custo.custo = leitor.nextDouble();

        custo.custocons = custo.custo + (custo.custo*0.45);
        custo.custocons = custo.custocons + (custo.custocons*0.28);

        System.out.printf("O custo ao consumidor será de: R$%.2f", custo.custocons);

        leitor.close();

    }
}



