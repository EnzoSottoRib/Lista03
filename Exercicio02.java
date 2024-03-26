import classes.Carro;
import java.util.Scanner;

public class Exercicio02{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        double dist;
        double comb;

        System.out.println("Digite a distância percorrida: ");
        dist = leitor.nextDouble();

        System.out.println("Digite a quantidade gasta de combustível: ");
        comb = leitor.nextDouble(); 
     
        Carro carro = new Carro(dist, comb);

        System.out.printf("O consumo médio em km/L é de : %.2f" , carro.calcularConsumo());

        leitor.close();

    }
}



