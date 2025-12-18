package atividadepolimor.questao11;

public class Principal {
    public static void main(String[] args) {
        // 1. Instanciar o cadastro
        CadastroDeDesenhos cadastro = new CadastroDeDesenhos();

        // 2. Instanciar objetos concretos
        Retangulo retangulo = new Retangulo();
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Pessoa pessoa = new Pessoa();

        // 3. Adicionar ao cadastro
        cadastro.adicionarDesenho(retangulo);
        cadastro.adicionarDesenho(circulo);
        cadastro.adicionarDesenho(quadrado);
        cadastro.adicionarDesenho(pessoa);

        // 4. Chamar o método para desenhar todos
        cadastro.desenharTodos();
    }
}