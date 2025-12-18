package atividadefrete;

public abstract class Frete {
    protected int km;
    protected double valorporkm;

    public Frete(int km, double valorporkm) {
        this.km = km;
        this.valorporkm = valorporkm;
    }

    public double getValorporkm() {
        return valorporkm;
    }

    public int getKm() {
        return km;
    }
}
