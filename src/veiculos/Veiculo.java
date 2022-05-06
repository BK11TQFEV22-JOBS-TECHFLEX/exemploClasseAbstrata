package veiculos;

public abstract class Veiculo {
    private String _tipoCombustivel;
    private int _numeroPassageiros;
    private double _velicidadeMaxima;

    protected Veiculo(String tipoCombustivel, int numeroPassageiros, double velicidadeMaxima) {
        _tipoCombustivel = tipoCombustivel;
        _numeroPassageiros = numeroPassageiros;
        _velicidadeMaxima = velicidadeMaxima;
    }

    public String getTipoCombustivel() {
        return _tipoCombustivel;
    }

    public int getNumeroPassageiros() {
        return _numeroPassageiros;
    }

    public double getVelicidadeMaxima() {
        return _velicidadeMaxima;
    }

    public abstract void transportar();
}
