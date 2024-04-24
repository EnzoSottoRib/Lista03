import classes.Aluno;

import java.util.Scanner;

public class Exercicio24{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite a nota 1: ");
        aluno.nota1 = leitor.nextDouble();

        System.out.println("Digite a nota 2: ");
        aluno.nota2 = leitor.nextDouble();

        System.out.println("Digite a nota 3: ");
        aluno.nota3 = leitor.nextDouble();

        aluno.media = (((aluno.nota1 * 2) + (aluno.nota2 * 3) + (aluno.nota3 * 5))/(2 + 3 + 5));

        System.out.println("A média final é: " + aluno.media);

        leitor.close();
    }
}




