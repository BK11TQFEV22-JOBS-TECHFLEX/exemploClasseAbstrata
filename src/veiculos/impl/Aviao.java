package veiculos.impl;

import veiculos.Veiculo;

public class Aviao extends Veiculo {
    public Aviao(int numeroPassageiros, double velicidadeMaxima) {
        super("QueroseneDeAviacao", numeroPassageiros, velicidadeMaxima);
    }

    @Override
    public void transportar() {
         System.out.println("Aviao transportando");           
    }    
}
