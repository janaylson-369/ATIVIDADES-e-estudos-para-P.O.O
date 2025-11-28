package atividademercadinho;

public class ClienteOuroVip extends Cliente {

    String numeroCartao;
    String endereco;

    public ClienteOuroVip(String nome, double valorDaCompra, String numeroCartao, String endereco) {
        super(nome, valorDaCompra);
        this.numeroCartao = numeroCartao;
        this.endereco = endereco;
    }


    public double calcularPagamento() {
        return valorDaCompra * 0.85;
    }


    public String toString() {
        return "VIPouro " + super.toString() +", Cartão: " + numeroCartao +", Endereço: " + endereco +
            ", total: R$ " + calcularPagamento();
    }
}
