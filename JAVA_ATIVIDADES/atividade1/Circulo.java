package atividade1;

/*
 * Escreva um código em Java que apresente a classe Circulo, com o atributo raio e 
 * os métodos calcularArea, calcularPerimetro e imprimir. O método imprimir deve mostrar 
 * na tela os valores de todos os atributos, e da área e perímetro calculados. Salienta-se
 *  que a área de um círculo é obtida pela fórmula (pi * raio * raio) e o perímetro por 
 * (2 * pi * raio), onde pi = 3,141516.
 * Crie uma classe principal para testar a classe Circulo.
 */
public class Circulo {
    private double raio;// atributo raio double é um numero decimal

    public Circulo(double raio){
        this.raio = raio;
    }
    
    public double calcularArea(){
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }

    public void imprimir(){
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    
}
