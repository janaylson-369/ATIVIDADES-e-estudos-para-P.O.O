package atividademercadinho;

public class ClienteVip extends Cliente {

    private String numeroCartao;

    public ClienteVip(String nome, double valorDaCompra, String numeroCartao) {
        super(nome, valorDaCompra);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public double calcularPagamento() {
        return valorDaCompra * 0.90;
    }

    @Override
    public String toString() {
        return "VIP " + super.toString() + ", Cartão: " + numeroCartao + ", Total a pagar: R$ " + calcularPagamento();
    }
}

