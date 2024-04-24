import classes.Aluno;
import java.util.Scanner;

public class Exercicio01{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        Aluno aluno1 = new Aluno();

        aluno1.notas = new double[3];
        
        double media = 0;
        
        int i;
        
        System.out.println("Digite o nome: ");
        aluno1.setNome(leitor.nextLine());
        
        for(i=0; i<3; i++){
            System.out.println("Digite a nota " + (i + 1) + ": ");
            aluno1.notas[i] = leitor.nextDouble();
        }

        for(i=0; i<3; i++){
            media = media + aluno1.notas[i];
        }
     
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Média: " + media/3);
     
        leitor.close();

    }
}


