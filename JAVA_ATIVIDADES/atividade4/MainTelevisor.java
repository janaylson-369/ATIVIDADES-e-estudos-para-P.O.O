package atividade4;

public class MainTelevisor {
    public static void main(String[] args){
        Televisor televis = new Televisor(5, 10, false);
        ControleRemoto controle = new ControleRemoto(televis);

        System.out.println(televis);
        controle.Ligar();

        controle.AumentarVolume();
        controle.AumentarVolume();

        controle.trocarCanal(30);

        System.out.println(televis);
    }
    
}
