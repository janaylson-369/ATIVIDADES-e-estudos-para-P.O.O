package atividadepolimor.questao11;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeDesenhos {
    // Atributo: Lista que aceita qualquer objeto que implemente a interface Desenho
    private List<Desenho> desenhos;

    public CadastroDeDesenhos() {
        this.desenhos = new ArrayList<>();
    }

    // Método para adicionar: Aceita Retangulo, Circulo, Pessoa, etc.
    public void adicionarDesenho(Desenho d) {
        this.desenhos.add(d);
    }

    // Método que percorre a lista e chama o desenhar() de cada um
    public void desenharTodos() {
        System.out.println("--- Iniciando os desenhos ---");
        for (Desenho d : desenhos) {
            d.desenhar(); // O polimorfismo acontece aqui!
        }
    }
}
