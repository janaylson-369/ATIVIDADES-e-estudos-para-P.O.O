package atividademercadinho;

public abstract class Cliente {

    String nome;
    double valorDaCompra;

    public Cliente(String nome, double valorDaCompra) {
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }
    //
    public abstract double calcularPagamento();

    public double getValorDaCompra() {
        return valorDaCompra;
    }
    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Nome: " + nome + ", Valor da compra: R$ " + valorDaCompra;
    }
}

