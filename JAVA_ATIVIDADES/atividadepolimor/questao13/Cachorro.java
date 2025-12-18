package atividadepolimor.questao13;

public class Cachorro implements Animal{
    
    public void andar() {
        System.out.println("Cachorro andando igual a cachorro");
    }

    public void emitirSom() {
        System.out.println("Au, au! Au, au...");
    }

    public void atacar() {
        System.out.println("------------------CACHORRO ATACANDO -------------------");
        System.out.println("Morde, morde, morde...");
    }
}

