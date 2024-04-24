package edu.up.classes;

public class Carro {
    private double dist;
    private double comb;

    public Carro(double dist, double comb) {
        this.dist = dist;
        this.comb = comb;
    }

    public double calcularConsumo() {
        return dist / comb;
    }
    

}
