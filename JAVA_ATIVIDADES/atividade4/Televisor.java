package atividade4;

/*Defina uma classe Televisor com os atributos: canal, volume e ligado.
Inclua na classe um construtor, os métodos ligar, desligar, aumentarVolume,
diminuirVolume, trocarCanal e o método toString() para retornar a 
representação textual do objeto. */
public class Televisor {
    private int canal;
    private int volume; 
    private boolean ligado;

    // construtor
    public Televisor(int canal, int volume, boolean ligado) {
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    // GET E SET
    public int getCanal() {
        return canal;
    }
    public int getVolume() {
        return volume;
    }
    public boolean isLigado() { // booleanos é is em vez de get
        return ligado;
    }

    /**
     * CORRIGIDO: Liga a TV, mas apenas se ela estiver desligada.
     */
    public void ligar() {
        // 1. Primeiro, VERIFICA se a TV está desligada
        if (!this.ligado) {
            // 2. Se estiver, MUDA o estado para ligada
            this.ligado = true;
            System.out.println("TV ligada.");
        } else {
            System.out.println("A TV já estava ligada.");
        }
    }

    /**
     * CORRIGIDO: Desliga a TV, mas apenas se ela estiver ligada.
     */
    public void desligar() {
        if (this.ligado) {
            
            this.ligado = false;
            System.out.println("TV desligada.");
        } else {
            System.out.println("A TV já estava desligada.");
        }
    }

    /**
     * Aumenta o volume se a TV estiver ligada.
     */
    public void aumentarVolume() {
        if (this.ligado) {
            if (this.volume < 100) {
                this.volume++;
                System.out.println("Volume: " + this.volume);
            } else {
                System.out.println("Volume no máximo!");
            }
        } else {
            System.out.println("Não pode aumentar o volume, a TV está desligada.");
        }
    }

    /**
     * Troca o canal se a TV estiver ligada.
     */
    public void trocarCanal(int novoCanal) {
        if (this.ligado) {
            this.canal = novoCanal;
            System.out.println("Canal mudado para " + this.canal);
        } else {
            System.out.println("Não pode trocar o canal, a TV está desligada.");
        }
    }

    @Override
    public String toString() {
        String estado = this.ligado ? "Ligada" : "Desligada";
        return String.format(" Estado: %s, Canal:%d, Volume: %d", estado, this.canal, this.volume);
    }

}
