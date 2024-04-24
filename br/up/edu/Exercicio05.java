import classes.Compra;

import java.util.Scanner;

public class Exercicio05{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        Compra compra = new Compra();


        System.out.println("Digite o valor da compra: ");
        compra.val = leitor.nextDouble();

        System.out.println("Cada prestação custará: R$" + compra.val/5);

        leitor.close();

    }
}



