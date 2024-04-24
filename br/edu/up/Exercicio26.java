package edu.up;
import classes.Pessoas;

import java.util.Scanner;

public class Exercicio26{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Pessoas pessoa = new Pessoas();

        System.out.println("Digite o nome: ");
        pessoa.nome = leitor.nextLine();

        System.out.println("Digite a idade: ");
        pessoa.idade = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Digite o grupo de risco (Baixo/Medio/Alto): ");
        pessoa.gdr = leitor.nextLine();

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        if(pessoa.idade < 17 || pessoa.idade > 70){
            System.out.println("Não se enquadra em nenhuma das categorias ofertadas!");
        } else if(pessoa.idade >= 17 && pessoa.idade <= 20){
            if(pessoa.gdr.equalsIgnoreCase("baixo")){
                System.out.println("Categoria 1");
            } else if(pessoa.gdr.equalsIgnoreCase("medio")){
                System.out.println("Categoria 2");
            } else {
                System.out.println("Categoria 3");
            }
        } else if(pessoa.idade >= 21 && pessoa.idade <= 24){
            if(pessoa.gdr.equalsIgnoreCase("baixo")){
                System.out.println("Categoria 2");
            } else if(pessoa.gdr.equalsIgnoreCase("médio") || pessoa.gdr.equalsIgnoreCase("medio")){
                System.out.println("Categoria 3");
            } else {
                System.out.println("Categoria 4");
            }
        } else if(pessoa.idade >= 25 && pessoa.idade <= 34){
            if(pessoa.gdr.equalsIgnoreCase("baixo")){
                System.out.println("Categoria 3");
            } else if(pessoa.gdr.equalsIgnoreCase("médio") || pessoa.gdr.equalsIgnoreCase("medio")){
                System.out.println("Categoria 4");
            } else {
                System.out.println("Categoria 5");
            }
        } else if(pessoa.idade >= 35 && pessoa.idade <= 64){
            if(pessoa.gdr.equalsIgnoreCase("baixo")){
                System.out.println("Categoria 4");
            } else if(pessoa.gdr.equalsIgnoreCase("médio") || pessoa.gdr.equalsIgnoreCase("medio")){
                System.out.println("Categoria 5");
            } else {
                System.out.println("Categoria 6");
            }
        } else if(pessoa.idade >= 65 && pessoa.idade <= 70){
            if(pessoa.gdr.equalsIgnoreCase("baixo")){
                System.out.println("Categoria 7");
            } else if(pessoa.gdr.equalsIgnoreCase("médio") || pessoa.gdr.equalsIgnoreCase("medio")){
                System.out.println("Categoria 8");
            } else {
                System.out.println("Categoria 9");
            }
        }
        
        leitor.close();
    }
}




