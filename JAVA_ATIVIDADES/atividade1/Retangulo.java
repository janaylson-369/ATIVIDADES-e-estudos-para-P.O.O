package atividade1;

/**Escreva um código em Java que apresente a classe Retangulo, com atributos comprimento,
 *  largura e os métodos calcularArea, calcularPerimetro e imprimir. O método imprimir deve mostrar 
 * na tela os valores de todos os atributos, e da área e perímetro calculados. Salienta-se que a área
 * de um retângulo é obtida pela fórmula (comprimento * largura) e o perímetro por (2 * comprimento) + (2 * largura). 
 * Crie uma classe principal para testar a classe Quadrado.
**/
public class Retangulo {
    private int comprimento, largura;

    public Retangulo(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea(){
        return comprimento * largura;
    }

    public int calcularPerimetro(){
        return 2 * (comprimento + largura);
    }

    public void imprimir(){
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Largura: " + largura);
    }

    public String toString(){
        return "Comprimento: " + comprimento + " Largura: " + largura + " Área: "
        + calcularArea() + " Perímetro: " + calcularPerimetro();
    }

}
