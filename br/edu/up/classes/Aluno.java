package classes;

public class Aluno {
    private String nome;

    public double[] notas;

    public double nota1;

    public double nota2;

    public double nota3;

    public double media;

    public int matricula;

    public Aluno(){
    }

    //constructor
    public Aluno(String nome){
        this.nome = nome;
    }

    //getter
    public String getNome(){
        return nome;
    }
    
    //setter
    public void setNome(String nome){
        this.nome = nome;
    }

}
