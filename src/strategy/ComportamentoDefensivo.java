package strategy;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void executar() {
        System.out.println("Movendo defensivamente...");
    }
}

