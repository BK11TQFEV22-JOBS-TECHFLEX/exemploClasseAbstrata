import veiculos.impl.Aviao;
import veiculos.impl.Navio;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Navio n = new Navio(600, 100);
        n.transportar();

        Aviao a = new Aviao(100, 900);
        a.transportar();
    }
}
