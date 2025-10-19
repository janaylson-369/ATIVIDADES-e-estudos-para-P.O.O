package atividade4;

public class ControleRemoto {

     // O controle remoto tem uma referência para o televisor que ele controla
    private Televisor televisor;

    public ControleRemoto(Televisor televisor){
        this.televisor = televisor;
    }
    public void Ligar(){
        this.televisor.ligar();
    }
    public void Desligar(){
        this.televisor.desligar();
    }
    public void AumentarVolume(){
        this.televisor.aumentarVolume();
    }
    public void trocarCanal(int novoCanal){
        this.televisor.trocarCanal(novoCanal);
    }
}
