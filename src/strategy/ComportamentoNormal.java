package strategy;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void executar() {
        System.out.println("Movendo de forma normal...");
    }
}

