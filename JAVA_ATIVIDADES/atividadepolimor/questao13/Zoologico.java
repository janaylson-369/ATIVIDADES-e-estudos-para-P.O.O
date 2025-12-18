package atividadepolimor.questao13;

import java.util.ArrayList;
import java.util.List;
public class Zoologico {
    private List<Animal> listabixo;
    
    public Zoologico(){
        listabixo = new ArrayList<>();
    }   
    
    public void adicionar(Animal a){
        listabixo.add(a);
        
    }
    
    public void animarBicharada() {
        for (Animal a : listabixo) {
            a.andar(); // Cada um faz do seu jeito
            a.emitirSom(); //Polimorfismo
            
        }
    }
    
    public void atakelistabixo() {
        for (Animal a : listabixo) {
            a.atacar();
        }
    }
}

