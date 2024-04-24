package edu.up;
import classes.Aluno;

import java.util.Scanner;

public class Exercicio25{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome: ");
        aluno.nome = leitor.nextLine();

        System.out.println("Digite o número de matrícula: ");
        aluno.matricula = leitor.nextInt();

        System.out.println("Digite a nota 1: ");
        aluno.nota1 = leitor.nextDouble();

        System.out.println("Digite a nota 2: ");
        aluno.nota2 = leitor.nextDouble();

        System.out.println("Digite a nota 3: ");
        aluno.nota3 = leitor.nextDouble();

        aluno.media = (((aluno.nota1 * 2) + (aluno.nota2 * 3) + (aluno.nota3 * 5))/(2 + 3 + 5));

        System.out.println("Estudante: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Nota final: " + aluno.media);
        if(aluno.media <= 10 && aluno.media >= 8){
            System.out.println("Classificação A!");
        } else if(aluno.media < 8 && aluno.media >= 7){
            System.out.println("Classificação B!");
        } else if(aluno.media < 7 && aluno.media >= 6){
            System.out.println("Classificação C!");
        } else if(aluno.media < 6 && aluno.media >= 5){
            System.out.println("Classificação D!");
        } else{
            System.out.println("Classificação R!");
        }

        leitor.close();
    }
}




