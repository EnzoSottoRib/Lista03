package edu.up;
import classes.Luz;

import java.util.Scanner;

public class Exercicio22{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Luz luz = new Luz();

        System.out.println("Digite a quantidade de KW/h gastos: ");
        luz.kwh = leitor.nextDouble();

        System.out.println("Digite o tipo de cliente\n[1] - Residência\n[2] - Comércio\n[3] - Indústria");
        luz.tipo = leitor.nextInt();

        switch(luz.tipo){
            case 1: System.out.println("A conta de luz custará: R$" + (luz.kwh*0.6));
            break;
            case 2: System.out.println("A conta de luz custará: R$" + (luz.kwh*0.48));
            break;
            case 3: System.out.println("A conta de luz custará: R$" + (luz.kwh*1.29));
            break;
        }

        leitor.close();
    }
}




