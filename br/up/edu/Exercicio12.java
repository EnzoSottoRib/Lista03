import classes.VendaCarro;

import java.util.Scanner;

public class Exercicio12{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        VendaCarro vc = new VendaCarro();

        while(vc.flag == 0){
            System.out.println("Digite o valor do carro: ");
            vc.valor = leitor.nextDouble();

            System.out.println("Digite o ano do carro: ");
            vc.ano = leitor.nextInt();

            vc.totcar++;

            if(vc.ano <= 2000){
                vc.desc = vc.valor*0.12;
                vc.tot2k++;
            } else{
                vc.desc = vc.valor*0.07;
            }

            System.out.println("Valor do desconto: " + vc.desc);
            System.out.println("Valor a ser pago: " + (vc.valor - vc.desc));
            
            leitor.nextLine();
            System.out.println("Deseja continuar?[S/N]: ");
            vc.resp = leitor.nextLine();
            if(vc.resp.equals("n") || vc.resp.equals("N")){
                vc.flag++;
            }
        };

        System.out.println("\nTotal de carros até 2000: " + vc.tot2k);
        System.out.println("Total de carros: " + vc.totcar);

        leitor.close();

    }
}
