package atividademercadinho;

public class ClienteOuroVip extends Cliente {

    private String numeroCartao;
    private String endereco;

    public ClienteOuroVip(String nome, double valorDaCompra, String numeroCartao, String endereco) {
        super(nome, valorDaCompra);
        this.numeroCartao = numeroCartao;
        this.endereco = endereco;
    }

    @Override
    public double calcularPagamento() {
        return valorDaCompra * 0.85;
    }

    @Override
    public String toString() {
        return "VIPouro " + super.toString() +", Cartão: " + numeroCartao +", Endereço: " + endereco +
            ", total: R$ " + calcularPagamento();
    }
}
