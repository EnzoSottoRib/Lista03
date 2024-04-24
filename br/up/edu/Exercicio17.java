import classes.Aumentos;

import java.util.Scanner;

public class Exercicio17{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Aumentos aum = new Aumentos();

        
            System.out.println("Digite o nome: ");
            aum.nome = leitor.nextLine();

            System.out.println("Digite o salário: ");
            aum.sal2 = leitor.nextDouble();

            System.out.println("Digite o valor do salário mínimo: ");
            aum.salmin = leitor.nextDouble();
            leitor.nextLine();

            System.out.println("Funcionário: " + aum.nome);

            

            if(aum.sal2 < aum.salmin*3){
                System.out.println("Reajuste de R$" + aum.sal2*0.5);
                System.out.println("O novo salário será de R$" + (aum.sal2 + (aum.sal2*0.5)));
                System.out.println("A empresa aumentará em R$" + aum.sal2*0.5 + " sua folha de pagamento");
            } else if(aum.sal2 >= aum.salmin*3 && aum.sal2 < aum.salmin*10){
                System.out.println("Reajuste de R$" + aum.sal2*0.2);
                System.out.println("O novo salário será de R$" + (aum.sal2 + (aum.sal2*0.2)));
                System.out.println("A empresa aumentará em R$" + aum.sal2*0.2 + " sua folha de pagamento");
            } else if(aum.sal2 >= aum.salmin*10 && aum.sal2 < aum.salmin*20){
                System.out.println("Reajuste de R$" + aum.sal2*0.15);
                System.out.println("O novo salário será de R$" + (aum.sal2 + (aum.sal2*0.15)));
                System.out.println("A empresa aumentará em R$" + aum.sal2*0.15 + " sua folha de pagamento");
            } else{
                System.out.println("Reajuste de R$" + aum.sal2*0.1);
                System.out.println("O novo salário será de R$" + (aum.sal2 + (aum.sal2*0.1)));
                System.out.println("A empresa aumentará em R$" + aum.sal2*0.1 + " sua folha de pagamento");
            }
        
        leitor.close();
    }
}