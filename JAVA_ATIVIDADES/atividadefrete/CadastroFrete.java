package atividadefrete;

import java.util.ArrayList;

public class CadastroFrete {

    private ArrayList <Fretavel> listfretes;

    public CadastroFrete () {
        listfretes = new ArrayList<>();
    }

    public void cadastroDeFretes (Fretavel frete){
        listfretes.add(frete);
    }

    public double calcularTotal(){
        double calculototal = 0;
        for (Fretavel m : listfretes){
            calculototal += m.calcularFrete();  //Polimorfismo
        }
        return calculototal;
    }

    public void imprimirfretes() {
        for (Fretavel m : listfretes) {
            System.out.printf(m.toString());// polimorfismo
        }
        System.out.printf("\nValor total de fretes:" + calcularTotal());

    }
}
