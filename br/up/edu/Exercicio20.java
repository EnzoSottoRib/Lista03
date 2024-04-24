import classes.Professor;

import java.util.Scanner;

public class Exercicio20{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Professor prf = new Professor();

        System.out.println("Digite o nível do professor: ");
        prf.nivel = leitor.nextInt();
            
        System.out.println("Digite quantas horas de aula: ");
        prf.horas = leitor.nextInt();

        switch(prf.nivel){
            case 1: System.out.println("O professor deve receber R$" + (12*prf.horas));
            break;
            case 2: System.out.println("O professor deve receber R$" + (17*prf.horas));
            break;
            case 3: System.out.println("O professor deve receber R$" + (25*prf.horas));
            break;
        } 
        leitor.close();
    }
}




