package strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void executar() {
        System.out.println("Movendo agressivamente...");
    }
}

