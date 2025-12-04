public class PrincipalTransporte {
    /*
    
    */
    
    public static void main(String[] args) {
        //Crie um objeto da classe EmpresaTransporte;
        EmpresaTransporte e = new EmpresaTransporte();

        //Cadastre pelo menos 5 motoristas de diferentes categorias;
        e.cadastrarMotorista(new MotoristaIniciante("Jogador", 10, 200.00));
        e.cadastrarMotorista(new MotoristaIniciante("Zézinho", 12, 150.00));
        e.cadastrarMotorista(new MotoristaExperiente("Zé", 10, 300.00, 4.7));
        e.cadastrarMotorista(new MotoristaElite("Lilit", 10, 400.00, 10, 4.7));
        e.cadastrarMotorista(new MotoristaElite("Leilane", 15, 450.00, 16, 4.7));

        //Exiba o relatório completo de motoristas;Exiba o relatório completo de motoristas;
        e.relatorioMotorista();

        //Mostre o valor total que a empresa deve pagar a todos os motoristas;
        e.calcularTotal();

        //Pesquise um motorista pelo nome;
        System.out.println("--------------- PESQUISANDO MOTORISTA ----------------");
        e.pesqMotorista("Zé");
        System.out.println("--------------- FIM DA PESQUISA ----------------");

        //Exclua um motorista pelo nome;
        System.out.println("--------------- EXCLUINDO MOTORISTA ----------------");

        if (e.excluirMotoristaPeloNome("Zé")) {
            System.out.println("Motorista removido!");
        } else {
            System.out.println("Motorista não encontrado!");
        }


        //Mostre o relatório completo de motoristas;
        System.out.println("--------------- RELATÓRIO COMPLETO DEPOIS DA EXCLUSÃO D0 MOTORISTA ----------------");
        e.relatorioMotorista();
        System.out.println("--------------- FIM DO RELATÓRIO ----------------");

        //Explique onde está acontecendo o polimorfismo.
        System.out.println("--------------- POLIMORFISMO ----------------");
        System.out.println("O polimorfismo está acontecendo quando um metodo sobrescrito então é chamado através de uma referência da classe Manager, mas é executado com a implementação das classes filhas.");
        
    }
    
    
}
