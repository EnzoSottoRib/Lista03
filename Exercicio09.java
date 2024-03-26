import classes.Numeros;

import java.util.Scanner;

public class Exercicio09{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        Numeros numeros = new Numeros();


        for(int i=0; i<80; i++){
            System.out.println("Digite o número: ");
            numeros.num = leitor.nextDouble();
            if(numeros.num >= 10 && numeros.num <= 150){
                numeros.flag++;
            }
        }
        
        System.out.println("Ao final foram " + numeros.flag + " números entre 10 e 150");

        leitor.close();

    }
}



