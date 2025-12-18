package atividadepolimor.questao12;

public class Principal {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();

        Assalariado a = new Assalariado("João", "null", "null", 1000.00);
        Comissionado c = new Comissionado("Zé", "Da Manga", "nullrr", 30, 20);
        Horista h = new Horista("Nine", "nulla", "nullbb", 200, 8);

        folha.adicionarFuncionario(c);
        folha.adicionarFuncionario(a);
        folha.adicionarFuncionario(h);

        folha.exibirTodos();

        
    }
}
