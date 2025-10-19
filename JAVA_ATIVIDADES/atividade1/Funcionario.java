package atividade1;

public class Funcionario{
    private int codigo;// atributos
    private String nome, CPF, endereco, telefone;
    private int idade;
    private float salario;

    // construtor Funcionario. o que o construtor faz é inicializar os atributos da classe.
    public Funcionario(int codigo, String nome, String CPF, String endereco, String telefone, int idade, float salario){
        this.codigo = codigo;
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo(){// metodo getCodigo. o que o metodo getCodigo faz é retornar o valor do atributo codigo.
        return codigo;
    }

    public String getNome(){// metodo getNome. o que o metodo getNome faz é retornar o valor do atributo nome.
        return nome;
    }

    public void setCodigo(int codigo){// metodo setCodigo. o que o metodo setCodigo faz é atribuir um valor ao atributo codigo.
        this.codigo = codigo;
    }

    public void setNome(String nome) {// metodo setNome. o que o metodo setNome faz é atribuir um valor ao atributo nome.
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float calculaSalarioLiquido(){// metodo calculaSalarioLiquido. o que o metodo calculaSalarioLiquido faz é calcular o salario liquido do funcionario.
        return salario - (salario * 11/100);// 11% de desconto para o INSS
    }

    public String toString(){// metodo toString
        return String.format("Código: %d Nome: %s CPF: %s Endereço: %s Telefone: %s Idade: %d Salário: %.2f",
        getCodigo(), getNome(), getCPF(), getEndereco(), getTelefone(), getIdade(), calculaSalarioLiquido());
    }
}
