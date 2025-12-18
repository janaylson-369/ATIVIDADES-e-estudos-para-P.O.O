package atividadepolimor.questao13;

public class Papagaio implements Animal{
    public void andar(){
        System.out.println("Andando igual a um papagaio!");
    }
    
    public void emitirSom() {
        System.out.println("Som do papagaio falante...");
    }
    public void atacar() {
        System.out.println("------------------PAPAGUAIO ATACANDO -------------------");
        System.out.println("Bica, bica, bica...");
    }
}

