package atividadefrete;

public class FreteExpresso extends Frete implements Fretavel {
    private int nivelurgencia;

    public FreteExpresso(int km, double valorporkm, int nivelurgencia) {
        super(km, valorporkm);
        this.nivelurgencia = nivelurgencia;
    }

    @Override
    public double calcularFrete() {
        return (getKm() * getValorporkm()) + (nivelurgencia * 100);
    }
    @Override
    public String toString() {
        return "valor do frete Expresso:" + calcularFrete()+ "\n";
    }
}