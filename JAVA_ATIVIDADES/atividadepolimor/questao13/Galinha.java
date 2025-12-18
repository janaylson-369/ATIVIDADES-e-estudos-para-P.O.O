package atividadepolimor.questao13;

public class Galinha implements Animal {
    public void andar(){
        System.out.println("Algoritmo que imita uma galinha andando....");
    }
    
    public void emitirSom() {
        System.out.println("Cocoricó....");
    }
    public void atacar() {
        System.out.println("------------------GALINHA ATACANDO -------------------");
        System.out.println("Bicada, bicada, bicada...");
    }
}
