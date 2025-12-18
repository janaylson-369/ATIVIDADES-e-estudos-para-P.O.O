package atividadefrete;

public class FreteSuperExpresso extends Frete implements Fretavel {
    private double valordoseguro;
    private int nivelurgencia;

    public FreteSuperExpresso(int km, double valorporkm, double valordoseguro, int nivelurgencia) {
        super(km, valorporkm);
        this.valordoseguro = valordoseguro;
        this.nivelurgencia = nivelurgencia;
    }

    @Override
    public double calcularFrete() {
        return (getKm() * getValorporkm()) + (nivelurgencia * 100) + valordoseguro;
    }
    @Override
    public String toString() {
        return "valor do frete Super Expresso:" + calcularFrete()+ "\n";
    }
}
