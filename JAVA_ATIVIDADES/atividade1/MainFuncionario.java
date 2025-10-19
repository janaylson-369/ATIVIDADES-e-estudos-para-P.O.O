package atividade1;

/*
 * Na classe principal, crie um funcionário e logo em seguida, mostre seus dados iniciais. 
 * Após alterar seu salário por um valor digitado pelo usuário, calcule seu salário líquido,   
 *  mostrando novamente suas informações, inclusive este último dado.
 */
public class MainFuncionario {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario(1, "Zezinho", "1234567890", "Rua das Flores, 123", "1234567890", 20, 1000);
        System.out.println("Salário líquido: " + funcionario.calculaSalarioLiquido());
        System.out.println(funcionario.toString());
        funcionario.setSalario(2899.99f);
        System.out.println("Novo salário líquido: " + funcionario.calculaSalarioLiquido());
        funcionario.setNome("Lorenzo");
        funcionario.setCPF("278298");       
        funcionario.setEndereco("Rua das bixa, 379");
        System.out.println(funcionario.toString());
    }
}
