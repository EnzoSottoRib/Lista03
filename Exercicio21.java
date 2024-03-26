import classes.Pessoas;

import java.util.Scanner;

public class Exercicio21{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Pessoas pessoa = new Pessoas();

        System.out.println("Digite a idade do nadador: ");
        pessoa.idade = leitor.nextInt();

        if(pessoa.idade >= 5 && pessoa.idade <=7){
            System.out.println("Categoria infantil A!");
        } else if(pessoa.idade >= 8 && pessoa.idade <= 10){
            System.out.println("Categoria infantil B!");
        } else if(pessoa.idade >= 11 && pessoa.idade <= 13){
            System.out.println("Categoria juvenil A!");
        } else if(pessoa.idade >= 14 && pessoa.idade <= 17){
            System.out.println("Categoria juvenil B!");
        } else if(pessoa.idade >= 18 && pessoa.idade<= 25){
            System.out.println("Categoria sênior");
        } else{
            System.out.println("Idade fora da faixa etária!");
        }

        leitor.close();
    }
}




