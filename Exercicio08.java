import classes.Aluno;

import java.util.Scanner;

public class Exercicio08{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome: ");
        aluno.nome = leitor.nextLine();

        System.out.println("Digite a nota 1: ");
        aluno.nota1 = leitor.nextDouble();

        System.out.println("Digite a nota 2: ");
        aluno.nota2 = leitor.nextDouble();

        System.out.println("Digite a nota 3: ");
        aluno.nota3 = leitor.nextDouble();

        aluno.media = (aluno.nota1 + aluno.nota2 + aluno.nota3)/3;

        System.out.println("Aluno: " + aluno.nome);
        if(aluno.media <= 5){
            System.out.println("Reprovado!");
        } else if(aluno.media > 5 && aluno.media < 7){
            System.out.println("Recuperação!");
        } else{
            System.out.println("Aprovado!");
        }

        leitor.close();

    }
}



