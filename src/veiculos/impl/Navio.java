package veiculos.impl;

import veiculos.Veiculo;

public class Navio extends Veiculo {

    public Navio(int numeroPassageiros, double velicidadeMaxima) {
        super("Diesel", numeroPassageiros, velicidadeMaxima);
    }

    @Override
    public void transportar() {
        System.out.println("Navio transportando");       
    }
}