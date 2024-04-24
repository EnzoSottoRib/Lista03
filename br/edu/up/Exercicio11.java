package edu.up;
import classes.Pessoas;
import java.util.Scanner;

public class Exercicio11{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Pessoas pessoa = new Pessoas();

        for(int i=0; i<56; i++){
            System.out.println("Digite o nome: ");
            pessoa.nomes[i] = leitor.nextLine();
            System.out.println("Digite o sexo (M/F): ");
            pessoa.temp = leitor.nextLine();
            pessoa.sexo[i] = pessoa.temp;
            if(pessoa.temp.equals("m")|| pessoa.temp.equals("M")){
                pessoa.toth++;
            } else {
                pessoa.totm++;
            }
        }
        
        for(int i=0; i<56; i++){
            System.out.printf("\nNome: " + pessoa.nomes[i]);
            if(pessoa.sexo[i].equals("m") || pessoa.sexo[i].equals("M")){
                System.out.printf("\nSexo masculino");
            } else {
                System.out.printf("\nSexo feminino");
            }
            
        }

        System.out.println("\nTotal de homens: " + pessoa.toth);
        System.out.println("Total de mulheres: " + pessoa.totm);

        leitor.close();

    }
}



