package atividadepolimor.questao12;

import java.util.ArrayList;
import java.util.List;

public class FolhaDePagamento {
    private List<Empregado> funcionarios;

    public FolhaDePagamento() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Empregado novoFuncionario) {
        // Verificação de duplicidade (requisito da questão)
        for (Empregado e : funcionarios) {
            if (e.getCpf().equals(novoFuncionario.getCpf())) {
                System.out.println("Erro: Funcionário com CPF " + e.getCpf() + " já está na folha.");
                return; // Sai do método sem adicionar
            }
        }
        
        funcionarios.add(novoFuncionario);
        System.out.println("Funcionário " + novoFuncionario.getNome() + " adicionado.");
    }

    public void exibirTodos() {
        System.out.println("\n--- Lista de Funcionários ---");
        for (Empregado e : funcionarios) {
            // Aqui chamamos o vencimento()
            System.out.println(e.toString() + " | Vencimento: R$ " + e.vencimento());
        }
        System.out.println("valor total da folha de pagamento:" + calcularValorTotal());
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Empregado e : funcionarios) {
            total += e.vencimento(); // A mágica do polimorfismo acontece aqui
        }
        return total;
    }
}
