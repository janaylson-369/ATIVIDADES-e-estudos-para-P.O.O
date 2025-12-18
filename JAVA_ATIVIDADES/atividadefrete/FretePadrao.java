package atividadefrete;

public class FretePadrao extends Frete implements Fretavel {
    public FretePadrao(int km, double valorporkm) {
        super(km, valorporkm);
    }

    @Override
    public double calcularFrete() {
        return getKm() * getValorporkm();
    }
    @Override
    public String toString() {
        return "valor do frete Padrão:" + calcularFrete()+"\n";
    }
}
