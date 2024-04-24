package edu.up;
import classes.Lados;

import java.util.Scanner;

public class Exercicio19{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Lados lado = new Lados();

        System.out.println("Digite o valor 1: ");
        lado.a = leitor.nextInt();
            
        System.out.println("Digite o valor 2: ");
        lado.b = leitor.nextInt();

        System.out.println("Digite o valor 3: ");
        lado.c = leitor.nextInt();

        if(lado.a + lado.b < lado.c || lado.a + lado.c < lado.b || lado.b + lado.c < lado.a){
            System.out.println("Não é possível formar um triângulo!");
        } else if(lado.a == lado.b && lado.b == lado.c){
            System.out.println("Forma um triângulo equilátero e isóscele!");
        } else if(lado.a != lado.b && lado.b != lado.c){
            System.out.println("Formar um tirângulo escaleno!");
        } else{
            System.out.println("Formam um triângulo isóscele!");
        }

         
        leitor.close();
    }
}




