package atividadepolimor.questao12;

public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String cpf;

    public Empregado(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    // Método abstrato: obriga as subclasses a implementarem a lógica
    public abstract double vencimento();

    // Getters para acesso nas outras classes
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }
    
    // Método toString para facilitar a exibição
    @Override
    public String toString() {
        return "Nome: " + nome + " " + sobrenome + " | CPF: " + cpf;
    }
}