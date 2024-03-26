
import classes.Dinheiro;

import java.util.Scanner;

public class Exercicio04{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        Dinheiro dinheiro = new Dinheiro();

        System.out.println("Digite o valor da cotação do dólar: ");
        dinheiro.cot = leitor.nextDouble();

        System.out.println("Digite a quantidade de dólares disponíveis: ");
        dinheiro.dol = leitor.nextDouble(); 

        dinheiro.real = dinheiro.dol * dinheiro.cot;

        System.out.println("" + dinheiro.dol + " dólares em reais são: R$" + dinheiro.real);

        leitor.close();

    }
}



