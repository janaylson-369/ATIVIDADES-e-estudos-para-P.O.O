public abstract class Manager {
    //atributos comuns: nome, número de corridas e valor total arrecadado
    String nome;
    int numerocorrida;
    double arrecadacao;

    public Manager(String nome, int numerocorrida, double arrecadacao) {
        this.nome = nome;
        this.numerocorrida = numerocorrida;
        this.arrecadacao = arrecadacao;
    }

    public String getnome() {
        return nome;
    }
    
    //
    public abstract double pagamentoMotorista();
    
    @Override
    public String toString() {
        return "Nome: " + nome +
            " | Corridas: " + numerocorrida +
            " | Arrecadado: R$ " + arrecadacao +
            " | Pagamento: R$ " + pagamentoMotorista();
    }
    
}