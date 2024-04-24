import classes.Gasolina;

import java.util.Scanner;

public class Exercicio15{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Gasolina gas = new Gasolina();

        while(gas.custo != 0){
            System.out.println("Digite o custo: ");
            gas.custo = leitor.nextDouble();
            if(gas.custo == 0){
                break;
            }
            System.out.println("Qual o tipo de combustível?\n[1] - Álcool\n[2] - Gasolina\n[3] - Diesel");
            gas.comb = leitor.nextInt();

            switch(gas.comb){
                case 1: System.out.println("Valor do desconto: " + (gas.custo*0.25));
                System.out.println("Valor a ser pago: " + (gas.custo - (gas.custo*0.25)));
                gas.totdesc += (gas.custo*0.25);
                gas.totpago += (gas.custo - (gas.custo*0.25));
                break;
                case 2: System.out.println("Valor do desconto: " + (gas.custo*0.21));
                System.out.println("Valor a ser pago: " + (gas.custo - (gas.custo*0.21)));
                gas.totdesc += (gas.custo*0.21);
                gas.totpago += (gas.custo - (gas.custo*0.21));
                break;
                case 3: System.out.println("Valor do desconto: " + (gas.custo*0.14));
                System.out.println("Valor a ser pago: " + (gas.custo - (gas.custo*0.14)));
                gas.totdesc += (gas.custo*0.14);
                gas.totpago += (gas.custo - (gas.custo*0.14));
                break;
            }
        }

        System.out.println("Total de desconto: " + gas.totdesc);
        System.out.println("Total pago: " + gas.totpago);

        leitor.close();

    }
}



